import java.util.Scanner;
import java.util.List;
import java.util.ArrayList;
public class Main{
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		String a = sc.next();
		String v = sc.next();
		List<Character> list1 = new ArrayList<>();
		List<Character> list2 = new ArrayList<>();
		for(int i = 0; i<a.length(); i++){
			list1.add(a.charAt(i));
			list2.add(v.charAt(i));
		}
		for(int i = 0; i<a.length(); i++){
			if(list1.get(i) != list2.get(i)){
				a.replace(list1.get(i),list2.get(i));
			}
		}
		if(a==v){
			System.out.println("Yes");
		}
		System.out.println("No");
	}
}