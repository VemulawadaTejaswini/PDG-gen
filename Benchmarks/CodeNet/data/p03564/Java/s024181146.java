public class Main {
  public static void main(String[] args) {
      java.util.Scanner scanner = new java.util.Scanner(System.in);
       int n = scanner.nextInt();
       int k = scanner.nextInt();
				  int result = 0;
				  for (int i = 0; i < n; i++) {
					  int tmp =  (int) Math.pow(2, i) + k * (n - i);
					  if (tmp > result) {
						  result = tmp;
					  }
				  }
				  System.out.println(result);


 }
}