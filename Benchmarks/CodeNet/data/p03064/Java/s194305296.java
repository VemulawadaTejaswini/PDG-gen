import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.Scanner;

public class Main  implements Runnable { //Runnableを実装する

    public static void main(String[] args) {

        new Thread(null, new Main(), "", 16 * 1024 * 1024).start(); //16MBスタックを確保して実行

    }

    public void run() {
		Scanner sc = new Scanner(System.in);
		//Scanner sc = new Scanner("4 1 1 1 2");
		int n = Integer.parseInt(sc.next());
		//int k = 0;
		//int k = Integer.parseInt(sc.next());
		//String str = sc.next();
		//char c[] = str.toCharArray();
		int ar[]= new int[n];
		PrintWriter out = new PrintWriter(System.out);
		int numofb = 0;
		ArrayList<Integer> arl = new ArrayList<Integer>();
		for (int i = 0; i < n; i++)
		{
			arl.add(Integer.parseInt(sc.next()));
		}
		int ans = 0;

		Nar n1 = new Nar(n, 1, arl.get(0), 0, 0, 0, arl);
		ans = n1.cac();
		out.println(ans*3);
		//out.println(ans);
		out.flush();
	}
}
class Nar {
	int n;
	int cn;
	int r;
	int g;
	int b;
	int state;
	ArrayList<Integer> arr;
	Nar(int nt, int cnt, int rt, int gt, int bt, int statet, ArrayList<Integer> arrt){
		n = nt;
		cn = cnt;
		r = rt;
		g = gt;
		b = bt;
		state = statet;
		arr = arrt;
	}
	public int cac(){
		if(n > cn)
		{
			int cv = arr.get(cn);
			Nar n1 = new Nar(n, cn+1, r+cv, g, b, state, arr);
			int ans = n1.cac();
			n1 = new Nar(n, cn+1, r, g+cv, b, state, arr);
			ans += n1.cac();
			n1 = new Nar(n, cn+1, r, g, b+cv, state, arr);
			ans += n1.cac();
			return ans;
		}
		else
		{
			if(r>b && r>g)
			{
				if(r <g+b)
				{
					return 1;
				}
				else
				{
					return 0;
				}
			}
			else if(b>g)
			{
				if(b <r+g)
				{
					return 1;
				}
				else
				{
					return 0;
				}
			}
			else
			{
				if(g <r+b)
				{
					return 1;
				}
				else
				{
					return 0;
				}
			}
		}
	}
}