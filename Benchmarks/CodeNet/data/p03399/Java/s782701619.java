import java.util.Scanner;

class Main{
	public static void main(String[] args){
		Scanner stdIn = new Scanner(System.in);
		int a = stdIn.nextInt();
		int b = stdIn.nextInt();
		int c = stdIn.nextInt();
		int d = stdIn.nextInt();
		int train_min = a;
		int bus_min = c;
		if(train_min > b)
			train_min = b;
		if(bus_min > d)
			bus_min = d;
                int ans = train_min + bus_min;
		System.out.println(ans);
	}
}