import java.util.*;
import java.util.Arrays;
 
class Main{
	public static void main(String args[]){
		Scanner stdIn = new Scanner(System.in);
		
		int n = stdIn.nextInt();
		int a[] = new int[n];
                int count = 0;
		for (count; count < n; count++){
			a[count]=stdIn.nextInt();
		}
		Arrays.sort(a); 
		int sum1 = 0,sum2 = 0;
		int count2 = n-1;
		while(count2>=0){
			if (sum1<sum2) {
				sum1=sum1+a[count2];
			}else{
				sum2=sum2+a[count2];
			}
			count2=count2-1;
		}
		if ((sum1-sum2)<0) {
			System.out.println(sum2-sum1);
		}else{
			System.out.println(sum1-sum2);
		}
	}
}