import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner in = new Scanner(System.in);
		int n = in.nextInt();
		int[] t = new int[n];
		int[] a = new int[n];	
		int[] heights = new int[n];
		int max1 = 0;
		int max2 = 0;
		long result = 1;
		for(int i =0;i<n;i++){
			t[i] = in.nextInt();
			heights[i] = 0;
		}
		for(int i = 0;i<n;i++){
			a[i] = in.nextInt();
		}

		for(int i = 0;i<(n+1)/2;i++){

			if(t[i]>max1){
				heights[i] = t[i];
				max1 = t[i];
			}
			if(a[n-1-i]>max2){
				heights[n-1-i] = a[n-1-i];
				max2 = a[n-1-i];
			}
		}		

		for(int i =(n+1)/2;i<n;i++){
			if(t[i]>max1){	
				max1 = t[i];
				if(heights[i]==0){
					heights[i] = t[i];
					//System.out.println(i+" "+heights[i]);

				}
				else{
					if(heights[i]!=t[i]){
						System.out.println(0);
						return;
					}
				}			
			}

			if(a[n-1-i]>max2){
				max2 = a[n-1-i];
				if(heights[n-i-1]==0){
					heights[n-1-i] = a[n-1-i];
					//System.out.println(n-1-i+" "+heights[n-1-i]);

				}
				else{
					if(heights[n-1-i]!=a[n-1-i]){
						System.out.println(0);
						return;
					}
				}			
			}

		}

		for(int i =1;i<n/2;i++){
			if(heights[i]==0){
				//System.out.println(result+"*"+heights[i-1]);
				result= (result*heights[i-1])%((int)(Math.pow(10, 9)+7));
				
				heights[i] = heights[i-1];
			}
			if(heights[n-1-i]==0){
				//System.out.println(result+"*"+heights[n-i]);
				result= (result*heights[n-i])%((int)(Math.pow(10, 9)+7));
				
				heights[n-1-i] = heights[n-i];
			}
		}
		if(n%2==1 && heights[n/2]==0){
			int temp = heights[n/2-1]>heights[n/2+1]?heights[n/2+1]:heights[n/2-1];
			result = (result*temp)%((int)(Math.pow(10, 9)+7));
		}
		System.out.println(result);
	}

}
