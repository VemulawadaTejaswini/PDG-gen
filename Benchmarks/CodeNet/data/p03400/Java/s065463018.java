import java.util.*;
public class Main{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int d = sc.nextInt();
        int x = sc.nextInt();
        int[] a = new int[n];
        int cnt =x;
        int day = 1;

        for(int i =0;i<n;i++){
            a[i] = sc.nextInt();
        }
        for(int i =0;i<n;i++){
            for(int j = 0;j<d;j++){
                if(day<=d){
                    cnt++;
                }
                day += a[i];
            }
            day = 1;
        }
        System.out.println(cnt);
    }
}
