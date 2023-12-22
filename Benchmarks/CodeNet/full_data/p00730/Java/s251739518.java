import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Scanner;

public class Main{
	public static void main(String[] args){
		Scanner in = new Scanner(System.in);
		while(true){
			int n = in.nextInt();
			int w = in.nextInt();
			int h = in.nextInt();
			if(w == 0) break;
			clock = 0;
			Comparator<Cake> cmp = new Comp1();
			ArrayList<Cake> cakes = new ArrayList<Cake>();
			cakes.add(new Cake(w, h, 0));
			for(int i=0; i<n; i++){
				clock++;
				int p = in.nextInt();
				int s = in.nextInt();
				cakes.addAll(cut(cakes.remove(p-1), s));
				Collections.sort(cakes, cmp);
			}
			Collections.sort(cakes, new Comp2());
			out(cakes);
		}
	}
	
	public static int clock;
	public static void out(ArrayList<Cake> cakes){
		StringBuilder sb = new StringBuilder();
		for(Cake c: cakes){
			sb.append(c.size+" ");
		}
		System.out.println(sb.toString().trim());
	}
	
	public static ArrayList<Cake> cut(Cake cake, int s){
		int w = cake.w;
		int h = cake.h;
		s %= w + h;
		ArrayList<Cake> res = new ArrayList<Cake>();
		if(s<w){
			res.add(new Cake(s, h, clock));
			res.add(new Cake(w-s, h, clock));
		}else{
			s -= w;
			res.add(new Cake(w, s, clock));
			res.add(new Cake(w, h-s, clock));
		}
		return res;
	}
}

class Cake{
	int w, h;
	int size;
	int time;
	public Cake(int w, int h, int time){
		this.w = w;
		this.h = h;
		this.time = time;
		size = w*h;
		if(size == 0){
			System.err.println("!error size!");
		}
	}
	
	public String toString(){
		return size+"";
	}
}

class Comp1 implements Comparator<Cake>{
	@Override
	public int compare(Cake o1, Cake o2) {
		if(o1.time != o2.time) return o1.time-o2.time;
		return o1.size - o2.size;
	}
}

class Comp2 implements Comparator<Cake>{
	@Override
	public int compare(Cake o1, Cake o2) {
		return o1.size-o2.size;
	}
}