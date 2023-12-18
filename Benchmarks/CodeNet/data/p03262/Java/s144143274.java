import java.util.*;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int X = sc.nextInt();
        ArrayList<Integer> x = new ArrayList<>(); 
        ArrayList<Integer> diff = new ArrayList<>(); 

        for (int i = 0; i<N; i++) {
            x.add(sc.nextInt());
        }
        x.add(X);

        Collections.sort(x);

        for (int i = 0; i<x.size()-1; i++) {
            diff.add(x.get(i+1) - x.get(i));
        }

        int result = diff.get(0);
        for (int i = 1; i<diff.size(); i++) {
            result = calcGCD(result, diff.get(i));
        }

        System.out.println("Yes");
    }

    static int calcGCD(int x, int y) {
        if (x > y) {
            return calcGCD(y, x);
        }

        if (x == 0) {
            return y;
        }

        return calcGCD(x, y - x);
    }
}