import java.util.*;
public class Main {
    public static void main(String args[]) {
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        int A = scan.nextInt() , B = scan.nextInt();
        int p1 = 0 , p2 = 0 , p3 = 0;
        for(int i = 0 ; i < n ; ++i){
            int tmp = scan.nextInt();
            if(tmp > B)p3++;
            else if(tmp > A)p2++;
            else p1++;
        }
        System.out.println(Math.min(p3,Math.min(p2,p1)));
    }
}
