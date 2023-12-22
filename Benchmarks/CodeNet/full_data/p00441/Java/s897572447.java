import java.util.*;
public class Main {

	public static void main(String[] args) {
		Scanner stdIn = new Scanner(System.in);
		while(true) {
			ArrayList<int[]> tmp = new ArrayList<int[]>();
			int n = stdIn.nextInt();
			if(n == 0) break;
			int max = 0;
			for(int i = 0; i < n; i++) {
				int[] cc = new int[2];
				cc[0] = stdIn.nextInt();
				cc[1] = stdIn.nextInt();
				tmp.add(cc);
			}
			for(int i = 0; i < n; i++) {
				for(int j = 0; j < n; j++) {
					for(int k = 0; k < n; k++) {
						for(int l = 0; l < n; l++) {
							int a = check(tmp.get(i),tmp.get(j),tmp.get(k),tmp.get(l));
							if(max < a) max = a;
						}
					}
				}
			}
			System.out.println(max);
			System.gc();
		}
		
	}
	public static int check(int[] p1, int[] p2, int [] p3, int[] p4) {
		int[] x = new int[4];
		int[] y = new int[4];
		int[] tmp = new int[6];
		int counter = 0;
		x[0] = p1[0];
		x[1] = p2[0];
		x[2] = p3[0];
		x[3] = p4[0];
		y[0] = p1[1];
		y[1] = p2[1];
		y[2] = p3[1];
		y[3] = p4[1];
		for(int i = 0; i < 4; i++) {
			for(int j = i+1; j < 4; j++) {
				tmp[counter++] = (x[i] - x[j])*(x[i] - x[j])+(y[i] - y[j])*(y[i] - y[j]);
			}
		}
		Arrays.sort(tmp);
		if(tmp[0] == tmp[1] && tmp[1] == tmp[2] && tmp[2] == tmp[3] && tmp[3]*2 == tmp[4] && tmp[3]*2 == tmp[5]){
			return tmp[0];
		}
		return -1;
		
	}

}