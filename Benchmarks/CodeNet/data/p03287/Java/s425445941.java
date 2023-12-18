
import java.util.*;
public class Main {
	public static void main(String[] args){		
		Scanner sc = new Scanner(System.in);
		int a = sc.nextInt();
		int b = sc.nextInt();
		
		int[] c = new int[a];
		for(int i=0;i<a;i++){
			c[i] = sc.nextInt();
		}
		sc.close();
		
		int result = 0;
		long num = 0;
		for(int i=0;i<a;i++){
			for(int j=i;j<a;j++){
				num += c[j];
				if(num%b == 0){
					result++;
					num = 0;
				}
			}
		}
		System.out.println(result);
	}
}
