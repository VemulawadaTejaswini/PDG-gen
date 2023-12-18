import java.util.*;
public class Main{
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        int N = scan.nextInt();
        int M = scan.nextInt();
        int ans = N/M;
        if(N%M>0){
            ans++;
        }
        System.out.println(ans);
    }
}
