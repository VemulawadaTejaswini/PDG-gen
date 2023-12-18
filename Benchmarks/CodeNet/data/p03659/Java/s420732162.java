
import java.util.Scanner;

class Main{
        public static void main(String[] args){
                Scanner scanner=new Scanner(System.in);
                int n=scanner.nextInt();
                int[] l=new int[n];
                int[] snuke=new int[n];
                for(int i=0;i<n;i++){
                        l[i]=scanner.nextInt();
                }

                int sum=0;
                for(int i=0;i<n;i++){
                        sum+=l[i];
                        snuke[i]=sum;
                }

                int[] sub=new int[2];
                int min=0;
                for(int i=0;i<n-1;i++){
                        sub[0]=Math.abs((snuke[i]-(sum-snuke[i])));
                        sub[1]=Math.abs((snuke[i+1]-(sum-snuke[i+1])));
                        if(sub[0]-sub[1]<=0){
                                min=sub[0];
                        }
                }
                System.out.println(min);
        }
}