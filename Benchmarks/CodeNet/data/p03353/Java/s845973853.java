import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		String str = sc.next();
		int a = sc.nextInt();
		int size = str.length();
//		System.out.println("size="+size);
		
		List<String> array = new ArrayList<String>();
		
		for(int i = 0; i<str.length(); i++){
			for(int j=i+1; j<=str.length(); j++){
//				System.out.println(i+" ,"+j);
				array.add(str.substring(i, j));
			}
		}
		Collections.sort(array);
		
		for(String s : array){
//			System.out.println(s);	
		}
		
		
//		System.out.println("size = "+array.size());		
		System.out.println(array.get(a-1));
		
	}

}
