import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        ArrayList<Integer> a = new ArrayList<>();
        ArrayList<Integer> b = new ArrayList<>();

        for (int i = 0; i < n; i++) {
            a.add(sc.nextInt());
            b.add(sc.nextInt());
        }

        long point = 0;

        for(int i = 0; i < n; i++) {
            if (i % 2 == 0) { // takahashi
                int j = Main.max(a, b);
                point += a.get(j);
                a.remove(j);
                b.remove(j);
            } else {
                int j = Main.max(b, a);
                point -= b.get(j);
                a.remove(j);
                b.remove(j);
            }
        }

        System.out.println(point);
    }
    
    static int max(ArrayList<Integer> a, ArrayList<Integer> b) {
        int max = a.get(0);
        int maxNum = 0;
        for (int j = 1; j < a.size(); j++) {
            if (max < a.get(j)) {
                max = a.get(j);
                maxNum = j;
            } else if (max == a.get(j) && b.get(j) > b.get(maxNum)) {
                max = a.get(j);
                maxNum = j;
            }
        }
        return maxNum;
    }
}