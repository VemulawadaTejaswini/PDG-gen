import java.util.Scanner;

class Main {
	public static void main(String args[]){
		Main app = new Main();
		Scanner scan = new Scanner(System.in);
		while(true){
			int n = scan.nextInt();
			if(n==0){
				break;
			}
			int num = app.countNum(n);
			System.out.println(app.toYear(num));
		}
	}
	
	public int countNum(int n){
		int count;
		
		if(n==1){
			count = 1;
		}else if(n==2){
			count = 2;
		}else if(n==3){
			count = 4;
		}else{
			count = countNum(n-3)+countNum(n-2)+countNum(n-1);
		}
		
		return count;
	}
	
	public int toYear(int num){
		return (num/10/365)+1;
	}
}