import java.util.*;
public class Main{
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		int a = sc.nextInt();
		int b = sc.nextInt();
		int k = sc.nextInt();
		for(int i=0; i<k; i++){
			if(i%2==0){
				a /= 2;
				b += a;
			}
			else{
				b /= 2;
				a += b;
			}
		}
		System.out.println(a + " " + b);
	}
}