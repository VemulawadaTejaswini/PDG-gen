import java.util.*;
import java.lang.*;
import java.io.*;

public class Main{
public static void main (String[] args){
		Scanner sc = new Scanner(System.in);
		int n = Integer.parseInt(sc.next());
		List<Integer> a = new ArrayList<Integer>();
		List<Integer> b = new ArrayList<Integer>();
		int count = 0;
		for(int i = 0; i <= n; i++)
			a.add(Integer.parseInt(sc.next()));
		for(int i = 0; i < n; i++)
			b.add(Integer.parseInt(sc.next()));
		for(int i = 0; i < n; i++){
			if(a.get(i) < b.get(i)){
				count += a.get(i);
				b.set(i,b.get(i)-a.get(i));
				if(b.get(i) > a.get(i+1)){
					count += a.get(i+1);
				}else{
					count += b.get(i);
					a.set(i+1,a.get(i+1)-b.get(i));
				}
			}else{
				count += b.get(i);
				a.set(i,a.get(i)-b.get(i));
			}	
		}
		System.out.println(count);
}
}