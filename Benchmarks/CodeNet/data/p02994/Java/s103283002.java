import java.util.Arrays;
import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		 Scanner sc = new Scanner(System.in);

		 int n = sc.nextInt();
		 int l = sc.nextInt();
		 int[] nn = new int[n];
		 int[] mins = new int[n];
		 int total=0;
		 int ans=0;
		 int flg = 0;
		 int minusFl = 0;

		 for(int j=0; j<n; j++) {
			 nn[j]=(l+(j+1)-1);
			 total+=nn[j];
		 }

		 	for(int i=0; i<nn.length; i++) {
		 		mins[i]=total - nn[i];
		 		if(mins[i]<0) {
		 			mins[i]=Math.abs(mins[i]);
		 			minusFl = 1;
		 		}
		 		if(mins[i]==0) {
		 			flg=1;
		 			break;
		 		}
		 	}
		 	if(flg==0) {
		 		Arrays.sort(mins);
		 		if(minusFl==1) {
		 			ans=-1*(mins[mins.length-1]);
		 		}else {
		 			ans = mins[mins.length-1];
		 		}
		 	}else {
		 		ans=0;
		 	}

		 	System.out.println(String.valueOf(ans));
	}

}
