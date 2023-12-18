import java.util.Scanner;
import java.util.Set;

public class Main{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = Integer.parseInt(sc.next());
        int b = Integer.parseInt(sc.next());
        int tap = 1;
        int cnt = 0;
        while(tap<b){
            cnt++;
            tap += (a-1);
        }
        System.out.println(cnt);
    }
}