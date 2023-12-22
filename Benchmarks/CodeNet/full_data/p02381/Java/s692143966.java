public class Main {
	public static void main(String[] args){
		java.util.Scanner scan = new java.util.Scanner(System.in);
		int n = scan.nextInt();
		int[] s = new int[n];
		double sum,m ,a,a2;

		while(true){
			if(n == 0){
				break;
			}
			for(int i = 0;i < n;i++){
				s[n] = scan.nextInt();
			}
			sum = 0;
			for(int i = 0; i < s.length;i++){
				sum += s[i];
			}
			m =sum/n;

			a = 0;
			for(int i = 1;i <= n;i++){
				a2 =(s[i] - m)*(s[i] - m)/n ;
				a = Math.sqrt(a2);
			}
			System.out.println(a);
		}
	}

}