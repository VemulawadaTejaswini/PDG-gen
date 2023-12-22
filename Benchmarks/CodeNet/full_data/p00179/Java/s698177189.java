import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.Queue;
import java.util.Scanner;
import java.util.Set;

class History {
    private int wormHash;
    private History prev;

    public History(int wormHash, History prev) {
        this.wormHash = wormHash;
        this.prev = prev;
    }

    public int getStep() {
        int count = 0;

        History h = this;
        while (h != null) {
            count++;
            h = h.prev;
        }

        return count;
    }

    public List<Integer> getStepList() {
        List<Integer> stepList = new ArrayList<Integer>();
        History h = this;

        while (h != null) {
            stepList.add(h.wormHash);
            h = h.prev;
        }

        Collections.reverse(stepList);

        return stepList;
    }

    public int getWormHash() {
        return wormHash;
    }
}

public class Main {
    private static final int R = 1;
    private static final int G = 2;
    private static final int B = 4;

    private static final int ALL_COLOR = R | G | B;

    private static Map<String, Integer> STR_TO_RGB = new HashMap<String, Integer>();
    private static Map<Integer, String> RGB_TO_STR = new HashMap<Integer, String>();

    static {
        STR_TO_RGB.put("r", R);
        STR_TO_RGB.put("g", G);
        STR_TO_RGB.put("b", B);

        for (Map.Entry<String, Integer> e: STR_TO_RGB.entrySet()) {
            RGB_TO_STR.put(e.getValue(), e.getKey());
        }
    }

    private List<Integer> genWormFromString(String wormStr) {
        List<Integer> worm = new ArrayList<Integer>();
        for (char c: wormStr.toCharArray()) {
            worm.add(STR_TO_RGB.get(c + ""));
        }
        return worm;
    }

    private int calcWormHash(List<Integer> worm) {
        int hash = 0;

        for (int w: worm) {
            hash = (hash << 3) | w;
        }

        return hash;
    }

    private List<Integer> wormHashToWorm(int wormHash) {
        List<Integer> worm = new ArrayList<Integer>();

        while (wormHash > 0) {
            worm.add(wormHash & ALL_COLOR);
            wormHash = wormHash >> 3;
        }

        Collections.reverse(worm);

        return worm;
    }

    private String dumpWrom(List<Integer> worm) {
        StringBuilder sb = new StringBuilder();

        for (int w: worm) {
            sb.append(RGB_TO_STR.get(w));
        }

        return sb.toString();
    }

    private boolean isGoal(List<Integer> worm) {
        int state = 0;

        for (int w: worm) {
            state |= w;
        }

        if (state == R || state == G || state == B) {
            return true;
        }

        return false;
    }

    private History solveHelper(String wormStr) {
        int initialWormHash = calcWormHash(genWormFromString(wormStr));

        Set<Integer> visited = new HashSet<Integer>();
        visited.add(initialWormHash);

        Queue<History> queue = new LinkedList<History>();
        queue.add(new History(initialWormHash, null));

        while (!queue.isEmpty()) {
            History h = queue.poll();

            List<Integer> worm = wormHashToWorm(h.getWormHash());
            if (isGoal(worm)) {
                return h;
            } else {
                for (int i = 0, j = 1; i < worm.size() - 1; i++, j++) {
                    int iColor = worm.get(i);
                    int jColor = worm.get(j);
                    if (iColor != jColor) {
                        int newColor = ALL_COLOR ^ (iColor | jColor);
                        worm.set(i, newColor);
                        worm.set(j, newColor);

                        int wormHash = calcWormHash(worm);
                        if (!visited.contains(wormHash)) {
                            visited.add(wormHash);
                            queue.add(new History(wormHash, h));
                        }

                        worm.set(i, iColor);
                        worm.set(j, jColor);
                    }
                }
            }
        }
        return null;
    }

    private void printAnswer(List<Integer> stepList) {
        for (int wormHash: stepList) {
            List<Integer> worm = wormHashToWorm(wormHash);
            System.out.println(dumpWrom(worm));
        }
    }

    public void solve(String wormStr) {
        History h = solveHelper(wormStr);

        if (h == null) {
            System.out.println("NA");
        } else {
            int count = h.getStep() - 1;
            //printAnswer(h.getStepList());
            System.out.println(count);
        }
    }

    public static void main(String[] args) {
        Main solver = new Main();

        Scanner scanner = new Scanner(System.in);
        while (scanner.hasNextLine()) {
            String wormStr = scanner.nextLine();
            if (!wormStr.equals("0")) {
                solver.solve(wormStr);
            }
        }
    }
}