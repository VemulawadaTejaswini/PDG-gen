import java.util.*;
public class Main{
	public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();
        int x = sc.nextInt();
        int y = sc.nextInt();
        
        int i = a*x + b*y;

        int j = 2 * c * Math.max(x,y);
        int k = 0;
        if(x < y){
            k = 2*c*x*+b*Math.abs(x-y);
        }else{
            k = 2*c*y*+a*Math.abs(x-y);
        }
        int ans = Math.min(i,Math.min(j,k));
        System.out.println(ans);
    }
}
