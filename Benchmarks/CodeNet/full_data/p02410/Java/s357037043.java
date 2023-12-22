import java.util.Scanner;
class Main{
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int m=sc.nextInt();
        int[][] bector1=new int[n][m];
        int[] bector2=new int[m];
        int[] ans=new int[n];
        for(int i=0;i<n;i++){
            for(int j=0;j<m;j++){
                bector1[i][j]=sc.nextInt();
            }
        }
        for(int k=0;k<m;k++){
            bector2[k]=sc.nextInt();
        }
        
        for(int l=0;l<n;l++){
            for(int p=0;p<m;p++){
                ans[l]+=bector1[l][p]*bector2[p];
            }
            System.out.println(ans[l]);
        }
        
        
    }
}

