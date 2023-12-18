import java.util.*;

public class Main{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        long a = sc.nextLong();
        long b = sc.nextLong();
        long x = sc.nextLong();
        long answer = (b/x+1) - ((a-1)/x+1);
        System.out.print(answer);
    }
}