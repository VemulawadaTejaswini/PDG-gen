import java.util.Scanner;
import java.util.Arrays;
public class Main {
 
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        while(true){
        	int n=sc.nextInt();
            int sum=1000000;
            if(n==0){
                break;
            }
            int[] a=new int[n];
            for(int i=0;i<n;i++){
                a[i]=sc.nextInt();
            }
            Arrays.sort(a);
            
            for(int i=0;i<n-1;i++){
                for(int j=i+1;j<n;j++){
                    if(a[j]-a[i]<sum){
                    	sum=a[j]-a[i];
                    }
                }
            }
            System.out.println(sum);
        }
        sc.close();
    }
}
