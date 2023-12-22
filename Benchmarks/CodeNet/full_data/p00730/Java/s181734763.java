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
			Comparator<Cake> cmp = new Comp1();
			ArrayList<Cake> cakes = new ArrayList<Cake>();
			cakes.add(new Cake(w, h, 0));
			for(int i=0; i<n; i++){
				int p = in.nextInt();
				int s = in.nextInt();
				cakes.addAll(cut(cakes.remove(p-1), s));
				Collections.sort(cakes, cmp);
			}
			Collections.sort(cakes, new Comp2());
			out(cakes);
		}
	}
	
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
		boolean tate = false;
		while(s > 0){
			tate = !tate;
			s -= tate?w:h;
		}
		ArrayList<Cake> res = new ArrayList<Cake>();
		if(tate){
			s += w;
			res.add(new Cake(s, h, cake.time+1));
			res.add(new Cake(w-s, h, cake.time+1));
		}else{
			s += h;
			res.add(new Cake(w, s, cake.time+1));
			res.add(new Cake(w, h-s, cake.time+1));
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