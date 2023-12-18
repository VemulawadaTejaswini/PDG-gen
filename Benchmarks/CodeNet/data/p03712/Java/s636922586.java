import java.util.*;
class Main{
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int H=sc.nextInt();
        int W=sc.nextInt();
        String a[][]=new String[H][W];
        for(int i=0;i<H;i++){
            for(int j=0;j<W;j++){
                a[i][j]=sc.next();
            }
        }
        String b[][]=new String[H+2][W+2];
        for(int i=0;i<H+2;i++){
            for(int j=0;j<W+2;j++){
                b[i][j]="#";
            }
        }
        for(int i=0;i<H;i++){
            for(int j=0;j<W;j++){
                b[i+1][j+1]=a[i][j];
            }
        }
        for(int i=0;i<H+2;i++){
            for(int j=0;j<W+2;j++){
                System.out.printf("%s",b[i][j]);
            }
            System.out.println();
        }
    }
}