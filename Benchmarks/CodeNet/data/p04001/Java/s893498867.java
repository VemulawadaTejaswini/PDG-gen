import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String s = sc.next();
		sc.close();

		int n = s.length();
		int[] str = new int[n];
		for(int i = 0; i<n;i++) 	str[i] = Character.getNumericValue(s.charAt(i));

		long ans = 0;
		long tmp = 0;

		for(int i=0; i<Math.pow(2, n-1); i++) {
			tmp = str[0];
			for(int j=0; j<n-1;j++) {
				String bin = Integer.toBinaryString(i);
				int foo = Integer.valueOf(bin);
				if((foo & (1<<j))>0){
					ans += tmp;
					tmp = 0;
				}
				tmp *= 10;
				tmp +=str[j+1];
			}
			ans+=tmp;
		}
		System.out.println(ans);
	}
}
