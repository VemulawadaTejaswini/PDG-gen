import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class Main {
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		double tmp = 0;
		int i, j;
		long meu, rinrin;
		ArrayList<Long> array = new ArrayList<Long>();
		ArrayList<Long> fuga = new ArrayList<Long>();
		for(i = 0;i < n;++i){
			array.add((long) sc.nextInt());
		}
		for(i = 0;i < n;++i){
			meu = array.get(i);
			for(j = 0;j < n;++j){
				if(j != i){
					rinrin = array.get(j);
					fuga.clear();
					for(long marika:array){
						fuga.add(marika);
					}
					fuga.remove(i);
					fuga.remove((j < i) ? j : j - 1);
					Collections.sort(fuga);
					Collections.reverse(fuga);
					tmp = Math.max(tmp, (double) (fuga.get(0) + fuga.get(1)) / Math.abs(meu - rinrin));
				}
			}
		}
		
		System.out.println(tmp);
	}
}