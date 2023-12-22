import java.util.Arrays;
import java.util.*;
public class Main {
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		int[] Upper = new int[3];
		int[][] t= new int[3][8];
		Person[] person = new Person[24];
		
		for(int i=0;i<3;i++){
			for(int k=0;k<8;k++){
				person[i*8+k] = new person(i,sc.nextInt(),sc.next());
				t[i][k] = person[i*8+k];
			}
		}	
        Arrays.sort(person);
        for(int i = 0;i < 24;i++){
            t[person[i].team][Upper[person[i].team]] = i;
            Upper[person[i].team]++;
        }
        for(int i = 0;i < 3;i++){
            for(int j = 0;j < 2;j++){
                System.out.println(person[t[i][j]].name+" "+person[t[i][j]].time);
                person[t[i][j]].time = "1000000";
            }
        }
        Arrays.sort(person);
        for(int j = 0;j < 2;j++){
            System.out.println(person[j].name+" "+person[j].time);
        }
         
    }
}

	
	
	
	class Person implements Comparable<Person>{
		int team;
		int name;
		String time;
		Person(int team,int name, String time) {
		this.team = team;
		this.name = name;
		this.time = time;
		}
		@Override
		public String toString() {
		return "[" + name + "," + time + "]";
		}
		@Override
		public int compareTo(Person p) {
		return time.compareTo(p.time);
		}
		}