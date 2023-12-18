import java.util.*;

public class Main{
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);

        long a = sc.nextLong();
        long b = sc.nextLong();
        int c = sc.nextInt();
        int d = sc.nextInt();

        int count = 0;

        for(int i = 0; i <= (b - a); i++) {
            if(((a+i) % c != 0) && ((a+i) % d != 0))
                count++;
        }
        System.out.println(count);
        sc.close();
    }
}