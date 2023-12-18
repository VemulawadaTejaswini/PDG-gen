
import java.util.Scanner;
import java.util.Arrays;

class Main{
        public static void main(String[] args){
                Scanner scanner=new Scanner(System.in);
                int n=scanner.nextInt();
                int[] a=new int[n];
                for(int i=0;i<n;i++){
                        a[i]=scanner.nextInt();
                }
                Arrays.sort(a);
                int j=a[n-1];
                int k=0;
                int[] h=new int[2];
                for(int i=1;i<n;i++){
                        if(a[n-1-i]==j){
                                i++;
                                h[k]=j;
                                k++;
                                if(k==2){
                                        System.out.println(h[0]*h[1]);
                                        return;
                                }
                        }
                        if(i>=n){
                                break;
                        }
                        j=a[n-1-i];
                }
                System.out.println(0);
        }
}