public class Main {
	public static void main(String[] args){
		java.util.Scanner scan = new java.util.Scanner(System.in);
		while(true){
			int n = scan.nextInt();
			int[] x = new int[n];
			int[] y = new int[n];
			double p1,p2,p3,p4;

			for(int i = 0; i < n;i++){
				x[i] = scan.nextInt();
			}
			for(int i = 0;i < n;i++){
				y[i] = scan.nextInt();
			}

			p1 = 0;
			p2 = 0;
			p3 = 0;
			p4 = 0;
			for(int i = 0;i < n;i++){
				p1 += Math.abs(x[i] - y[i]);
				p2 += Math.abs((x[i]-y[i])*(x[i]-y[i]));
				p3 += Math.abs((x[i]-y[i])*(x[i]-y[i])*(x[i]-y[i]));
				if(p4<Math.abs(x[i]-y[i])){
					p4 = Math.abs(x[i]-y[i]);
				}
			}

			System.out.println(p1);
			System.out.println(Math.sqrt(p2));
			System.out.println(Math.cbrt(p3));
			System.out.println(p4);

		}
	}

}