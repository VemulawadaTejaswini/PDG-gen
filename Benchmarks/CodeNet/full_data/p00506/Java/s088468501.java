import java.util.*;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int n = sc.nextInt();
		int[] num = new int[3];
		
		for(int i=0;i<n;i++){
			num[i] = sc.nextInt();
		}
		if(num[2]==0)num[2]=num[1];
		Arrays.sort(num);
		
		for(int i=1;i<=num[0];i++){
			if(num[0]%i==0 && num[1]%i==0 && num[2]%i==0)System.out.println(i);
		}
		
	}
}