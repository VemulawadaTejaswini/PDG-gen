import java.util.Scanner;

class Main {
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		int x;
		x=sc.nextInt();
		int count=1;
		while(x != 0){
			System.out.println("Case" + count + ": " +x);
			x = sc.nextInt();
			count++;
			if(x == 0)break;	
		}
	}
}