import java.util.Scanner;

public class Main {
	public static void main(String[] args){



		Scanner sc = new Scanner(System.in);
		// 整数の入力
		int n = sc.nextInt();
		String s = sc.next();
		String[] ss = s.split("");
		boolean ans = false;
		if(n%2!=0) {
			
		}else {
			for(int i=0;i<n/2;i++) {
				if(ss[i].equals(ss[i+n/2])) {
					ans = true;
				}else {
					ans = false;
					break;
				}
			}
		}
		if(ans) {
			System.out.println("Yes");
		}else {
			System.out.println("No");
		}
		
		
		
		
		
	}

	

}
/*
class City{
	int order;
	int prefecture;
	int year;
	int number;
	City(int order,int prefecture, int year){
		this.order = order;
		this.prefecture = prefecture;
		this.year = year;
	}
}
*/
