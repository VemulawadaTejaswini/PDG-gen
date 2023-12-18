import java.util.*;

public class Main {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int[] numbers = new int[210];
		int N=sc.nextInt();
		for(int i=0; i<N; i++) {
			numbers[i]=sc.nextInt(); 
		}
		
		int cnt=0;		//カウント用
		for(int i=0; i<numbers.length; i++) {
			if(numbers[i]%2==0) {
				numbers[i]=numbers[i]/2;
			}else {
				break;
			}
		}
		
		System.out.println(cnt);
	}

}
