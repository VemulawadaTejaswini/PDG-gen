import java.util.*;
public class Main{
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        long a = scan.nextLong();
        long ans = (a*(a-1))/2;
        System.out.println(ans);
    }
}
