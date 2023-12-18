import java.util.*;
public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String a = sc.nextLine();
		String[] fruit =a.split("",0);
		int b =0;
		for(int i =0;i<(fruit.length)/2;i++) {
			if(fruit[i]!=fruit[fruit.length-(1+i)]) { 
				b++;
			}
		}
		System.out.println(b);
	}
}