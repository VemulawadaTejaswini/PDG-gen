import java.util.*;

public class Main{

    void solve(){
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        while(n-->0){
            String s = sc.next();
            int ans = 0;
            for(int i=0; i<s.length()-1; i++){
                ans = 1-ans;
                int sum = (int)(s.charAt(i)-'0') 
                    + (int)(s.charAt(i+1)-'0');
                s = sum + s.substring(i+1,s.length());
            }

            if(ans==0) System.out.println("Audrey wins.");
            else System.out.println("Fabre wins.");
        }
    }

    public static void main(String[] args){
        new Main().solve();
    }
}