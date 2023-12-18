import java.util.*;

public class Main{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] t = new int[n+1];
        int[] x = new int[n+1];
        int[] y = new int[n+1];
        for(int i = 1; i <= n; i++){
            t[i] = sc.nextInt();
            x[i] = sc.nextInt();
            y[i] = sc.nextInt();
        }
        int dist = 0;
        int flag = 1;
        int time = 0;
        for(int i = 1; i <= n; i++){
            time = t[i] - t[i-1];
            dist = Math.abs( Math.abs( (x[i] - x[i-1]) ) + Math.abs( (y[i] - y[i-1]) ) );
            if(time < dist){
                flag = 0;
                break;
            } else if((time-dist)%2 != 0){
                flag = 0;
                break;
            }
        }
        if(flag == 1){
            System.out.print("Yes");
        } else {
            System.out.print("No");
        }
    }
}