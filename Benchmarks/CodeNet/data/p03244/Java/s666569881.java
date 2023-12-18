import java.util.*;
class Main{
	static Scanner scan = new Scanner(System.in);
	public static void main(String[] argv){
		int n = scan.nextInt();
		Map<Integer, Integer> mapEven = new HashMap<>();
		Map<Integer, Integer> mapOdd = new HashMap<>();
		int cEven = 1, cOdd = 1;
		int mid;
		for(int i=0;i<n;i++){
			int temp = scan.nextInt();
			if(i%2==0){
				if(mapEven.containsKey(temp)){
					mid = mapEven.get(temp)+1;
					cEven = Math.max(mid, cEven);
					mapEven.put(temp,mid);
				}
				else{
					mapEven.put(temp,1);
				}
			}
			else{
				if(mapOdd.containsKey(temp)){
					mid = mapOdd.get(temp)+1;
					cOdd = Math.max(mid, cOdd);
					mapOdd.put(temp,mid);
				}
				else{
					mapOdd.put(temp,1);
				}
			}
		}
		int count = 0;
		int n1 = n/2;
		if(n1!=cOdd){count = n1 - cOdd;}
		else{count = 0;}
		int n0 = n-n1;
		if(n0!=cEven){count += n0 - cEven;}
		
		System.out.println(count);
	}
}