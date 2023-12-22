import java.util.ArrayList;
import java.util.Scanner;

class Score {
	private int id;
	private int pt;

	Score(int id, int pt){
		this.id = id;
		this.pt = pt;
	}

	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public int getPt() {
		return pt;
	}
	public void setPt(int pt) {
		this.pt = pt;
	}
}

public class Main {

	@SuppressWarnings("unused")
	public static void main(String[] args) {
		ArrayList<Score> s = new ArrayList<Score>();
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int q = sc.nextInt();
		boolean isDup = false;

			for (int i = 0; i < q; i++) {
				int input_id = sc.nextInt();
				int input_pt = sc.nextInt();


					for(int j = 0; j < s.size(); j++) {
						isDup = false;

						if (s.get(j).getId() == input_id) {
							s.set(j, new Score(input_id, s.get(j).getPt() + input_pt) );
							isDup = true;
							break;
						}
					}

					if (isDup == false) {
						s.add(new Score(input_id, input_pt));
					}

				s.sort((a,b)-> a.getId() - b.getId() );
				s.sort((a,b)-> b.getPt() - a.getPt() );
				System.out.printf("%d %d\n", s.get(0).getId(), s.get(0).getPt());
			}
		sc.close();
	}
}
