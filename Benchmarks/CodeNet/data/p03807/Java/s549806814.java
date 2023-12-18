import java.util.*;
public class Main {
	static Scanner sc = new Scanner(System.in);
	public static void main(String[] args) {
		long N = sc.nextInt();
		int count=0;
		for (int i=0; i<N;i++){
			long temp = sc.nextLong();
			if(temp%2!=0){
				temp++;
			}
		}
		if(count%2==0){
			System.out.println("Yes");
		}else{
			System.out.println("No");
		}
		

	}

}