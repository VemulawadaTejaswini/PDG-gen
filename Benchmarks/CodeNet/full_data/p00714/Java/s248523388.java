import java.util.Scanner;
import java.util.*;
public class Main{
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		Box box;
		Plate plate;
		Water water;
		int d = sc.nextInt();
		int n, m, l;
		int p, t;
		for(int i = 0; i < d; i++){
			n = sc.nextInt();
			box = new Box();
			plate = new Plate();
			plate.x.add(0);
			plate.h.add(50);
			plate.flag.add(0);
			for(int j = 0; j < n; j++){
				plate.x.add(sc.nextInt());
				plate.h.add(sc.nextInt());
				plate.flag.add(0);
			}
			plate.x.add(100);
			plate.h.add(50);
			plate.flag.add(0);
			for(int j = 0; j < n+1; j++)
				box.v.add(0);
			m = sc.nextInt();
			water = new Water();
			for(int j = 0; j < m; j++){
				water.x.add(sc.nextInt());
				water.v.add(sc.nextInt());
			}
			waterIn(box, plate, water);
			l = sc.nextInt();
			for(int j = 0; j < l; j++){
				p = sc.nextInt();
				t = sc.nextInt();
				setHeight(box, plate, t);
				overFlow(box, plate);
				level(box, plate);
				System.out.println(search(box, plate, p));
			}
		}
	}
	static void waterIn(Box box, Plate plate, Water water){
		for(int i = 0; i < box.v.size(); i++){
			for(int j = 0; j < water.x.size(); j++){
				if(water.x.get(j) > plate.x.get(i) && water.x.get(j) < plate.x.get(i+1)){
					box.v.set(i, box.v.get(i)+water.v.get(j));
				}
			}
		}	
	}
	static void setHeight(Box box, Plate plate, int t){
		for(int i = 0; i < box.v.size(); i++)
			box.h.add(box.v.get(i) * t / (plate.x.get(i+1)-plate.x.get(i)) / 30.0);
	}
	static void overFlow(Box box, Plate plate){
		for(int i = 0; i < box.h.size(); i++){
			if(box.h.get(i) > plate.h.get(i) || box.h.get(i) > plate.h.get(i+1)){
				if(plate.h.get(i) < plate.h.get(i+1)){
					box.h.set(i-1, box.h.get(i-1)+((box.h.get(i) - plate.h.get(i)) * (plate.x.get(i+1) - plate.x.get(i)) / (plate.x.get(i) - plate.x.get(i-1))));
					box.h.set(i, (double)plate.h.get(i));
				}else if(plate.h.get(i) > plate.h.get(i+1)){
					box.h.set(i+1, box.h.get(i+1)+((box.h.get(i) - plate.h.get(i+1)) * (plate.x.get(i+1) - plate.x.get(i)) / (plate.x.get(i+2) - plate.x.get(i+1))));
					box.h.set(i, (double)plate.h.get(i+1));
				}else{
					box.h.set(i-1, box.h.get(i-1)+((box.h.get(i) - plate.h.get(i)) * (plate.x.get(i+1) - plate.x.get(i)) / (plate.x.get(i) - plate.x.get(i-1)) / 2));
					box.h.set(i+1, box.h.get(i+1)+((box.h.get(i) - plate.h.get(i)) * (plate.x.get(i+1) - plate.x.get(i)) / (plate.x.get(i+2) - plate.x.get(i+1)) / 2));
					box.h.set(i, (double)plate.h.get(i));
				}
			}
		}
	}
	static void level(Box box, Plate plate){
		while(true){
			int count = 0;
			for(int i = 1; i < plate.x.size()-1; i++){
				if(box.h.get(i-1) >= plate.h.get(i) && box.h.get(i) >= plate.h.get(i)){
					plate.flag.set(i, 1);
					count++;
				}
			}
			if(count == 0)
				break;
			int k = 0;
			double sum = 0;
			for(int i = 1; i < plate.x.size()-1; i++){
				if(plate.flag.get(i) == 1){
					if(k == 0)
						k = i;
					sum += (plate.x.get(i) - plate.x.get(i-1)) * box.h.get(i-1);
					if(i != plate.x.size()-2)
						continue;
				}
				if(k == 0)
					continue;
				if(i == plate.x.size()-2)
					sum += (plate.x.get(i+1) - plate.x.get(i)) * box.h.get(i);
				else
					sum += (plate.x.get(i) - plate.x.get(i-1)) * box.h.get(i-1);
				box.h.set(k-1, sum / (plate.x.get(i) - plate.x.get(k-1)));
				for(int j = k; j < i; j++){
					plate.x.remove(j);
					plate.h.remove(j);
					box.h.remove(j);
				}
				i = k;
				k = 0;
				sum = 0;
			}
		}
	}
	static double search(Box box, Plate plate, int x){
		double height = 0.0;
		for(int i = 0; i < plate.x.size()-1; i++){
			if(x > plate.x.get(i) && x < plate.x.get(i+1)){
				height = box.h.get(i);
				break;
			}
		}
		return (height <= 50 ? height : 50);
	}
}
class Box{
	ArrayList<Double> h;
	ArrayList<Integer> v;
	Box(){
		h = new ArrayList<Double>();
		v = new ArrayList<Integer>();
	}
}
class Plate{
	ArrayList<Integer> x;
	ArrayList<Integer> h;
	ArrayList<Integer> flag;
	Plate(){
		x = new ArrayList<Integer>();
		h = new ArrayList<Integer>();
		flag = new ArrayList<Integer>();
	}
}
class Water{
	ArrayList<Integer> x;
	ArrayList<Integer> v;
	Water(){
		x = new ArrayList<Integer>();
		v = new ArrayList<Integer>();
	}
}