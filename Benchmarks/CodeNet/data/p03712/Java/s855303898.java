import java.util.*;
class Main{
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int H=sc.nextInt();
        int W=sc.nextInt();
        String a[][]=new String[H+1][W+1];
        for(int i=1;i<H+1;i++){
            for(int j=1;j<W+1;j++){
                a[i][j]=sc.next();
            }
        }
        int k=0;
        int l=0;
        while(k<H+2){
            while(l<W+2){
                if(k==0||k==H+1||l==0||l==W+1){
                    System.out.print("#");
                }else{
                    System.out.printf("%s",a[k][l]);
                }
                l++;
            }
            System.out.println();
            l=0;
            k++;
        }
    }
}