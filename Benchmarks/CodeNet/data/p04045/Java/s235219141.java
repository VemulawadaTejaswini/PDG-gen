import java.util.ArrayList;
import java.util.Scanner;

class Main {

	public static void main(String args[]){

		Scanner scan = new Scanner(System.in);
		int price,n;
		price = scan.nextInt();
		n = scan.nextInt();
		ArrayList<Integer> ok = new ArrayList<Integer>();

		for(int i = 0; i < 10; i++)ok.add(i);

		int buf;

		for(int i = 0; i < n; i++){
			buf = scan.nextInt();
			ok.remove(buf-i);
		}
		
		int ans = price;
		while(ans <= 10 * price)
			if(check(ans,ok))break;
			else ans++;
		System.out.print(ans);
	}
	static Boolean check(int x, ArrayList<Integer> A){
		Boolean flag = false;
		while(x>0){
			for(int i = 0; i < A.size(); i++){
				if(x % 10 == A.get(i))flag = true;
			}
			if(!flag)return(flag);
			flag = false;
			x /= 10;
		}
		return(true);
	}
}