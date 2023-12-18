import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    static StringBuilder sb = new StringBuilder();
    static int count = 0;
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        ArrayList<Integer> b = new ArrayList<>();
        for (int i = 0; i < n; i++) {
            b.add(sc.nextInt());
        }
        cutter(b, 1);
        if(count == n) {
            System.out.println(sb);
        } else {
            System.out.println(-1);
        }
    }
    public static void cutter(ArrayList<Integer> arr, int cutnum) {
        ArrayList<Integer> next = new ArrayList<>();
        int size = arr.size();
        for(int i = size-1; i >=0; i--) {
            if(arr.get(i)==cutnum) {
                sb.append(cutnum);
                sb.append("\n");
                count+=1;
                cutter(next, cutnum+1);
                next = new ArrayList<>();
            } else {
                next.add(0, arr.get(i));
            }
        }
    }
}
