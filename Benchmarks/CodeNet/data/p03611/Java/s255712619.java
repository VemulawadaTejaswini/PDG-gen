import java.util.*;

public class Main {
    static Scanner sc = new Scanner(System.in);
    public static void main(String[] args) {
        int n = sc.nextInt();
        if(n == 1) {
            System.out.println("1");
            System.exit(0);
        }
        ArrayList<Integer> a = new ArrayList<>();
        for(int i=0; i<n; i++) {
            a.add(sc.nextInt());
        }

        ArrayList<Integer> na = new ArrayList<>();
        for(int i=0; i<a.size(); i++) {
            na.add(a.get(i)+1);
            na.add(a.get(i)-1);
            na.add(a.get(i));
        }

        int[] freq = new int[na.size()+1];

        for(int i: na) {
            freq[i+1]++;
        }

        int ans = 0;
        for(int i=0; i<freq.length; i++) {
            ans = Math.max(ans, freq[i]);
        }
        System.out.println(ans);
    }
}
