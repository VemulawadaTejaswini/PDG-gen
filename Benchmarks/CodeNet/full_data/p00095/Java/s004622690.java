import java.util.Scanner;

class Main{
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		
		int n = sc.nextInt(),x = 0,y,max = 0;
		
		for(int i = 0; i < n; i++){
			x = Math.max(x, (y = sc.nextInt()));
			if(y == x)max = i + 1;
		}
		System.out.println(max + " " + x);
		
		sc.close();
		}
}