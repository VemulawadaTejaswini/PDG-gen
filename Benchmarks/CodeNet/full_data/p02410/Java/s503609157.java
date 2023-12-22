import java.util.Scanner;
 
public class Main{
 
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n=sc.nextInt();
        int m=sc.nextInt();
        int[][] bi=new int[n][m];
        int[] b=new int[m];
        int[] sum=new int[n];
        
        for(int i=0;i<n;i++){
            for(int j=0;j<m;j++){
                bi[i][j]=sc.nextInt();
            }
        }
        for(int i=0;i<m;i++){
            b[i]=sc.nextInt();
        }
        for(int i=0;i<n;i++){
            for(int j=0;j<m;j++){
                sum[i]+=(bi[i][j]*b[j]);
            }
        }
        for(int i=0;i<n;i++){
        	System.out.println(sum[i]);
        }
        
        sc.close();
 
    }
 
}
