import java.util.Scanner;

public class Main{
    public static void main(String[]args){
        Scanner scn = new Scanner(System.in);
        
        int n = scn.nextInt();
        int m = scn.nextInt();
        int l = scn.nextInt();
        
        int [][]A = new int[n][m];
        int [][]B = new int[m][l];
        int [][]C = new int[n][l];
        
        read(n,m,A,scn);
        read(m,l,B,scn);
        
        
        for(int i=0;i<n;i++){
            for(int j=0;j<l;j++){
                for(int k=0;k<m;k++){
                    C[i][j]+=A[i][k]*B[k][j];
                }
            }
        }
        

        for(int i=0;i<n;i++){
            for(int j=0;j<l;j++){
                if(j==l-1){
                    System.out.print(C[i][j]+"\n");
                }else{
                    System.out.print(C[i][j]+" ");
                }                               
            }
        }        
        
    }
    
    private static void read(int a, int b, int[][] Ar,Scanner scn) {
        for(int i=0;i<a;i++){
            for(int j=0;j<b;j++){
                Ar[i][j]=scn.nextInt();
            }
        }
    }
        
}