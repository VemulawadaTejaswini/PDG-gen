import java.util.Scanner;
import java.util.List;
import java.util.ArrayList;
import java.util.Collections;
public class Main{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        List<Integer> a = new ArrayList<>();
        for(int i = 0;i < n;i++){
            a.add(sc.nextInt());
        }
        int ans = 1000000000;
        for(int i = -n;i <= n;i++){
            int x = solve(a,i,n);
            if(x >= ans){
                break;
            }
            ans = x;
        }
        System.out.println(ans);
    }
    public static int solve(List<Integer> a,int b,int n){
        int d = 0;
        for(int i = 0;i < n;i++){
            d += Math.abs(a.get(i)-(b+i+1));
        }
        //System.out.println(d);
        return d;
    }
}
