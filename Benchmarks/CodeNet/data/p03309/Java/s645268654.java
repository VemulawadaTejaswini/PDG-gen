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
            a.add(sc.nextInt()-(i+1));
        }
        Collections.sort(a);
        //System.out.println(a);
        int b = 0;
        b = a.get(n/2);
        int ans = solve(a,b,n);
        System.out.println(ans);
    }
    public static int solve(List<Integer> a,int b,int n){
        int d = 0;
        for(int i = 0;i < n;i++){
            d += Math.abs(a.get(i)-b);
        }
        return d;
    }
}
