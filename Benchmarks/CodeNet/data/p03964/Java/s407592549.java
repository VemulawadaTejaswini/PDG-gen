import java.util.Scanner;
class Main{
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int reports=sc.nextInt();
		long takahashi=sc.nextLong();
		long aoki=sc.nextLong();
		for(int i=1; i<reports; i++) {
			long next_takahashi=sc.nextLong();
			long next_aoki=sc.nextLong();
			long multiplier=Math.max(takahashi/next_takahashi, aoki/next_aoki);
			while(next_aoki*multiplier>aoki || next_takahashi*multiplier>takahashi) {
				multiplier++;
			}
			takahashi=next_takahashi*multiplier;
			aoki=next_aoki*multiplier;
		}
		System.out.println(takahashi+aoki);
	}
}