import java.util.*;
public class Main {
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		// 整数の入力
		int a = sc.nextInt();		

		List<Long> list = new ArrayList<>();
		for(int i=0;i< a;i++){
			list.add(sc.nextLong());
		}
		Collections.sort(list);
		
		long kbs =1;
		for(int i=0;i< a-1;i++){
			kbs = lcm(kbs,list.get(i));
		}
		//System.out.println("ksb "+kbs);

		long result = 0;
		for(int j=0;j< kbs;j++){
			long sum = 0;

			for(int i=0;i< a;i++){
				sum = sum + j%list.get(i);
			}
			// System.out.println(sum);

			if(result<=sum){
				result = sum;
			}

		}
		System.out.println(result);

	}


private static long lcm(long m, long n) {
    return m * n / gcd(m, n);
}

private static long gcd(long m, long n) {
    if(m < n) return gcd(n, m);
    if(n == 0) return m;
    return gcd(n, m % n);
}


}