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
		//System.out.println(7/2);
		for(double i=1;n/2+1>i;i++) {
			count=(long) (count*(n-i+1)/i);
			answer=answer+count;
			/*
			if(i==a || i==b)
				answer=answer-count;
			 */
		}
		//System.out.println(answer);
		if(n%2==1)
			answer=answer*2+1;
		else {
			long ue_a=1;
			long sita_a=1;
			for(int i=0;n/2>i;i++) {
				ue_a=(long) (ue_a*(n-i));
				sita_a=(long) ((long)sita_a*(n/2-i));
			}
			long aa = ue_a/sita_a;
			answer=answer*2+1-(aa);
		}
		long aa =1;
		for(double i=1;a+1>i;i++) {
			//System.out.println(n-i+1);
			//System.out.println(i);
			aa=(long) (aa*(n-i+1)/i);
			//System.out.println(count);
		}
		long bb =1;
		for(double i=1;b+1>i;i++) {
			//System.out.println(n-i+1);
			//System.out.println(i);
			bb=(long) (bb*(n-i+1)/i);
			//System.out.println(count);
		}
		answer=answer-aa-bb;
		int wari = (int)Math.pow(10, 9)+7;
		int wa = (int) (answer%wari);
		System.out.println(wa);
	}
}