import java.util.*;
class Main{
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int width = sc.nextInt();
		int a = sc.nextInt();
		int b = sc.nextInt();
		if(Math.abs(a-b)<=width){
			System.out.println(0);
		}else{
			System.out.println(Math.abs((a-b)-width));
		}
	}
}