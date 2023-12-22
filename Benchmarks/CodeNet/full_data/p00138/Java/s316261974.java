import java.util.Arrays;
import java.util.Scanner;

public class Main {
	void doIt(){
		Scanner in = new Scanner(System.in);
		int j;
		int race = 8;
		double[] a = new double [24];
		double[][] b = new double [3][8];
		double[] c = new double [24];
		for(int i = 0;i < 24;i++){
			j = in.nextInt();
			a[j-1] = in.nextDouble();
			if(j > race*2) b[2][(j-1) % 8] = a[j-1];
			else if(j > race) b[1][(j-1) % 8] = a[j-1];
			else b[0][(j-1) % 8] = a[j-1];
			c[j-1] = a[j-1];
		}
		fast f = new fast(race,b);
		fast f2 = new fast(3,2,race,b,a);
		Arrays.sort(a);
		fast f3 = new fast(3,race*3,c,a);
	}
	public static void main(String[] args){
		new Main().doIt();
	}
	class fast {
		int i;
		fast(int i,double[][] b){
			Arrays.sort(b[0]);
			Arrays.sort(b[1]);
			Arrays.sort(b[2]);
		}
		fast(int i2,int l2,int race,double[][] b,double[] a){
			for(int i = 0;i < i2;i++){
				for(int l = 0;l < l2;l++){
					for(int k = 0;k < race*(i+1);k++){
						if(b[i][l] == a[k]){
							System.out.println((k+1) + " " + a[k]);
							a[k] = 0;
						}
					}
				}
			}
		}
		fast(int i2,int race,double[]  c,double[] a){
			for(int l = 6;l < 8;l++){
				for(int k = 0;k < race;k++){	
					if(a[l] == c[k]) System.out.println((k+1) + " " + c[k]);
				}
			}
		}
	}
}