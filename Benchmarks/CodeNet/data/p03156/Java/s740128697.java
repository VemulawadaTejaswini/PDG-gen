import java.util.Scanner;
public class Main{
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		int a = sc.nextInt();
		int b = sc.nextInt();
		int c = sc.nextInt();
		int min = 0;
		int midle = 0;
		int max = 0;
		
		for(int i = 0; i < a; i++){
			int d = sc.nextInt();
			if(d<=b){
				min++;
			}else if(b+1<=d && d<=c){
				midle++;
			}else if(d>=c+1){
				max++;
			}
		}
		System.out.println(Math.min(Math.min(min,max),midle));
	}
}