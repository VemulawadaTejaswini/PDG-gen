import java.util.*;
import java.text.*;

public class Main {
	public static void main(String args[]){
		Scanner in = new Scanner(System.in);
		ArrayList<Integer> prime = new ArrayList<Integer>();
		prime.add(6);
		for(int i=1; i*7<310000; i++){
			boolean check = true;
			for(int j=0; Math.sqrt(i*7+1)>=prime.get(j); j++){
				if((i*7+1)%prime.get(j)==0){
					check = false;
					break;
				}
			}
			if(check) prime.add(i*7+1);

			check = true;
			for(int j=0; Math.sqrt(i*7+6)>=prime.get(j); j++){
				if((i*7+6)%prime.get(j)==0){
					check = false;
					break;
				}
			}
			if(check) prime.add(i*7+6);
		}
		ArrayList<Integer> ans = new ArrayList<Integer>();
		while(true){
			int n = in.nextInt();
			System.out.print(n+": ");
			if(n==1) break;
			for(int i=0; prime.get(i)<=n; i++){
				if(n%prime.get(i)==0) ans.add(prime.get(i));
			}
			for(int i=0; i<ans.size()-1; i++){
				System.out.print(ans.get(i)+" ");
			}
			System.out.println(ans.get(ans.size()-1));
			ans.clear();
		}
	}
}