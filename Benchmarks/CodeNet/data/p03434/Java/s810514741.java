import java.util.*;

public class Main{
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		
		int n = sc.nextInt();
		List<Integer> a = new ArrayList<>();
		for(int i=0; i<n; i++){
			a.add(sc.nextInt());
		}
		Collections.sort(a, (i1, i2) -> i2.compareTo(i1));
		int alice = 0, bob = 0;
		for(int i=0; i<n; i++){
			if(i % 2 == 0){
				alice += a.get(i);
			}else{
				bob += a.get(i);
			}
		}
		System.out.println(alice - bob);
	}
}
