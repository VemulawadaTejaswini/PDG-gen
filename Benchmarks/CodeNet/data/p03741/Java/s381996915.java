import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		long[] a = new long[n];
		for(int i=0;i<n;i++) a[i] = sc.nextLong();
		sc.close();
		long count1 = 0;
		long sum = 0;
		long lastsum = 0;
		for(int i=0;i<n;i++){
			lastsum = sum;
			sum += a[i];
			if(sum==0){
				if(lastsum>0){
					count1 += 1;
					sum = -1;
				} else if(lastsum<0){
					count1 += 1;
					sum = 1;
				} else {
					if(i<n-1){
						if(a[i+1]>0){
							count1 ++;
							sum = -1;
						} else if (a[i+1]<0){
							count1 ++;
							sum = 1;
						} else {
							count1 += i==0?1:2;
						}
					} else {
						count1 +=2;
					}
				}
			} else if(sum>0&&lastsum>0){
				count1 += sum+1;
				sum = -1;
			} else if(sum<0&&lastsum<0){
				count1 += 1-sum;
				sum = 1;
			}
		}
		sum = 0;
		lastsum = 0;
		long count2 = 0;
		long[] b = new long[n];
		for(int i=0;i<n;i++) b[i] = a[n-i-1];
		for(int i=0;i<n;i++) {
			a[i] = b[i];
			System.out.print(a[i]+" ");
		}
		System.out.println();

		for(int i=0;i<n;i++){
			lastsum = sum;
			sum += a[i];
			if(sum==0){
				if(lastsum>0){
					count2 += 1;
					sum = -1;
				} else if(lastsum<0){
					count2 += 1;
					sum = 1;
				} else {
					if(i<n-1){
						if(a[i+1]>0){
							count2 ++;
							sum = -1;
						} else if (a[i+1]<0){
							count2 ++;
							sum = 1;
						} else {
							count2 += i==0?1:2;
						}
					} else {
						count2 +=2;
					}
				}
			} else if(sum>0&&lastsum>0){
				count2 += sum+1;
				sum = -1;
			} else if(sum<0&&lastsum<0){
				count2 += 1-sum;
				sum = 1;
			}
		}
		System.out.println(Math.min(count1, count2));

	}

}
