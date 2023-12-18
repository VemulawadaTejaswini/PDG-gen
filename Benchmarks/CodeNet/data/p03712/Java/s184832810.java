import java.util.*;
class Main{
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int H=sc.nextInt();
        int W=sc.nextInt();
        String a[][]=new String[H+2][W+2];
        String b[][]=new String[H+2][W+2];
        for(int i=1;i<H+1;i++){
            for(int j=1;j<W+1;j++){
                a[i][j]=sc.next();
            }
        }
        int m=0;
        int n=0;
        for(m=0;m<H+2;m++){
            for(n=0;n<W+2;n++){
               if(m==0 || m==H+1 || n==0 || n==W+1){
                   b[m][n]="#";
               }else{
                   b[m][n]=a[m][n];
               }
            }
        }
        int k=0;
        int l=0;
        for(k=0;k<H+2;k++){
            for(l=0;l<W+2;l++){
                System.out.printf("%s",b[k][l]);
            }
            System.out.println();
        }
    }
}
