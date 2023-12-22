import java.util.Scanner;

class Main{
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		
		while(sc.hasNextInt()){
		int L = sc.nextInt();
		int x = 0;
		int count = 0;
		boolean is = true;
		while(L >= x){
			if(count == 12){
				is = false;
				break;
			}
			x += sc.nextInt() - sc.nextInt();
			count++;
		}
		if(is)System.out.println(count);
		else  System.out.println("NA");
		}
	}
}