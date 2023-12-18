import java.util.*;

public class Main {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();
        int d = sc.nextInt();
        
        int distance1 = Math.abs(a-b);
        int distance2 = Math.abs(b-c);
        int distance3 = Math.abs(a-c);

        if(distance1 <= d && distance2 <= d || distance3 <= d){
            System.out.println("Yes");
        }else{
            System.out.println("No");
        }
    }
}
