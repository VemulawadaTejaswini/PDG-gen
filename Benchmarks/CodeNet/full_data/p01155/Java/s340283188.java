import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

//Ruins
public class Main{

	class R{
		int a, b;
		public R(int a, int b) {
			this.a = a; this.b = b;
		}
	}

	@SuppressWarnings("unchecked")
	void run(){
		Scanner sc = new Scanner(System.in);
		List<R>[] l = new List[10001];
		for(int i=1;i<=10000;i++)l[i] = new ArrayList<R>();
		for(int i=1;i<=10000;i++)for(int j=1;j*j<=i;j++){
			if(i%j==0)l[i].add(new R(j, i/j));
		}
		for(;;){
			int a = sc.nextInt(), b = sc.nextInt();
			if((a|b)==0)break;
			int min = 1<<29;
			int[] t = new int[4];
			for(R p:l[a])for(R q:l[b]){
				t[0]=p.a; t[1]=p.b; t[2]=q.a; t[3]=q.b;
				Arrays.sort(t);
				min = Math.min(min, (t[1]-t[0])*(t[1]-t[0])+(t[2]-t[1])*(t[2]-t[1])+(t[3]-t[2])*(t[3]-t[2]));
			}
			System.out.println(min);
		}
	}

	public static void main(String[] args) {
		new Main().run();
	}
}