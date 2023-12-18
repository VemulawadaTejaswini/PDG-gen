import java.util.Scanner;
import java.util.Arrays;
public class Main{
    public static void main(String[]args){
        Scanner scan = new Scanner(System.in);
        int a,b,m,tmpx,tmpy;
        a=scan.nextInt();
        b=scan.nextInt();
        m=scan.nextInt();
        int[] aa=new int[a];
        int[] bb=new int[b];
        for(int i=0;i<a;i++){
            aa[i]=scan.nextInt();
        }
        for(int i=0;i<b;i++){
            bb[i]=scan.nextInt();
        }
        int[] sum_c =new int[m];
        for(int i=0;i<sum_c.length;i++){
            tmpx=scan.nextInt()-1;
            tmpy=scan.nextInt()-1;
            //System.out.println(tmpx+" "+tmpy+" "+aa[tmpx]+" "+bb[tmpy]);
            sum_c[i]=aa[tmpx]+bb[tmpy]-scan.nextInt();
            //System.out.println(sum_c[i]);
        }
        Arrays.sort(aa);
        Arrays.sort(bb);
        Arrays.sort(sum_c);
        System.out.println(Math.min(aa[0]+bb[0],sum_c[0]));
    }
}