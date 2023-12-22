import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
public class Main {
	static int count = 0;
	public static void main(String[] args){
		@SuppressWarnings("resource")
		Scanner sc2 = new Scanner(System.in);
		
		int n = Integer.parseInt(sc2.nextLine());
		String[] s = sc2.nextLine().split("[\\s]+");
		
		List<Integer> x = new ArrayList<Integer>();
		for(int i=0;i<n;i++){
			if(!x.contains(Integer.parseInt(s[i]))) x.add(Integer.parseInt(s[i]));
		}
		
		int n2 = Integer.parseInt(sc2.nextLine());
		String[] s2 = sc2.nextLine().split("[\\s]+");
		List<Integer> x2 = new ArrayList<Integer>();
		
		if(s2[0].equals("")){
			for(int i=0;i<n2;i++){
				if(!x2.contains(Integer.parseInt(s2[i+1]))) x2.add(Integer.parseInt(s2[i+1]));
			}
		}else{
			for(int i=0;i<n2;i++){
				if(!x2.contains(Integer.parseInt(s2[i]))) x2.add(Integer.parseInt(s2[i]));
			}
		}
		
		for(int i=0;i<x2.size();i++){
			if(x.contains(x2.get(i))) count++;
			
		}
		System.out.println(count);
	}
}