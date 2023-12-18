public class Main {
	public static void main(String[] args) throws Exception {
		    java.util.Scanner scanner = new java.util.Scanner(System.in);
                    int k = scanner.nextInt();
                    int result = k;
                    int x = 2;
                    while(true) {
                         int y = x * k;
                         int sum = 0;
                         String ystr = String.valueOf(y);
                         for (int i = 0; i < ystr.length(); i++ ) {
                             sum = sum + Integer.parseInt(String.valueOf(ystr.charAt(i)));
                         }
                         if (sum < result) {
                              result = sum;
                         }
                         if (ystr.length() >=result) {
                             break;
                         }
                         x++;
                    }
                    System.out.println(result);
		 } 
}