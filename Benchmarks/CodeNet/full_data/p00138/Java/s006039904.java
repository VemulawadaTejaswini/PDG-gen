import java.util.*;
public class Main {
	void doIt(){
		Scanner sc = new Scanner(System.in);
		Person pa[] = new Person[24];
		int cnt = 0;
		for(int i = 0;i < 3;i++){
			for(int k = 0;k < 8;k++){
				pa[i][k] = new Person(sc.nextInt(), sc.nextDouble(), true);
			}
			Arrays.sort(pa, i * 8, i * 8 + 7);
			for(int k = 0;k < 2;k++){
				System.out.println(pa[i * 8 + k].number + " " + pa[i * 8 + k].time);
				pa[i * 8 + k].flag = false;
			}
		}
		Arrays.sort(pa);
		for(int i = 0;i < 24;i++){
			if(pa1[i].flag == true){
				System.out.println(pa[i].number + " " + pa[i].time);
				cnt++;		
			}
			if(cnt == 2) break;
		}
	}
	public static void main(String args[]){
		new Main().doIt();
	}
	class Person implements Comparable<Person>{ 
		int number;
		Double time;
		boolean flag;
		Person(int number, double time, boolean flag){
			this.number = number;
			this.time = time;
			this.flag = flag;
		}
		@Override
		public int compareTo(Person p){
			return time.compareTo(p.time);
		}
	}
}