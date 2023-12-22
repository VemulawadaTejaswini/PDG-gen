import java.util.*;

public class Main {
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		person p[] = new person[24];
		for(int i=0; i<24; i++){
			p[i] = new person(s.nextInt() , s.nextDouble());
		}
		Arrays.sort(p,0,7);
		System.out.println(p[0] + "\n" + p[1]);
		p[0].time = 100;
		p[1].time = 100;
		
		Arrays.sort(p,8,15);
		System.out.println(p[8] + "\n" + p[9]);
		p[8].time = 100;
		p[9].time = 100;
		
		Arrays.sort(p,16,23);
		System.out.println(p[16] + "\n" + p[17]);
		p[16].time = 100;
		p[17].time = 100;
		
		Arrays.sort(p);
		System.out.println(p[0] + "\n" + p[1]);

	}

}
class person implements Comparable<person>{
	int num;
	double time;
	person(int num, double time){
		this.num = num;
		this.time = time;

	}
	@Override
	public String toString(){
		return  num + " " + time ;

	}
	@Override
	public int compareTo(person o) {
	return new Double(time).compareTo(o.time);
	}
}