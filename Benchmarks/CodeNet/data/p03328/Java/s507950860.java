import java.util.*;

class Main{
	
	public static void main(String args[]){

		Scanner sc = new Scanner(System.in);
		int a = sc.nextInt();
		int b = sc.nextInt();

		int cnt = 0;
		for(int n=1;n<b-a;n++){
			cnt += n;
		}
		System.out.println(cnt-a);

	}
}