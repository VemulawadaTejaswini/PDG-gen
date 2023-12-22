import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
    
        var sc = new Scanner(System.in);
    
        int x = Integer.parseInt(sc.next());
        
        int ans = 1;
        int a = x;
        while(a != 0){
            a += x;
            a %= 360;
            ans++;
        }
        System.out.println(ans);
    }
}