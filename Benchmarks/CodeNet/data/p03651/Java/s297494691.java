
import java.util.Scanner;

class Main{
        private static int sub;

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

//              int div=getGCD(a);
                int div=1;
                if(k%div==0 && k<=m){
                        System.out.println("POSSIBLE");
                }else{
                        System.out.println("IMPOSSIBLE");
                }
        }

        private static int getGCD(int[] a){
                int j=getGCD(a[0],a[1]);
                for(int i=2;i<a.length;i++){
                        j=getGCD(j,a[i]);
                        if(j==1){
                                return 1;
                        }
                }
                return j;
        }

        private static int getGCD(int i,int j){
                int[] a=new int[3];
                a[0]=i;
                a[1]=j;
                while(a[0]!=a[1]){
                        sub=a[0]-a[1];
                        if(sub<0){
                                sub=-sub;
                        }
                        a[2]=sub;
                        a[0]=a[1];
                        a[1]=a[2];
                }
                return a[0];
        }
}