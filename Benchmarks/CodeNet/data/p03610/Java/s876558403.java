import java.util.ArrayList;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) throws Exception {
		Scanner sc = new Scanner(System.in);
		String a = sc.next();
		ArrayList array = new ArrayList();
		array.add(a.split(""));
		String b = "";
		for(int i = 0;i<array.size();i++){
			if(i%2==0){
				b += (String)array.get(i);
			}
		}
		System.out.println(b);
	}
	
}