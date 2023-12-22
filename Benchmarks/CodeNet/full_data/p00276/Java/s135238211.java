import java.util.Scanner;

class Main{
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		
		int x = sc.nextInt(),c,a,n,count;
		
		for(int i = 0; i < x; i++){
			
			count = 0;
			c = sc.nextInt();
			a = sc.nextInt();
			n = sc.nextInt();
			
			while(c != 0 && a != 0 && n != 0){
				c--;
				a--;
				n--;
				count++;
			}
			while(c > 1 && a != 0){
				c -= 2;
				a--;
				count++;
			}
			while(c > 2){
				c -= 3;
				count++;
			}
			System.out.println(count);
		}
		sc.close();
	}
}