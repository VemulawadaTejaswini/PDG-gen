import java.util.*;

public class Main {

	public static void main(String[] args){
		int min,max,sum;
		while(true){
			sum=0;
			Scanner r = new Scanner(System.in);
			int n = r.nextInt();
			if(n==0) break;
			max = r.nextInt();
			min = r.nextInt();
			for(int i=2;i<n;i++){
				int s = r.nextInt();
				if(s>=max) {
					sum +=max; max=s;
				}
				else if(s<=min){
					sum +=min; min=s;
				}
				else sum +=s;

			}
			System.out.println((int)sum/(n-2));

		}
	}

}