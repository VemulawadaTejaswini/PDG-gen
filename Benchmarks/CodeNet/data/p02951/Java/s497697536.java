
import java.util.*;
class Main{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int a = Integer.parseInt(sc.next());
        int b = Integer.parseInt(sc.next());
        int c = Integer.parseInt(sc.next());
        sc.close();
        int ans = c - (a - b);
        if(ans < 0){
            ans = 0;
        }
        System.out.println(ans);
    }
}
