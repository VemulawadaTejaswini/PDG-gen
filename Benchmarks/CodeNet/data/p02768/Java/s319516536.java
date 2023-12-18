import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		//List<String> list=new ArrayList<String>(Arrays.asList(s.split("")));
		//List<Integer> list=new ArrayList<Integer>();
		//int[] array = new int[1000000000*2];
		double n = sc.nextDouble();
		int a = sc.nextInt();
		int b = sc.nextInt();
		long count=1;
		long answer=0;
		//System.out.println((double)3/2);
		for(double i=1;n+1>i;i++) {
			//System.out.println(n-i+1);
			//System.out.println(i);
			count=(long) (count*(n-i+1)/i);
			answer=answer+count;
			if(i==a || i==b)
				answer=answer-count;
			//System.out.println(count);
		}
		int wari = (int)Math.pow(10, 9)+7;
		int wa = (int) (answer%wari);
		System.out.println(wa);
		//System.out.println(count);
		/*
		long ue_a=1;
		long sita_a=1;
		for(int i=0;a>i;i++) {
			ue_a=ue_a*(n-i);
			sita_a=sita_a*(a-i);
		}
		long aa = ue_a/sita_a;

		//System.out.println(aa);
		long ue_b=1;
		long sita_b=1;
		for(int i=0;b>i;i++) {
			ue_b=ue_b*(n-i);
			sita_b=sita_b*(b-i);
		}
		long bb = ue_b/sita_b;
		//System.out.println(bb);

		System.out.println(answer-aa-bb);
		 */
	}
}