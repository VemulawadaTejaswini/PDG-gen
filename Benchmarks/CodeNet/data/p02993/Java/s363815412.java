import java.util.*;

class Main{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        String S = sc.next();
        String[] s = S.split("");
        int[] n = new int[4];
        for(int i = 0; i < 4; i++) {
            n[i] = Integer.parseInt(s[i]);
        }
        
        String ans = "Good";
        for(int i = 0; i < 3; i++) {
            
            if(n[i] == n[i+1]) {
                ans = "Bad";
                break;
            }
            
        }

        System.out.println(ans);
    }
}