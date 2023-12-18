import java.util.*;

public class Main {
	static int N=26;
	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		N = sc.nextInt();
		int data[] =new int[N];

		ArrayList<Double> ar =new ArrayList<Double>();
	
		for(int i=0;i<data.length;i++) {
			double a=sc.nextInt();
			ar.add(a);
		}
		Collections.sort(ar);
		while(true) {
			double t1 =ar.get(0)+ar.get(1);
			double  t2= (double)t1 / 2;
			ar.remove(0);
			ar.remove(0);
			ar.add(t2);
			if(ar.size()==1)break;
		}
		System.out.println(ar.get(0));
		
		
		

	}

}
