import java.util.*;

public class Main {
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);

		ArrayList<Integer> bData = new ArrayList<>();
		ArrayList<Integer> fData = new ArrayList<>();
		ArrayList<Integer> rData = new ArrayList<>();
		ArrayList<Integer> vData = new ArrayList<>();
		
		int firBuild[][] = new int[10][3];
		int secoBuild[][] = new int[10][3];
		int thiBuild[][] = new int[10][3];
		int forBuild[][] = new int[10][3];
		
		//??\?????????
		int n = sc.nextInt();
		int b, f, r, v = 0;
		for(int i = 0; i < n; i++) {
			b = sc.nextInt();
			f = sc.nextInt();
			r = sc.nextInt();
			v = sc.nextInt();
			bData.add(b);
			fData.add(f);
			rData.add(r);
			vData.add(v);
		}
		
		//???????????????
		for(int j = 0; j < 3; j++) {
			for(int i = 0; i < 10; i++) {
				firBuild[i][j] = 0;
				secoBuild[i][j] = 0;
				thiBuild[i][j] = 0;
				forBuild[i][j] = 0;
			}
		}
		
		//?????????????´?
		for(int i = 0; i < n; i++) {
			if(bData.get(i) == 1) {
				firBuild[rData.get(i)-1][fData.get(i)-1] = vData.get(i) + firBuild[rData.get(i)-1][fData.get(i)-1];
			} else if(bData.get(i) == 2) {
				secoBuild[rData.get(i)-1][fData.get(i)-1] = vData.get(i) + secoBuild[rData.get(i)-1][fData.get(i)-1];
			} else if(bData.get(i) == 3) {
				thiBuild[rData.get(i)-1][fData.get(i)-1] = vData.get(i) + thiBuild[rData.get(i)-1][fData.get(i)-1];
			} else if(bData.get(i) == 4) {
				forBuild[rData.get(i)-1][fData.get(i)-1] = vData.get(i) + forBuild[rData.get(i)-1][fData.get(i)-1];
			}
		}
		
		//??????
		for(int k  = 0; k < 4; k++) {
			for(int j = 0; j < 3; j++) {
				for(int i = 0; i < 10; i++) {
					if(k == 0) {
						System.out.print(" " + firBuild[i][j]);
					} else if(k == 1) {
						System.out.print(" " + secoBuild[i][j]);
					} else if(k == 2) {
						System.out.print(" " + thiBuild[i][j]);
					} else if(k == 3) {
						System.out.print(" " + forBuild[i][j]);
					}
				}
				System.out.println();
			}
			if(k != 3) {
				System.out.println("####################");
			}
		}
	}
}