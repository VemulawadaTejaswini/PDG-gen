public class Main {
	public static void main(String[] args) {
		int A = Integer.parseInt(args[0]);
      	int B = Integer.parseInt(args[1]);
      	int C = Integer.parseInt(args[2]);
      	int count = B / A;
      	if (count > C) count = C;
      	System.out.println(count);
	}
}