import java.util.*;
public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        int ans1 = 0, ans2 = 0;
        for(int i = 0; i < n; i++){
            String s = scan.next();
            String t = scan.next();
            int comp = s.compareTo(t);
            //System.out.println(comp);
            if(comp <= -1)ans1 += 3;
            else if(comp >= 1)ans2 += 3;
            else {
                ans1++;
                ans2++;
            }
        }
        System.out.println(ans2 + " " + ans1);
    }
}

