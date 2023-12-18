import java.util.ArrayList;
import java.util.List;
import java.util.Set;
import java.util.HashMap;
import java.util.Scanner;
import java.util.Map;

public class Main {

    private static final String HONEST = "honesty";
    private static final String LIER = "lier";

    public static void main(String[] args) {
        Map<Integer, String> stateMap = new HashMap<>();
        Map<Integer, Map<Integer, String>> tesinomyMap = new HashMap<>();
        int peopleCount = 1;
        int honestyMax = 0;

        Scanner sc = new Scanner(System.in);
        String S = sc.nextLine();
        int N = Integer.parseInt(S);
        int[] peoples = new int[N];

        for (int i = 1; i <= N; i++) {
            stateMap.put(i, "");
            peoples[i - 1] = i;
        }

        while (sc.hasNext()) {
            int m = Integer.parseInt(sc.nextLine());
            Map<Integer, String> tesinomy = new HashMap<>();
            String division = LIER;
            // System.out.println("people " + peopleCount + " said....");
            for (int i = 0; i < m; i++) {
                String[] said = sc.nextLine().split(" ");
                if (said[1].equals("1")) {
                    division = HONEST;
                } else {
                    division = LIER;
                }

                // System.out.println("said: " + said[0] + ", division : " + division);
                tesinomy.put(Integer.parseInt(said[0]), division);
            }
            tesinomyMap.put(peopleCount, tesinomy);
            peopleCount++;
            // if (peopleCount >= N + 1) {
            // break;
            // }

        }
        sc.close();

        // bit全探索
        for (int i = 0; i < Math.pow(N, 2); i++) {
            List<Integer> honesties = new ArrayList<>();
            for (Integer integer : stateMap.keySet()) {
                stateMap.put(integer, "");
            }
            for (int j = 0; j < N; j++) {
                if ((1 & i >> j) == 1) {
                    honesties.add(peoples[j]);
                }
            }
            if (honesties.size() == 0) {
                continue;
            }
            boolean isOK = true;
            for (int k = 1; k <= N; k++) {
                boolean isHonesty = false;
                if (honesties.contains(k)) {
                    isHonesty = true;
                }
                Map<Integer, String> tesinomy = tesinomyMap.get(k);
                Set<Integer> ps = tesinomy.keySet();
                String own = stateMap.get(k);
                String ownstate = isHonesty ? HONEST : LIER;
                if (own.equals("")) {
                    stateMap.put(k, ownstate);
                } else {
                    if (!own.equals(ownstate)) {
                        isOK = false;
                        break;
                    }
                }
                for (Integer judger : ps) {
                    String state = stateMap.get(judger);
                    String saidState = tesinomy.get(judger);
                    if (!isHonesty) {
                        if (saidState.equals(HONEST)) {
                            saidState = LIER;
                        } else {
                            saidState = HONEST;
                        }
                    }
                    if (state.equals("")) {
                        stateMap.put(judger, saidState);
                    } else {
                        if (!state.equals(saidState)) {
                            isOK = false;
                            break;
                        }
                    }
                }
                if (!isOK) {
                    break;
                }
            }
            if (isOK) {
                if (honestyMax <= honesties.size()) {
                    honestyMax = honesties.size();
                }
            }
        }

        System.out.println(honestyMax);
    }

}