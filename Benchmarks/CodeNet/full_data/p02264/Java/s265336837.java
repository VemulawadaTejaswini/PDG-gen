import java.util.ArrayList;
import java.util.Scanner;

class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int q = sc.nextInt();
		Orique oq = new Orique();
		for (int i = 0; i < n; i++) {
			oq.inque(sc.next(), sc.nextInt());
		}
		oq.RoundRobinScheduling(q);
	}
}

class Orique {
	private class kakunou {
		String kstr;
		int kint;
		int kprenum;

		void setkakunou(String s, int i, int pre) {
			kstr = s;
			kint = i;
			kprenum = pre;
		}
	}

	private int length = 0;
	ArrayList<String> str = new ArrayList<String>();
	ArrayList<Integer> in = new ArrayList<Integer>();
	kakunou k;
	private ArrayList<Integer> prenumber = new ArrayList<Integer>();

	Orique() {
		k = new kakunou();
	}

	public void inque(String t, int i) {
		str.add(t);
		in.add(i);
		prenumber.add(i);
		length++;
	}

	private void inque(kakunou k) {
		str.add(k.kstr);
		in.add(k.kint);
		prenumber.add(k.kprenum);
		length++;
	}

	private void deque() {
		k.setkakunou(str.get(0), in.get(0), prenumber.get(0));
		str.remove(0);
		in.remove(0);
		prenumber.remove(0);
		length--;

	}
    public void RoundRobinScheduling(int q) {
		
		int total=0;
		deque();
		while(true){
			int t1=k.kint-q;
			if(t1>0){
				total=total+q;
				k.kint=t1;
				inque(k);
				
			}else{
				total=total+k.kint;
				System.out.println(k.kstr+" "+total);
				}
			if(length>0)deque();
			else break;
		}
		}
}