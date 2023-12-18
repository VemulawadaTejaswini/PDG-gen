import java.util.ArrayList;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        ArrayList<ArrayList> f = new ArrayList<>();
        ArrayList<ArrayList> p = new ArrayList<>();
        
        for (int i = 0; i < n; i++) {
            ArrayList<Integer> tmp = new ArrayList<>();
            for (int j = 0; j < 10; j++) {
                tmp.add(sc.nextInt());
            }
            f.add(tmp);
        }
        
        for (int i = 0; i < n; i++) {
            ArrayList<Integer> tmp = new ArrayList<>();
            for (int j = 0; j <= 10; j++) {
                tmp.add(sc.nextInt());
            }
            p.add(tmp);
        }
        
        int[] box = new int[n];
        for (int i = 0; i < n; i++) {
            box[i] = (int) f.get(i).stream()
                    .filter(e-> e.equals(1))
                    .count();
        }
        
        System.out.println(box[0]);
        
        int ans = 0;
        for (int i = 0; i < n; i++) {
            int max = (int) p.get(i).get(1);
            for(int j = 1; j <= box[i]; j++) {
                if((int) p.get(i).get(j) > max) {
                    max = (int) p.get(i).get(j);
                }
            }
            ans += max;
        }
        
        System.out.println(ans);   
    }
}