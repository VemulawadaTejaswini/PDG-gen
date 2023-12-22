import java.util.*;

public class Main{
	public static void main(String[] args){
		int i;
		Scanner scan = new Scanner(System.in);

		while(scan.hasNextInt()){
			int n = scan.nextInt();
			int m = scan.nextInt();

			ArrayList<Integer> a = new ArrayList<Integer>();
			ArrayList<Integer> b = new ArrayList<Integer>();
			ArrayList<Integer> c = new ArrayList<Integer>();

			for(i=0;i<n;i++) c.add(i);

			while(m-- > 0){
				int r = scan.nextInt();

				for(i=0;i<n/2;i++) b.add(c.remove(0));
				for(;i<n;i++) a.add(c.remove(0));

				while(!a.isEmpty() || !b.isEmpty()){
					int sa = a.size();
					int sb = b.size();

					for(i=0;i<sa && i<r;i++) c.add(a.remove(0));
					for(i=0;i<sb && i<r;i++) c.add(b.remove(0));
				}
			}

			System.out.println(c.get(n-1));
		}
	}
}