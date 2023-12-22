import java.util.*;
public class Main {
    public static void main(String [] args){
        Scanner sc = new Scanner(System.in);
        int num = 0;
        int n = sc.nextInt();
        num = n/25;
        n%=25;
        num += n/10;
        n%=10;
        num += n/5;
        n%=5;
        num += n;
        System.out.println(num);
    }
}
