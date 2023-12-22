
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;


public class Main {
	
	public static class Cake implements Comparable<Cake>{
		int w, d;

		public Cake(int w, int d) {
			super();
			this.w = w;
			this.d = d;
		}

		@Override
		public int compareTo(Cake arg0) {
			return this.w * this.d - arg0.w * arg0.d;
		}
		
		@Override
		public String toString(){
			return this.w + " " + this.d;
		}
	}
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		while(true){
			final int n = sc.nextInt();
			final int w = sc.nextInt();
			final int d = sc.nextInt();
			
			if(n == 0 && w == 0 && d == 0){
				break;
			}
			
			ArrayList<Cake> list = new ArrayList<Cake>();
			list.add(new Cake(w,d));
			
			for(int i = 0; i < n; i++){
				//System.out.println(list);
				final int p = sc.nextInt() - 1;
				final Cake cut = list.remove(p);
				//System.out.println(cut.w + " " + cut.d);
				final int s = sc.nextInt() % (2 * cut.w + 2 * cut.d);

				//System.out.println(s);
				
				Cake one,two;
				
				int rest = s;
				if (rest < cut.w) {
					one = new Cake(cut.w - rest, cut.d);
					two = new Cake(rest, cut.d);
				} else {
					rest -= cut.w;

					if (rest < cut.d) {
						one = new Cake(cut.w, cut.d - rest);
						two = new Cake(cut.w, rest);
					} else {
						rest -= cut.d;

						if (rest < cut.w) {
							one = new Cake(cut.w - rest, cut.d);
							two = new Cake(rest, cut.d);
						} else {
							rest -= cut.w;
							one = new Cake(cut.w, cut.d - rest);
							two = new Cake(cut.w, rest);
						}

					}
				}
				/*
				System.out.print(one.w + " " + one.d);
				System.out.print(", " + two.w + " " + two.d);
				System.out.println();
				*/
				if(one.compareTo(two) > 0){
					list.add(two);
					list.add(one);
				}else{
					list.add(p, one);
					list.add(p+1, two);
				}
				
			}
			
			Collections.sort(list);
			boolean first = true;
			for(Cake c : list){
				if(first){
					first = false;
					System.out.print(c.w * c.d);
				}else{
					System.out.print(" " + (c.w * c.d));
				}
			}
			System.out.println();
		}
		
		
	}

}