import java.util.*;
import static java.lang.System.*;
import static java.lang.Math.*;
public class Main {
public static void main(String[] args){
Scanner sc = new Scanner(in);
int n = sc.nextInt();
int[][] a=new int[2][n+1];
    for (int i = 0; i <2; i++) {
        for (int j = 1;j<=n; j++) {
            a[i][j]=a[i][j-1]+sc.nextInt();
        }
    }
    int ans=0;
    for (int i = 1; i <= n; i++) {
        for (int j = 1; j <= n; j++) {
            ans=max(ans,a[0][i]+(a[1][n]-a[1][i-1]));
        }
    }
    out.println(ans);
}}