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

	public static void main(String[] args) {
		ArrayList<Score> s = new ArrayList<Score>();
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();

			for (int i = 0; i < n; i++) {
				s.add( new Score(sc.nextInt(), sc.nextInt()) );
			}

		s.sort((a,b)-> a.getId() - b.getId() );
		s.sort((a,b)-> b.getPt() - a.getPt() );
		System.out.printf("%d %d\n", s.get(0).getId(), s.get(0).getPt());


		sc.close();

	}

}

