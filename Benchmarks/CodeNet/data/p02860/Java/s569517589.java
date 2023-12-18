import java.util.*;

public class Main {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        String s = sc.next();
        if (n%2==1){
            System.out.println("No");
        }else{
            String t = s.substring(0,n/2);
            String u = s.substring(n/2);
            if (t.equals(u))System.out.println("Yes");
            else System.out.println("No");
        }
    }
}
