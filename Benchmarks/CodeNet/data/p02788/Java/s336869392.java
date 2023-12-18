import java.util.*;
public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
 
		int n = sc.nextInt();
		int d = sc.nextInt();
		int a = sc.nextInt();
		
		Monster[] m = new Monster[n];
		for(int i=0;i<n;i++) {
			int x = sc.nextInt();
			int h = sc.nextInt();
			int t = (int)Math.ceil((double)h/a);
			m[i] = new Monster(x, h, t);
		}
		
		Arrays.sort(m, new Comparator<Monster>() {

			@Override
			public int compare(Monster o1, Monster o2) {
				if(o1.x>o2.x)
					return 1;
				else if(o1.x==o2.x)
					return 0;
				else
					return -1;
			}
			
		});
		
		int[] k = new int[n];
		int l = 0, r = 1;
		while(l<n && r<n) {
			if(m[r].x-m[l].x<=2*d) {
				r++;
			}
			else {
				k[l] = r-1;
				l++;
			}
		}
		for(int i=l;i<n;i++) {
			k[i] = r-1;
		}
		
		int s = 0;
		long time = 0;
		while(s<n) {
			time += m[s].t;
			s = k[s]+1;
		}
		
		System.out.println(time);
	}
}
class Monster{
	int x, h, t;
	Monster(int x, int h, int t){
		this.x = x;
		this.h = h;
		this.t = t;
	}
}