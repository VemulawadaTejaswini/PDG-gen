import java.util.Scanner;
 
public class Main {
 
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int n = scanner.nextInt();
		int[] a = new int[n];
		int[] s = new int[n];
		long sum = 0;
		a[0] = scanner.nextInt();
		sum += a[0];
 
		boolean check;
		if(a[0] < 0){
			check = false;
		}else{
			check = true;
		}
		long count = 0;
		for(int i=1;i<n;i++){
			a[i] = scanner.nextInt();
			long x = sum + a[i];
			long y = 0;
			if(check && x >= 0){
				y = -1 - x;
			}else if(!check && x < 0){
				y = 1 - x;
			}else if(!check && x == 0){
				y = 1;
			}
 
			a[i] += y;
			count += Math.abs(y);
			sum += a[i];
			//System.out.println(y + " " + a[i] + " " + sum);
			check = !check;
		}
		if(sum == 0){
			count ++;
		}
		System.out.println(count);
 
	}
 
}