import java.util.Scanner;

class Main{
	public static void main(String[] args) {
		try(Scanner sc = new Scanner(System.in)){
			int n = sc.nextInt();
			int[] x = new int[n];
			int[] y = new int[n];
			for(int i=0;i<n;i++) {
				x[i] = sc.nextInt();
			}
			for(int i=0;i<n;i++) {
				y[i] = sc.nextInt();
			}
			double[] m_d = new double[4];
			for(int i=0;i<n;i++) {
				m_d[0] += Math.abs(x[i]-y[i]);
				m_d[1] += Math.pow(Math.abs(x[i]-y[i]),2);
				m_d[2] += Math.pow(Math.abs(x[i]-y[i]),3);
				m_d[3] = Math.max(m_d[3], Math.abs(x[i]-y[i]));
			}
			
			System.out.println(m_d[0]);
			System.out.println(Math.sqrt(m_d[1]));
			System.out.println(Math.cbrt(m_d[2]));
			System.out.println(m_d[3]);
		}
	}
}
