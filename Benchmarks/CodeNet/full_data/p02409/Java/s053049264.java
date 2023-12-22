import java.util.Scanner;
public class Main {
    public static void main(String[] args){
        Scanner scan=new Scanner(System.in);
        int n=scan.nextInt();
        int[][][] num=new int[4][3][10];
        int[] a=new int[4];
        for(int i=0;i<n;i++){
            for(int j=0;j<4;j++) a[j]=scan.nextInt();
            num[a[0]-1][a[1]-1][a[2]-1]+=a[3];
        }

        for(int i=0;i<4;i++){
            for(int j=0;j<3;j++){
                for(int k=0;k<10;k++){
                    if(k==9) System.out.println(" "+num[i][j][k]);
                    else System.out.printf(" %d",num[i][j][k]);
                }
            }
            if(i!=3) System.out.println("####################");
        }
    }
}
