import java.util.*;
public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int n = sc.nextInt();
		int k = sc.nextInt();
		Set<Integer> set = new HashSet<Integer>();
		for(int i=0;i<k;i++){
			set.add(sc.nextInt());
		}
		
		while(true){
			boolean has = contain(n, set);
			if(has)
				n++;
			else
				break;
		}
		
		System.out.println(n);
	}
	static boolean contain(int n, Set<Integer> set){
		while(n>0){
			if(set.contains(n%10))
				return true;
			n/=10;
		}
		return false;
	}
}
