
import java.util.Scanner;
import java.util.Arrays;

class Main{
        public static void main(String[] args){
                Scanner scanner=new Scanner(System.in);
                int N=scanner.nextInt();
                if(N<=3){
                        scanner.next();
                        System.out.println(N);
                        return;
                }

                int[] a=new int[N+1];
                for(int i=0;i<N;i++){
                        a[i]=scanner.nextInt();
                }
                a[N]=-1;
                Arrays.sort(a);

                int[] num=new int[a.length];
                int n=1;
                int indexNum=0;
                for(int i=0;i<a.length-1;i++){
                        if(a[i+1]==-1){
                                num[indexNum]=n;
                        }else{
                                if(a[i]==a[i+1]){
                                        n++;
                                }else{
                                        num[indexNum++]=n;
                                        n=1;
                                }
                        }
                }

                int max=0;
                int sum=0;
                for(int i=0;i<num.length-2;i++){
                        sum=num[i]+num[i+1]+num[i+2];
                        if(max<sum){
                                max=sum;
                        }
                }
                System.out.println(max);
        }
}