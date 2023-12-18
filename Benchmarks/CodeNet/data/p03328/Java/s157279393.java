import java.util.*;

class Main{
	
	public static void main(String args[]){

		Scanner sc = new Scanner(System.in);
		int a = sc.nextInt();
		int b = sc.nextInt();

		int n = 1;
		int cnt = 0;
		while(true){
			cnt += n;
			if(a<cnt && cnt<b) break;
			n++;
		}
		System.out.println(cnt-a);

	}
}