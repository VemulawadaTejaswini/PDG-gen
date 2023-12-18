public class Main {
	public static void main(String[] args) {
		java.util.Scanner s = new java.util.Scanner(System.in);
		int n= s.nextInt();
		int x =s.nextInt();
		Integer[] l=new Integer[n];
		for(int i=0;i<n;i++) {
			l[i]=s.nextInt();
		}
		System.out.println(Main.calc(x,l));
	}

	public static int calc(int x,Integer[] l) {

		long sum=0;
		int count=0;
		if(0<=x) {
			count++;
		}
		for(int i=0;i<l.length;i++) {
			sum+=l[i];
			if(sum<=x) {
				count++;
			}else {
				break;
			}

		}
		return count;
	}
}