import java.util.ArrayList;
import java.util.Scanner;
public class Main {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		int N = sc.nextInt();

		ArrayList<Integer> array = new ArrayList<>();

		for(int i=0;i<N;i++) {

			int b = sc.nextInt();

			array.add(b);

		}

		if(array.get(0) != 1) System.out.println(-1);

		else {

			int count = 0;

			ArrayList<Integer> ans = new ArrayList<>();

			while(count<N) {

				if(array.size()>1) {

					if(array.get(1) == 1) {

						ans.add(1);

						array.remove(1);

						continue;
					}
				}
				for(int i=array.size()-1;i>=0;i--) {

					if(array.get(i) == i+1) {

						ans.add(i+1);

						array.remove(i);

						break;
					}
				}
				count++;
			}

			if(ans.size()!=N) {

				System.out.println(-1);

			}else {

				for(int i=ans.size()-1;i>=0;i--) {

					System.out.println(ans.get(i));
				}
			}
		}
	}

}
