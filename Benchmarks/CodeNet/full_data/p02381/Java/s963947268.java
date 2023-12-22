import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
public class Main {
	public static void main(String[] args)throws IOException {

		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		while(true){
			int n=Integer.parseInt(br.readLine());
			if(n==0)break;
			String[] dat=br.readLine().split(" ");
			int[] p= new int[n];
			int sum=0;
			double h,hsa;
			for (int i=0;i<n;i++){
				p[i] = Integer.parseInt(dat[i]);
				sum +=p[i];
			}
			
			h=(double)sum/n;
			double bun=0;
			for (int i=0;i<n;i++){
				bun +=(p[i]-h)*(p[i]-h);
			}
			hsa=(double)Math.sqrt(bun/n);	
			System.out.printf("%.8f\n",hsa);
		}
	}
}