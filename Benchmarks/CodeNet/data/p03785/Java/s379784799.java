import java.util.Arrays;
import java.util.Scanner;
public class Main {
	public static void main(String[] args){
		Scanner as = new Scanner(System.in);
		int n = as.nextInt();
		int c = as.nextInt();
		int k = as.nextInt();
		int[] a;
		a = new int[n];
		for(int i=0;i<n;i++){
			a[i] = Integer.parseInt(as.next());
		}
		Arrays.sort(a); 
		int l = 0;
		long q = 0;
		int e = 0;
		boolean w = true;
		for(int i=0;i<n;i++){
			if(w){
				l++;
				e++;
				q = a[i];
				w = false;
			}else{
				if(e<c&&q+k>=a[i]){
					e++;
				}else{
					i--;
					e = 0;
					w = true;
				}
			}
		}
		System.out.println(l);
	}
}