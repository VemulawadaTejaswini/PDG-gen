import java.util.Scanner;
class Main{
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int r=sc.nextInt();
        int c=sc.nextInt();
        int[][] rc=new int[r+1][c+1];     
        for(int i=0;i<r;i++){
            for(int j=0;j<c;j++){
                rc[i][j]=sc.nextInt();
            }
        }
        int sum;
        for(int k=0;k<r;k++){
            sum=0;
            for(int l=0;l<c;l++){
                sum=sum+rc[k][l];
                if(l==c-1){
                    rc[k][c]=sum;
                }
            }
        }for(int a=0;a<=c;a++){
            sum=0;
            for(int b=0;b<r;b++){
                sum=sum+rc[b][a];
                if(b==r-1){
                    rc[r][a]=sum;
                }
            }
        }
        for(int d=0;d<=r;d++){
            for(int e=0;e<=c;e++){
                System.out.print(rc[d][e]);
                if(e!=c){
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
    }
}
