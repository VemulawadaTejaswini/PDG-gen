
import java.util.Scanner;

class Main{
        private static int sub;
        private static int tmp;

        public static void main(String[] args){
                Scanner scanner=new Scanner(System.in);
                int n=scanner.nextInt();
                int k=scanner.nextInt();
                int[] a=new int[n];
                for(int i=0;i<n;i++){
                        a[i]=scanner.nextInt();
                }

                int m=0;
                for(int i=0;i<n;i++){
                        if(a[i]>m){
                                m=a[i];
                        }
                }

                int div=getGCD(a);
        }

        private static int getGCD(int[] a){
                int j=getGCD(a[0],a[1]);
                for(int i=2;i<a.length;i++){
                        j=getGCD(j,a[i]);
                }
                return j;
        }

        private static int getGCD(int i,int j){
                if(i<j){
                        tmp=i;
                        i=j;
                        j=tmp;
                }
                if(j==0){
                        return i;
                }else{
                        return getGCD(j,i%j);
                }
        }
}