import java.util.Scanner;

public class Main {
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		int a = sc.nextInt();
		int b = sc.nextInt();
		int c = sc.nextInt();
		int i;
		if(a<b){
			if(b<c){
				System.out.println("%d %d %d", a, b, c);
			}else if(c<a){
				System.out.println("%d %d %d", c, a, b);
			}else{
				System.out.println("%d %d %d", a, c, b);
			}
		}
		else if(b<c){
			if(c<a){
				System.out.println("%d %d %d", b, c, a);
			}else{
				System.out.println("%d %d %d", b, a, c);
			}
		}
		else{
			System.out.println("%d %d %d", c, b, a);
		}
	}
}