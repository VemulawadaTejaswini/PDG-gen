import java.util.*;

class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		List<Integer> al = new ArrayList<>();
		
		double tmp;
		while(sc.hasNext()) {
			tmp = sc.nextDouble();
			
			if(tmp <= 48)		al.add(1);
			else if(tmp <= 51)	al.add(2);
			else if(tmp <= 54)	al.add(3);
			else if(tmp <= 57)	al.add(4);
			else if(tmp <= 60)	al.add(5);
			else if(tmp <= 64)	al.add(6);
			else if(tmp <= 69)	al.add(7);
			else if(tmp <= 75)	al.add(8);
			else if(tmp <= 81)	al.add(9);
			else if(tmp <= 91)	al.add(10);
			else				al.add(11);
			
		}
		
		for(int i : al) {
			if(i == 1)	System.out.println("light fly");
			if(i == 2)	System.out.println("fly");
			if(i == 3)	System.out.println("bantam");
			if(i == 4)	System.out.println("feather");
			if(i == 5)	System.out.println("light");
			if(i == 6)	System.out.println("light welter");
			if(i == 7)	System.out.println("welter");
			if(i == 8)	System.out.println("light middle");
			if(i == 9)	System.out.println("middle");
			if(i == 10)	System.out.println("light heavy");
			if(i == 11)	System.out.println("heavy");
		}
	}
}