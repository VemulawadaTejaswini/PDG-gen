import java.util.*;
import java.math.*;
import java.text.*;

public class Main {
	public static void main(String[] args){
		Scanner in = new Scanner(System.in);
		ArrayList<Integer> prime = new ArrayList<Integer>();
		prime.add(2);
		int n = in.nextInt();
		for(int i=3; i<n; i=i+2){
			boolean check = true;
			for(int j=0; prime.get(j)*prime.get(j)<=i; j++){
				if(i % prime.get(j)==0){
					check = false;
					break;
				}
			}
			if(check){
				prime.add(i);
			}
		}
		System.out.println(prime.size());
	}
}