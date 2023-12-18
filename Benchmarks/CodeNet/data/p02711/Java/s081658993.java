import java.util.*;

public class Main
{
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		String line = scanner.next();      	
      	int N = String.parseInt(line);
      	int sum = 0;
      	for (int i = 0; i <= N; i++){
        	if (( i%3 != 0) & ( i%5 != 0)){
            	sum += i;
            }
        }
      	System.out.println(sum);
	}
}