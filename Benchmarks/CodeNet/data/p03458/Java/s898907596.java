import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		int MAX_SIZE = 1000000000;
		
		Scanner scanner = new Scanner(System.in);
		int n = scanner.nextInt();
		int k = scanner.nextInt();
		int[] xs = new int[n];
		int[] ys = new int[n];
		boolean[] isBs  = new boolean[n];
		for (int i = 0; i < n; i++) {
			xs[i] = scanner.nextInt();
			ys[i] = scanner.nextInt();
			if(scanner.next().equals("B")) isBs[i] = true;
			else isBs[i] = false;
		}
		
		List<boolean[][]> seets = new ArrayList<boolean[][]>();
		for(int a=0; a<2; a++) {
			boolean point00isB = true;
			if(a==1) point00isB = false;
			// b=y補正
			for(int b=0; b<k; b++) {
				// c=x補正
				for(int c=0; c<k; c++) {
					boolean[][] seet = new boolean[MAX_SIZE][MAX_SIZE];
					boolean point0yisB = point00isB;
					for(int y=0; y<MAX_SIZE; y++) {
						boolean isB = point0yisB;
						for(int x=0; x<MAX_SIZE; x++) {
							seet[x][y] = isB;
							// true,false逆転
							if(((x+1+c)%k) == 0) {
								if(isB) isB= false;
								else isB= true;
							}
						}
						if(((y+1+b)%k) == 0) {
							if(point0yisB) point0yisB= false;
							else point0yisB= true;
						}
					}
					seets.add(seet);
				}
			}
		}
		int maxMatchCount= 0;
		for(boolean[][] seet : seets) {
			int matchCount =0;
			for(int i=0; i<n; i++) {
				if(seet[xs[i]][ys[i]] == isBs[i]) matchCount++; 
			}
			if(maxMatchCount < matchCount) {
				maxMatchCount = matchCount;
			}
		}
		System.out.println(maxMatchCount);
	}
}
