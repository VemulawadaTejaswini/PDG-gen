import java.util.*;

public class Main{
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        
        int r = sc.nextInt();
        int D = sc.nextInt();
        int x2000 = sc.nextInt();

        int x = x2000;
        int ans;
        for(int i = 0; i < 10; i++) {
            ans = r*x - D;
            x = ans;
            System.out.println(ans); 
        }
        sc.close();
    }
}