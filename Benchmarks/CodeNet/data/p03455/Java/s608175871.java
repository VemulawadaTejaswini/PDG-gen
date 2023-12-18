import java.util.Scanner;

class Main{


	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int a = scanner.nextInt();
		int b = scanner.nextInt();
		if(a*b % 2 == 0){
			System.out.println("Even");

		}else{
			System.out.println("Odd");

		}
	}
}




class Graph{
	int from;
	int to;
	int cost;

	public Graph() {
	}

	public Graph(int f,int t,int c) {
		from = f;
		to= t;
		cost = c;
	}
}
