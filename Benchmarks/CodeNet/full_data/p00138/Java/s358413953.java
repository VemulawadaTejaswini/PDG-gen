
import java.util.*;
public class Main {
	Scanner s = new Scanner(System.in);
		void doIt(){
			// 自作クラス(Person)オブジェクトの並べ替え
			Person []personone = new Person[8];
			Person []result = new Person[8];
			Person []three = new Person[6];
			for(int i=0; i<8; i++){
				personone[i] = new Person(s.nextInt(), s.nextDouble());
			}
			Arrays.sort(personone);
			result[0] = personone[0];
			result[1] = personone[1];
			three[0] = personone[2];
			three[1] = personone[3];
			for(int i=0; i<8; i++){
				personone[i] = new Person(s.nextInt(), s.nextDouble());
			}
			Arrays.sort(personone);
			result[2] = personone[0];
			result[3] = personone[1];
			three[2] = personone[2];
			three[3] = personone[3];
			for(int i=0; i<8; i++){
				personone[i] = new Person(s.nextInt(), s.nextDouble());
			}
			Arrays.sort(personone);
			result[4] = personone[0];
			result[5] = personone[1];
			three[4] = personone[2];
			three[5] = personone[3];
			Arrays.sort(three);
			result[6] = three[0];
			result[7] = three[1];
			for(int i=0; i<8; i++){
				System.out.println(result[i].name+" "+result[i].age);
			}
		}
		public static void main(String[] args) {
			new Main().doIt();
		}
		class Person implements Comparable<Person>{ 
			int name;
			Double age;
			Person(int name, double age) {
				this.name = name;
				this.age = age;
				}
			@Override
			public int compareTo(Person o){
				return age.compareTo(o.age);
			}
		}
}