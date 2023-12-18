import java.util.Scanner;

public class Main {
	
	public static void sort(long[] array,int start,int end){
		if(start >= end) return;
		long k = array[start];
		int i=start,j=end;
		while(i != j){
			for(;j>i;j--){
				if(array[j]>k){
					array[i]=array[j];
					array[j]=k;
					break;
				}
			}
			if(i==j) continue;
			for(i=i+1;i<j;i++){
				if(array[i]<k){
					array[j]=array[i];
					array[i]=k;
					break;
				}
			}
			
		}
		sort(array, start, i-1);
		sort(array, i+1, end);
	}
	
	public static int getWays(int n, int m){
		int x=1,y=1;
		for(int j=0;j<n - m;j++){
			x*=(n - j);
			y*=j+1;
		}
		return x/y;
	}

	public static int getWays(long[] array, int number){
		if(number == array.length) return 1;
		int i=1, count=1;
		long val = array[0];
		while(i < number){
			if(array[i] == val) count ++;
			else {
				count = 1;
				val = array[i];
			}
			i++;
		}
		int j = count;
		while(i < array.length){
			if(array[i] == val) count ++;
			else break;
			i++;
		}
		if(j<count) return getWays(count, j);
		else return 1;
		
	}

	public static void main(String[] args) {
		
		int N, A, B, i;
		long[] v;
		
		Scanner scanner = new Scanner(System.in);
		N = scanner.nextInt();
		A = scanner.nextInt();
		B = scanner.nextInt();
		v = new long[N];
		for(i=0;i<N;i++){
			v[i] = scanner.nextLong();
		}
		scanner.close();
		
		sort(v, 0, N-1);
		
		long sum;
		double maxAvg=0,avg;
		int j,ways = 0;
		for(i=A;i<=B;i++){
			sum=0;
			for(j=0;j<i;j++){
				sum += v[j];
			}
			avg = sum / (double)i;
			if(avg > maxAvg){
				maxAvg = avg;
				ways += getWays(v, i);
			} else if(avg == maxAvg){
				ways += getWays(v, i);
			}
		}
		
		System.out.println(maxAvg);
		System.out.println(ways);
	}

}