import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class Main {
    static Scanner input = new Scanner(System.in);
    private static java.io.PrintWriter out = new java.io.PrintWriter(System.out);   

    public static void main(String[] args) {
        solve();
        out.flush();
    }    
    private static void solve() {
        ArrayList<Integer> point=new ArrayList<>();
        int n = input.nextInt();
        while (n != 0) {
            ArrayList<Integer> a = arrayInput(n);
            Collections.sort(a);
            a.remove(0);
            a.remove(a.size()-1);
            point.add((int)calculateAverage(a));
            n = input.nextInt();
        }
        for (int m: point
             ) {
            out.println(m);
        }
    }    

    private static ArrayList<Integer> arrayInput(int n) {
        ArrayList<Integer> a = new ArrayList<>();
        for (int i = 0; i < n; i++)
        a.add(input.nextInt());
        return a;
    }

    private static double calculateAverage(ArrayList<Integer> marks) {
        Integer sum = 0;
        if(!marks.isEmpty()) {
            for (Integer mark : marks) {
                sum += mark;
            }
            return sum.doubleValue() / marks.size();
        }
        return sum;
    }
}
