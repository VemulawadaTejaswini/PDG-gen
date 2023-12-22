import java.util.*;

class Main {
	Scanner sc = new Scanner(System.in);

	public void run() {
		while(sc.hasNext()){
			String[] data=sc.next().split(",");
			int id=Integer.parseInt(data[0]);
			double weight=Double.parseDouble(data[1]);
			double height=Double.parseDouble(data[2]);
			if(weight>=height*height*25){
				ln(id);
			}
		}

	}

	public static void main(String[] args) {
		new Main().run();
	}

	public static void pr(Object o) {
		System.out.print(o);
	}

	public static void ln(Object o) {
		System.out.println(o);
	}

	public static void ln() {
		System.out.println();
	}
}