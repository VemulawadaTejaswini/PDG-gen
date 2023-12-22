import java.util.Arrays;
import java.util.Comparator;
import java.util.Scanner;


public class Main {

	Scanner sc;
	final double EPS=1e-7;
	
	class Pair{
		public int first;
		public double second;
		public Pair(int a,double b){
			first=a;
			second=b;
		}
		public String toString(){
			return first+" "+second;
		}
	}
	
	class PairComparator implements Comparator<Pair>{

		//第一要素で比較する⇒true
		private boolean first;
		PairComparator(boolean first){
			this.first=first;
		}

		@Override
		public int compare(Pair o1, Pair o2) {
			// TODO Auto-generated method stub
			if(first){
				return o1.first-o2.first;
			}
			else{
				double d1=o1.second,d2=o2.second;
				if(Math.abs(d1-d2)<EPS) return 0;
				else if(d1<d2) return -1;
				else return 1;
			}
		}
	}
	
	int ni(){
		return sc.nextInt();
	}
	
	double BMI(int h,int w){
		return ((double)w)/h/h*10000;
	}
	
	void io(){
		sc=new Scanner(System.in);
		
		int n;
		while((n=ni())!=0){
			Pair[] person=new Pair[n];
			for(int i=0;i<n;++i){
				person[i]=new Pair(ni(),Math.abs(BMI(ni(),ni())-22.0));
			}
			Arrays.sort(person,new PairComparator(true));
			Arrays.sort(person,new PairComparator(false));
			System.out.println(person[0].first);
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		new Main().io();
	}

}