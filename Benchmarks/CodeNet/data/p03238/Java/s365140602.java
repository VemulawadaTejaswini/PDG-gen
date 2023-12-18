import java.util.Scanner;

class Main{
	public static void main(String[] args) {



		Scanner scanner = new Scanner(System.in);
		int N = scanner.nextInt();
	
		
		if(N == 1){
			System.out.println("Hello World");
		}else{
			int A = scanner.nextInt();
			int B = scanner.nextInt();
			System.out.println(A+B);
		}



	}


}

class Pair implements Comparable{
	int from;
	int end;
	@Override
	public int compareTo(Object other) {
		Pair otherpair = (Pair)other;

		return end - otherpair.end;
	}
}

