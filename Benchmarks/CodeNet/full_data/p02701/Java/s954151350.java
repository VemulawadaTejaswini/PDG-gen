import java.util.Scanner;
import java.util.Arrays;
public class Main{
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		String[] s = new String[n];
		for(int i=0; i<n; i++){
			s[i] = sc.next();
		}
		Arrays.sort(s);
		int result = n;
		for(int i=0; i<n-1; i++){
			if(s[i].equals(s[i+1])){
				result--;
			}
		}
		System.out.println(result);
	}
}
