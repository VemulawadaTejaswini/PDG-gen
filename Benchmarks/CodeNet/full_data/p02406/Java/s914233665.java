import java.util.Scanner;

class Main{
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int x;
		for(int i=3; i<=n; i++){
			x = i;
			if(x%3==0){
				System.out.print(" " + x);
				continue;
			}
			while(x!=0){
				if(x%10==3){
					System.out.print(" " + x);
					break;
				}
				x /= 10;
			}
		}
		System.out.println();
	}
}