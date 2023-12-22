import java.util.Scanner;
public class Main {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
     	while(true){
            long sum=0;
            long b=0;
            int n=sc.nextInt();
            int m=sc.nextInt();
            if(n==0&&m==0)
                break;
            int[] a=new int[n];
            
            for(int i=0;i<n;i++){
                a[i]=sc.nextInt();
            }
            
            for(int i=0;i<n;i++){
                for(int j=i+1;j<n;j++){
                    	b = a[i] + a[j];
					if (m >= b) {
						if (sum < b) {
							sum = b;
                    }
                }
            }
            }
            if(sum==0){
                System.out.println("NONE");
            }else{
                System.out.println(sum);
            }
        }
    }
}
                       
