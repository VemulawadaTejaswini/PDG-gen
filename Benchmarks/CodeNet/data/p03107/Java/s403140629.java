import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
    	Scanner input = new Scanner(System.in);
      	String S = input.next();
      	int A = countOf(S, '0');
      	int B = countOf(S, '1');
      
      	if (A > B) {
        	int tmp = B;
          	A = B;
          	B = A;
        }
      	
      System.out.print(A * 2);

    }
  static int countOf(String str, char target){
	int count = 0;

	for(char x: str.toCharArray()){
		if(x == target){
			count++;
		}
	}

	return count;
}
}
