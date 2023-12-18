import java.util.*;
public class Main {
    static int res=0;
    public static void main(String args[]) {
        Scanner s=new Scanner(System.in);
        int n=s.nextInt();
        int c[][]=new int[n][n];
        for(int i=0;i<n;i++)
        for(int j=0;j<n;j++)
        c[i][j]=s.nextInt();
boolean visited[]=new boolean[n];
        f(0,visited,c,n);
        System.out.print(res);
    }
    public static void f(int man,boolean visited[],int c[][],int n){
        if(man==n){
            res=(res+1)%1000000007;
            return;
        }
        for(int i=0;i<visited.length;i++){
            if(visited[i]==false && c[man][i]==1){
                visited[i]=true;
                f(man+1,visited,c,n);
                visited[i]=false;
            }
        }
    }
}