import java.util.*;
public class Main{

	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		int price = 700;
		String s = sc.next();
		for(int i = 0; i < 3; i++){
			String a = s.substring(i,i+1);
			if(a.equals("o")){
				price += 100;
			}
		}
		System.out.println(price);
	}
}