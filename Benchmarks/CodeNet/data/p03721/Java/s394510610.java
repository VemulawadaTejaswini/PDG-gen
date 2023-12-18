import java.util.ArrayList;
import java.util.List;
import java.util.Optional;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
		Scanner scan = new Scanner(System.in);
		int N=scan.nextInt();
		long K=scan.nextInt();

		/*int[][] ab = new int[N][2];*/
		List<Integer> a = new ArrayList<Integer>();
		List<Integer> b = new ArrayList<Integer>();
		for(int i=0;i<N;i++){
			a.add(scan.nextInt());
			b.add(scan.nextInt());
		}


	/*	Arrays.sort(ab,new Comparator<int[]>(){
			@Override
			public int compare(int[] o1,int[] o2){
				return o1[0] -o2[0];
			}
		});*/

		long ans=0;
		int index;
		while(true){
			Optional<Integer> min =a.stream().min((x,y) -> x.compareTo(y));
			index =a.indexOf(min.get());
			int s=b.get(index);
			K-=s;
			if(K<=0){
				ans = min.get();
				break;
			}
			a.remove(index);
			b.remove(index);
		}
		System.out.println(ans);
	}

}
