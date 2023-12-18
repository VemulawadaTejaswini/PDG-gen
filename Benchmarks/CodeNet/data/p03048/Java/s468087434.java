import java.util.*;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		//一列をintのArrayListに変換
		List<String> l = Arrays.asList(sc.nextLine().split(" "));
		ArrayList<Integer> nl = new ArrayList<Integer>();
		for(String s: l) {
			nl.add(Integer.parseInt(s));
		}
		int r = nl.get(0);
		int g = nl.get(1);
		int b = nl.get(2);
		int n = nl.get(3);
		int k = 0;
		int result = 0;

		for(int i=0;i<=n;i++) {
			for(int j=0;j<=n;j++) {
				if(i==0&&j==0) {
					if((float)n%(float)b==0) {
						result++;
					}
				}else if(i*r+j*g==n) {
					result++;
				}else if(n-(i*r+j*g) > 0 && (float)(n-(i*r+j*g)) % (float)b==0) {
					result++;
				}
			}
		}
		System.out.println(result);
	}
}