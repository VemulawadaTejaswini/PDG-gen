import java.io.*;

class Main{
	public static void main(String[] args)throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		

		String nRead = br.readLine();
		String str = br.readLine();
		String strArr[] = str.split(" ");
		int n=Integer.parseInt(nRead);
		int a[] = new int[n];
		int min=-1000000, max=1000000, sum=0;

		for(int i=0; i<n; i++){
			a[i] = Integer.parseInt(strArr[i]);
		}

		min = min(a, n);
		max = max(a, n);
		sum = sum(a, n);

		System.out.printf("%d %d %d\n", min, max, sum);

		
	}



	public static int min(int[] a, int n){
		int tmp;
		tmp = a[0];
		for(int i=0; i<n; i++){
			if(a[i]<tmp){
				tmp = a[i];
			}
		}
		return tmp;
	}

	public static int max(int[] a, int n){
		int tmp;
		tmp = a[0];
		for(int i=0; i<n; i++){
			if(a[i]>tmp){
				tmp = a[i];
			}
		}
		return tmp;
	}

	public static int sum(int[] a, int n){
		int sum;
		sum = 0;
		for(int i=0; i<n; i++){
			sum += a[i];
		}
		return sum;
	}
}