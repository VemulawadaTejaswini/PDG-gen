import java.util.*;
import java.util.stream.Collectors;

public class Main {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		List<Integer> list = new ArrayList<Integer>();
		for(int tmp = 0; tmp < n; tmp++) {
			int value = sc.nextInt();
			list.add(value);
		}
		long result = 0;
		for(int tmp = 0; tmp < n; tmp++) {
			Integer number[] = (Integer[])list.toArray(new Integer[list.size()]);
			List<Integer> list2 = new ArrayList<Integer>(Arrays.asList(number)); 
			list2.remove(tmp);
			long gcd = gcdArray(list2,0,n-1);
			if(result < gcd){
				result = gcd;
			}
		}
		System.out.println(result);	
	}
	
	private static int gcdArray(List<Integer> list, int start, int no) {
	      if (no == 1)
	         return list.get(start);
	      else if (no == 2)
	         return gcd(list.get(start), list.get(start + 1));
	      else
	         return gcd(list.get(start), gcdArray(list, start + 1, no - 1));
	  }
	
	
	private static int gcd(int m, int n) {
        if(m < n) return gcd(n, m);
        if(n == 0) return m;
        return gcd(n, m % n);
    }
}