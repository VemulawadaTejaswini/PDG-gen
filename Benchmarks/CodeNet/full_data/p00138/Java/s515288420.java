import java.util.Arrays;
import java.util.Scanner;

public class main {
	public void doIt(){
		Scanner sc = new Scanner(System.in);
		Person [][] personArray = new Person[3][8];
		for(int i = 0; i < 3; i++){
			for(int j = 0; j < 8; j++){
				int number = sc.nextInt();
				String time = sc.next();
				personArray[i][j] = new Person(number,time);
			}
			Arrays.sort(personArray[0]);
			Arrays.sort(personArray[1]);
			Arrays.sort(personArray[2]);
			for(int j = 0; j < 2; j++){
				System.out.println(personArray[i][j].number + " " + personArray[i][j].time);
			}
		}
		Person [] nextwinner = new Person[18];
		for(int i = 0; i < 3; i++){
			for(int j = 2; j < 8; j++){
				for(int k = 0; k < 18;k++){
					nextwinner[k] = new Person(personArray[i][j].number,personArray[i][j].time);
				}
			}
		}
		Arrays.sort(nextwinner);
		for(int i = 0; i < 2; i++){
			System.out.println(nextwinner[i].number + " " + nextwinner[i].time);
		}
	}
	public static void main(String[] args) {
		new main().doIt();
	}
	class Person implements Comparable<Person> { 
		int number;
		String time;
		Person(int number, String time){
			this.number = number;
			this.time = time;
		}
		/*public String tostring(){
			return "[" + number + "," + time + "]";
		}*/
		public int compareTo(Person p){
			return time.compareTo(p.time);
		}
	}
}