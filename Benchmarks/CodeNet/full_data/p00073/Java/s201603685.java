import java.util.*;

class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		List<Double> al= new ArrayList<>();
		
		int x, h;
		
		while(true) {
			x = sc.nextInt();
			h = sc.nextInt();
			
			if(x == 0 && h == 0)	break;
			
			al.add(x * x +  x * Math.sqrt(x * x + h * h * 4));
		}
		
		for(double i : al) {
			System.out.println(i);
		}
	}
}