import java.util.*;
import static java.lang.Math.*;

public class Main{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int cnt = 0;
        for(int i=0; i<n; i++){
            int num = sc.nextInt();
            if(num%2==1){
                cnt++;
            }
        }
        if(cnt%2==1){
            System.out.println("NO");
        }else{
            System.out.println("YES");
        }
    }
}