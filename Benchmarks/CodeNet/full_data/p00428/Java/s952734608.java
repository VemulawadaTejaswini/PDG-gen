import java.util.*;

public class Main {
	static Scanner sc = new Scanner(System.in);

	//0505
	static class Questionnaire {
		void placeRank() {
			for(;;) {
				int n = Integer.parseInt(sc.next());
				int m = Integer.parseInt(sc.next());
				if(n==0 && m==0) break;

				HashMap<Integer, Integer> places = new HashMap<Integer, Integer>();
				for(int i=1; i<m+1; i++) {
					places.put(i, 0);
				}
				for(int i=0; i<n; i++) {
					for(int j=1; j<m+1; j++) {
						int check = Integer.parseInt(sc.next());
						places.put(j, places.get(j)+check);
					}
				}

				for(int i=0; i<m; i++) {
					int max=1;
					for(int j=2; j<m+1; j++) {
						if(places.get(max) < places.get(j)) max = j;
					}
					if(i != m-1)
						System.out.print(max + " ");
					else
						System.out.println(max);
					places.put(max, -1);
				}
			}
		}
	}

	public static void main(String[] args) {
		Questionnaire q = new Questionnaire();
		q.placeRank();
	}
}