
import java.util.Scanner;

class Main{
        public static void main(String[] args){
                Scanner scn=new Scanner(System.in);
                int N=scn.nextInt();
                int length=1000000000;
                boolean[] a=new boolean[length];
                int j;
                for(int i=0;i<N;i++){
                        j=scn.nextInt();
                        a[j]=!a[j];
                }
                int ans=0;
                for(int i=0;i<length;i++){
                        if(a[i]){
                                ans++;
                        }
                }
                System.out.println(ans);
        }
}