import java.util.Hashtable;
import java.util.Scanner;

class Main {
	public static void main(String args[]){
		Scanner scan = new Scanner(System.in);
		Hashtable<Integer,String> day = new Hashtable<Integer,String>();
		day.put(1,"Thursday");
		day.put(2,"Friday");
		day.put(3,"Saturday");
		day.put(4,"Sunday");
		day.put(5,"Monday");
		day.put(6,"Tuesday");
		day.put(0,"Wednesday");
		Hashtable<Integer,Integer> month = new Hashtable<Integer,Integer>();
		month.put(1,0);
		month.put(2,31);
		month.put(3,60);
		month.put(4,91);
		month.put(5,121);
		month.put(6,152);
		month.put(7,182);
		month.put(8,213);
		month.put(9,244);
		month.put(10,274);
		month.put(11,305);
		month.put(12,335);
		
		while(true){
			int m = scan.nextInt();
			int d = scan.nextInt();
			if(m==0 &&  d==0){
				break;
			}
			int n = month.get(m) + d;
			String today = day.get(n%7);
			System.out.println(today);
		}
	}
}