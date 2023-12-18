import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.Scanner;

public class Main{
	
	public static void main(String[] args){
		
		Scanner sc = new Scanner(System.in);
		
		int n = sc.nextInt();
		List<Integer> a = new ArrayList<>();
		
		for(int i = 0; i < n; i++){
			a.add(sc.nextInt());
		}
		sc.close();
		
		a.sort(Comparator.comparing(I -> I));
		System.out.println(isAbleArray(a));
		if(isAbleArray(a)) System.out.println(count(n));
		else System.out.println(0);
		
	}
	
	static boolean isAbleArray(List<Integer> list){
		if(list.size() % 2 == 0){
			int k = 1;
			for(int i = 0; i < list.size(); i++){
				if(list.get(i) != k) return false;
				if(i % 2 == 1) k = k + 2;
			}
		}else{
			int k = 0;
			for(int i = 0; i < list.size(); i++){
				if(list.get(i) != k) return false;
				if(i % 2 == 0) k = k + 2;
			}
		}
		return true;
	}
	
	static long count(int n){
		System.out.println("counting...");
		long result = 1;
		if(n % 2 == 1){
			for(int i = 0; i < (n - 1)/2; i++){
				result = (result * 2) % 1_000_000_007;
				System.out.println(result);
			}
		}else{
			for(int i = 0; i < n / 2; i++){
				result = (result * 2) % 1_000_000_007;
				System.out.println(result);
			}
		}
		return result;
	}
}
