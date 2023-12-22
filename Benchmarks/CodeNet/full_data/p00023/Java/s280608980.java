
import java.util.*;
import java.lang.*;
import java.math.*;

public class Main {
	Scanner sc = new Scanner(System.in);
	class Cir{
		Double x;
		Double y;
		Double r;
		Cir(Double x, Double y , Double r){
			this.x = x;
			this.y = y;
			this.r = r;
		}
		Cir(){}
		Double dist2(Cir c){
			Double ret = (this.x -c.x)* (this.x -c.x) + (this.y -c.y) * (this.y -c.y);
			return ret;
		}
		
	}
	void run(){
		int n = sc.nextInt();
		for(int i = 0; i < n ; i ++){
			Cir a = new Cir(sc.nextDouble(),sc.nextDouble(),sc.nextDouble());
			Cir b = new Cir(sc.nextDouble(),sc.nextDouble(),sc.nextDouble());
			Double dist  = a.dist2(b);
			if(dist+b.r < a.r ){
				System.out.println(2);
				continue;
			}
			if(dist+a.r < b.r ){
				System.out.println(-2);
				continue;
			}
			if(dist > b.r + a.r ){
				System.out.println(0);
				continue;
			}
			System.out.println(1);			
		}
	}
	public static void main(String[] args){
		Main m = new Main();
		m.run();
		
	}
}