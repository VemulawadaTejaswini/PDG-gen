import java.util.Arrays;
import java.util.Comparator;
import java.util.Scanner;

public class Main {
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int ch = sc.nextInt();
		double s[][] = new double[n][3];
		for(int i=0; i<n; i++){
			s[i][0] = sc.nextInt();
			s[i][1] = sc.nextInt();
			s[i][2] = sc.nextInt();
		}
		sc.close();

		double[] rec = new double[ch];
		double[] recch = new double[ch];
		int num = 1;

		Arrays.sort(s, new Comparator<double[]>() {
			@Override
			public int compare(double[] a, double[] b) {
				return Double.compare(a[0], b[0]);
			}
		});

		for(int i=0; i<n; i++){
			boolean can = false;

			for(int j=0; j<num; j++){
				if(recch[j] == 0 || recch[j] == s[i][2]){
					if(rec[j] <=s[i][0]){
						rec[j] = s[i][1];
						recch[j] = s[i][2];
						can = true;
						break;
					}
				}else{
					if(rec[j] <s[i][0]-0.5d){
						rec[j] = s[i][1];
						recch[j] = s[i][2];
						can = true;
						break;
					}
				}
			}
			if(!can){
				num++;
				rec[num-1] = s[i][1];
				recch[num-1] = s[i][2];
			}
			
		}
		System.out.println(num);
	}
}