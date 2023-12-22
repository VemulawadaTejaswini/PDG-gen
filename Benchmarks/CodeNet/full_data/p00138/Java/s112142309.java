import java.util.Arrays;
import java.util.Scanner;

public class Main {
	Scanner sc = new Scanner(System.in);
	Person [][] personArray = new Person[3][8];
	Person [] nextwinner = new Person[18];
	int k = 0;
	public void doIt(){
		for(int i = 0; i < 3; i++){
			for(int j = 0; j < 8; j++){
				personArray[i][j] = new Person(sc.nextInt(),sc.next());
			}
		}
		for(int i = 0; i < 3; i++){
			Arrays.sort(personArray[i]);
		}
		for(int i = 0; i < 3; i++){
			for(int j = 2; j < 8; j++){
				nextwinner[k++] = new Person(personArray[i][j].number,personArray[i][j].time);
			}
		}
		Arrays.sort(nextwinner);
		for(int i = 0; i < 3; i++){
			for(int j = 0; j < 2; j++){
				System.out.println(personArray[i][j].number + " " + personArray[i][j].time);
			}
		}
		for(int i = 0; i < 2; i++){
			System.out.println(nextwinner[i].number + " " + nextwinner[i].time);
		}
	}
	public static void main(String[] args) {
		new Main().doIt();
	}
	class Person implements Comparable<Person> { 
		int number;
		String time;
		Person(int number, String time){
			this.number = number;
			this.time = time;
		}
		public String tostring(){
			return "[" + number + "," + time + "]";
		}
		public int compareTo(Person p){
			return time.compareTo(p.time);
		}
	}
}