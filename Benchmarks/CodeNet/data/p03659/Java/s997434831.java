
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

                int sub=0;
                int min=0;
                sub=Math.abs(2*snuke[0]-sum);
                min=sub;
                for(int i=0;i<n-1;i++){
                        sub=Math.abs(2*snuke[i]-sum);
                        if(sub<min){
                                min=sub;
                        }
                }
                System.out.println(min);
        }
}