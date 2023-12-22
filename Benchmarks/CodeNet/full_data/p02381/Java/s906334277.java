import java.util.Scanner;
public class Main{
	public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int n;
        double ave=0,sum=0,sum2=0;
        double[] data = new double[1001];
        double[] data2 = new double[1001];
        
        
        while(true) {
            n = sc.nextInt();
            if(n==0)break;
            for(int i = 0;i<n;i++) {
            	data[i]=sc.nextInt();
            	sum +=data[i];
            }
            ave = sum/n;
        	
            for(int i = 0;i<n;i++) {
            	data2[i]=Math.pow(data[i]-ave, 2);
            	sum2 +=data2[i];
            	}
            double ans = sum2/n;
            System.out.printf("%f\n", Math.sqrt(ans));
            
            
            
            sum =0 ;
            sum2=0;
        }
        
        
        
        
        sc.close();
	}


}

