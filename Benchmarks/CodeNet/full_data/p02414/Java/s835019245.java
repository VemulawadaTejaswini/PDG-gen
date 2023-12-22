import java.util.Scanner;

public class Main {
    
    public static void main(String[] args){
        
        int[][] A=new int[100][100];
        int[][] B=new int[100][100];
        long[][] C=new long[100][100];
        int[] a=new int[100];
        int[] b=new int[100];
        long c=0;
        
        Scanner scan=new Scanner(System.in);
        
        int n=scan.nextInt();
        int m=scan.nextInt();
        int l=scan.nextInt();
        
        for(int i=0;i<n;i++){
            for(int j=0;j<m;j++){
                A[i][j]=scan.nextInt();
            }
        }        
        
        for(int i=0;i<m;i++){
            for(int j=0;j<l;j++){
                B[i][j]=scan.nextInt();
            }
        }
        
        for(int i=0;i<n;i++){
            for(int j=0;j<m;j++){
                a[j]=A[i][j];
            }
            
            for(int j=0;j<l;j++){
                for(int k=0;k<m;k++){
                    b[k]=B[k][j];
                }
                c=0;
                for(int k=0;k<m;k++){
                    c+=a[k]*b[k];
                }
                C[i][j]=c;
            }
        }
        
        for(int i=0;i<n;i++){
            for(int j=0;j<l-1;j++){
                System.out.print(C[i][j]+" ");
            }
            System.out.print(C[i][l-1]+"\n");
        }
        
    }   
     
}