import java.util.*;
 
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.next();
        String[] sp = s.split("");
        int[] n = new int[4];
        
        for(int i=0; i<4; i++) {
            n[i] = Integer.parseInt(sp[i]);
        }
        String ans = "No";
        for(int i=0; i<3; i++) {
            int count = 0;
            for(int j=i+1; j<4; j++) {
                if(n[i] == n[j]) count++;
            }
            if(count >= 2) {
                ans = "Yes";
                break;
            }
        }
        System.out.println(ans);
    }
}