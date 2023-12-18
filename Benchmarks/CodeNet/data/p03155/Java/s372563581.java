import java.util.Scanner;

public class Prob6 {
	public static void main(String[] args) throws FileNotFoundException{
		Scanner scanner = new Scanner(new File("/Users/lester/codeforces-workspace/codeforces/codeforces/codeforces4/Prob6"));
		int length = scanner.nextInt();
     	int height = scanner.nextInt();
      	int width = scanner.nextInt();
      	int result = (length - height + 1)  * (length - width + 1);
      	System.out.print(result);
    }
}