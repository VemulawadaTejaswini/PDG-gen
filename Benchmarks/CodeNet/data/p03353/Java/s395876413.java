import java.util.Scanner;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
public class Main{
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		String s=sc.next();
		int k=sc.nextInt();
		HashSet<String> list=new HashSet<>();
		
		for(int i=0; i<s.length(); i++){
			for(int j=1; j<=Math.min(k,s.length()-i); j++){
				list.add(s.substring(i,i+j));
			}
		}
		ArrayList<String> ll=new ArrayList<>(list);
		Collections.sort(ll);
		System.out.println(ll.get(k-1));
	}
}

