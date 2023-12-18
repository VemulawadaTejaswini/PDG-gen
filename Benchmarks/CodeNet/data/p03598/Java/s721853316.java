public class Main {

	 public static void main(String[] args) {
		    java.util.Scanner scanner = new java.util.Scanner(System.in);
		    int n = scanner.nextInt();
		    int k = scanner.nextInt();
		    int kyori = 0;
		    for (int i = 0; i < n; i++) {
		    	int x = scanner.nextInt();
		    	kyori = kyori + Math.min(x, Math.abs(x - k));
		    }
		    System.out.println(kyori * 2);
		 }

}