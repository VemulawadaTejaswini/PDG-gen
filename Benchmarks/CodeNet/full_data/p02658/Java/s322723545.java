import java.util.Scanner;
public class Main{
        public static void main(String[] args){
                final Scanner cin = new Scanner(System.in);
                int n=cin.nextInt();
                int[] arr=new int[n];
                for(int i=0;i<n;i++){
                        arr[i]=cin.nextInt();
                }   
                for(int i=0;i<n;i++){
                        if(arr[i]==0){
                                System.out.print("0");
                                return;
                        }   
                }   
                long it=1L;
                for(int i=0;i<n;i++){
                        if(it<=1000000000000000000L){
                                it*=(long)arr[i];
                        }   
                        else{
                                System.out.print("-1");
                                return ;
                        }   
                }   
                System.out.print(it);
        }   
}
