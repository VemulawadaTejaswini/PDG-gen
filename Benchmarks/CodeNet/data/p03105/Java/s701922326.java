public class Main {
	public static void main(String[] args) {
		int A = args[0];
      	int B = args[1];
      	int C = args[2];
      	int count = B / A;
      	if (count > C) count = C;
      	System.out.println(count);
	}
}