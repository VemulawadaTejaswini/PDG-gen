import java.util.*;
 
public class Main{
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		String s = sc.next()+sc.next();
		int x = Integer.parseInt(s);
		for(int i=1; i<=500; i++){
			if(i*i==x){
				System.out.println("Yes");
				return;
			}
		}
		System.out.println("No");
		return;
	}
}