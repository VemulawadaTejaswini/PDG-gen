import java.util.PriorityQueue;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
	Main m = new Main();
	m.answer();
    }

    private Scanner scan = new Scanner(System.in);
    private int N;
    private int H;
    private PriorityQueue<Sword> swordList;

    public Main() {
	N = Integer.parseInt(scan.next());
	H = Integer.parseInt(scan.next());
	swordList = new PriorityQueue<Sword>(N*2);
	for (int i = 0; i < N; i++) {
	    int a = Integer.parseInt(scan.next());
	    int b = Integer.parseInt(scan.next());

	    swordList.add(new Sword(a, 0));
	    swordList.add(new Sword(b, 1));
	}

	scan.close();
    }

    public final void answer() {

	int count = 0;
	
	while(H > 0) {
	    Sword s = swordList.peek();
	    if(s.type == 0) {
		int c = H / s.damage;
		if(H % s.damage > 0) c++;
		H = H - s.damage * c;
		count += c;
	    } else if(s.type == 1) {
		swordList.poll();
		H = H - s.damage;
		count++;
	    }
	}

	System.out.println(count);
	
    }

    private class Sword implements Comparable<Sword> {

	int damage;
	int type;

	Sword(int damage, int type) {
	    this.damage = damage;
	    this.type = type;
	}

	@Override
	public int compareTo(Sword s) {
	    return s.damage - this.damage;
	}
    }
}
