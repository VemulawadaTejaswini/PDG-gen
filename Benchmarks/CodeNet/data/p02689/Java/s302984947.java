import java.util.*;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = Integer.parseInt(scanner.next());
        int m = Integer.parseInt(scanner.next());
        Long[] tenbodai = new Long[n];
        HashMap<Integer,ArrayList<Integer>> ways = new HashMap<>();
        ArrayList<Integer> temp = new ArrayList<>();
        for (int i = 0; i < n; i++) {
            tenbodai[i] = Long.parseLong(scanner.next());
            ways.put(i,temp);
        }
        int ai,bi;
        for (int i = 0; i < m; i++) {
            ai = Integer.parseInt(scanner.next());
            bi = Integer.parseInt(scanner.next());
            ways.get(ai-1).add(bi-1);
            ways.get(bi-1).add(ai-1);
        }
        int count = 0;
        boolean tempBool = true;
        long tempTenbodaiHeight;
        for (int i = 0; i < n; i++) {
            tempTenbodaiHeight = tenbodai[i];
            for (Integer integer : ways.get(i)) {
                if (tempTenbodaiHeight < integer) {
                    tempBool = false;
                    break;
                }
            }
            if (tempBool) {
                count++;
            } else {
                tempBool = true;
            }
        }
        System.out.println(count);
    }
}