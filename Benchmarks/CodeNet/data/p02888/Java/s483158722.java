import java.util.Arrays;
import java.util.Comparator;
import java.util.Scanner;
 
public class Main {
	public static void main(String[] args){
 
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		int ans = 0;
		
		Integer[] lengthArray = new Integer[N];
		for(int i = 0; i < N; i++) {
			lengthArray[i] = sc.nextInt();
		}
		Arrays.sort(lengthArray, Comparator.reverseOrder());
		
		for(int i = 0; i < N; i++) {
			for(int j = i+1; j < N; j++) {
				for(int k = j+1; k < N; k++) {
					int a = lengthArray[i];
					int b = lengthArray[j];
					int c = lengthArray[k];
					if(a<b+c && b<c+a && c<a+b) {
						ans++;
					}
				}
			}
		}
		System.out.println(ans);
		sc.close();
	}
}