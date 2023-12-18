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

	public static int getWays(long[] array, int start, int count){
		if(start+count-1 >= array.length) return 0;
		if(count <= 0) return 1;

		long val = array[start];
		int n=1, i;
		for(i=start+1;i<array.length;i++){
			if(array[i] == val){
				n++;
			} else break;
		}
		if(i == array.length){
			int x=1,y=1;
			for(int j=0;j<n-count;j++){
				x*=(n - j);
				y*=j+1;
			}
			return x/y;
		}
		return n * getWays(array, start+1, count-1);
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
		int j,k, useB, ways = 0;
		for(i=A;i<=B;i++){
			sum=0;
			for(j=0;j<i;j++){
				sum += v[j];
			}
			avg = sum / (double)i;
			if(avg > maxAvg){
				maxAvg = avg;
				ways += getWays(v, 0, i);
			} else if(avg == maxAvg){
				ways += getWays(v, 0, i);
			}
		}
		
		System.out.println(maxAvg);
		System.out.println(ways);
	}

}