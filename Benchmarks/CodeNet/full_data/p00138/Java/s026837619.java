import java.util.*;

public class Main {
	void doIt() {
		Scanner sc = new Scanner(System.in);
		int i, k, under;
		Person[][] PersonArray = new Person[3][8];
		Person[] chance = new Person[6];	
		for(i = 0; i < 3; i++){
			for(k = 0; k < 8; k++){
				PersonArray[i][k] = new Person(sc.nextInt(), sc.next());	
			}
			Arrays.sort(PersonArray[i]);
			for(k = i*2, under = 2; k < 2*(i+1); k++, under++){
				chance[k] = PersonArray[i][under];
			}
		}
		Arrays.sort(chance);
		for(i = 0; i < 3; i++){
			for(k = 0; k < 2; k++){
				System.out.println (PersonArray[i][k]);
			}
		}
		for(i = 0; i < 2; i++){
			System.out.println (chance[i]);
		}
	}
	
	public static void main(String[] args){
		new Main().doIt();
	}
	
	class Person implements Comparable<Person>{
		int num;
		String time;
		Person(int num, String time){
			this.num = num;
			this.time = time;
		}
		public String toString(){
			return num +" "+ time;
		}
		@Override
		public int compareTo(Person o) {
			return time.compareTo(o.time);
		}
	}	
}