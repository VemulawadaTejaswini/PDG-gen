import java.util.Scanner;

class Main {
	private static void main(String[] args) {
    	Scanner sc = new Scanner(System.in);
      	String s = sc.next();
      	int left = 0;
      	int right = s.length() - 1;
      	int res = 0;
      
      	while (left < right) {
        	if (s.charAt(left) != s.charAt(right)) {
            	res++;
            }
          	left--;
          	right++;
        }
      
      	System.out.println(res);
      
    }
}