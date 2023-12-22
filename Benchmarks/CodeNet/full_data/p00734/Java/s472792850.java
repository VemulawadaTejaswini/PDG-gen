import java.util.Scanner;

public class Main {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		Scanner cin = new Scanner(System.in);
		for(;;){
			int n  =cin.nextInt();
			int m  =cin.nextInt();
			if(n+m==0){
				break;
			}
			int[] a = new int[n];
			int[] b = new int[m];
			int asum=0,bsum=0;
			for(int i = 0;i<n;i++){
				a[i]=cin.nextInt();
				asum+=a[i];
			}
			for(int j = 0;j<m;j++){
				b[j]=cin.nextInt();
				bsum+=b[j];
			}
			int x=0,y=0,min=Integer.MAX_VALUE;
			for(int i = 0;i<n;i++){
				for(int j = 0;j<m;j++){
					asum = asum + b[j]-a[i]; 
					bsum = bsum + a[i]-b[j];
					if(asum==bsum){
						if(min>a[i]+b[j]){
							x=a[i];
							y=b[j];
							min=a[i]+b[j];
						}
					}
					asum += a[i]-b[j];
					bsum += b[j]-a[i];
				}
			}
			if(min==Integer.MAX_VALUE){
				System.out.println(-1);
			}
			else{
				System.out.println(x+" "+y);
			}
		}

	}

}