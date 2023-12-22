import java.util.Scanner;

class Main
{
	public static void main(String[] args){
		Scanner scan = new Scanner(System.in);
		
		int kai = 0;
		
		int x = scan.nextInt();
		int y = scan.nextInt();
		
		for(int i=1; i<=x/2 || i<=y/2; i++){
			if(x%i==0 && y%i==0){
				kai = i;
			}
		}
		if(x==y){
			kai = x;
		}
		
		System.out.println(kai);
	}
}
