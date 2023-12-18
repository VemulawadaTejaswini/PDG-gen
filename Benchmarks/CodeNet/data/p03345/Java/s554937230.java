import java.util.*;
public class Main{
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        long a =sc.nextInt();
        long b= sc.nextInt();
        long c = sc.nextInt();
        long k = sc.nextLong();
        if(a+c == b+c){
            System.out.println(0); return;
        }
        if(k%2 == 0){
            System.out.println(a-b);
        } else {
            System.out.println(b-a);
        }
        
    }
}
