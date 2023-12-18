import java.util.*;

class Main{
	
	public static void main(String args[]){

		Scanner sc = new Scanner(System.in);

		int N = sc.nextInt();

		int moti[] = new int[N];

		boolean insFlg = false;

		ArrayList<Integer> ansList = new ArrayList<Integer>();

		for (int i=0; i<N; i++) {
			moti[i] = sc.nextInt();
		}


		for (int i=0; i<N; i++) {
			insFlg = true;
			for (int k : ansList) {
				if (moti[i] == k) {
					insFlg = false;
				}
			}
			if (insFlg) {
				ansList.add(moti[i]);
			}
		}

		System.out.println(ansList.size());
	}
}