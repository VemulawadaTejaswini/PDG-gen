import java.util.*;
public class Main
{
	public static void main(String[] arguments) throws Exception
	{
		Scanner sc = new Scanner(System.in);
        Integer number = Integer.valueOf(sc.next());
        Integer rating = Integer.valueOf(sc.next());
        Integer result;
        if(number >= 10) {
			result = rating;
		} else {
			result = 100 * (10-number);
		}
		System.out.println(result);
		return;
      }
}