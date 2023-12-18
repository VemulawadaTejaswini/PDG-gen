import java.util.*;
class Main{
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int width = sc.nextInt();
		int a = sc.nextInt();
		int b = sc.nextInt();
		if(b-(width+a)<=0){
			System.out.println(0);
		}else if(a+width<b){
			System.out.println(b-(width+a));
		}else if(a+width>b){
			System.out.println(a-(width+b));
		}
	}
}