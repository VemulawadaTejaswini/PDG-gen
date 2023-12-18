import java.util.Scanner;

public class Main
{

    public static void main(String[] args)
    {
	Scanner scanner = new Scanner(System.in);

	String s = scanner.next();

	scanner.close();

	int stringLength = s.length();

	// 1
	String sReverse = reverseString(s);
	boolean firstCondition = s.equals(sReverse);

	// 2
	int partLength = (stringLength - 1) / 2;

	String sPart = s.substring(0, partLength);
	String sPartReverse = reverseString(sPart);
	boolean secondCondition = sPart.equals(sPartReverse);

	// 3
	int otherPartLength = (stringLength + 3) / 2 - 1;

	String sOtherPart = s.substring(otherPartLength, stringLength);
	boolean thirdCondition = sOtherPart.equals(reverseString(sOtherPart));

	String result;

	if (firstCondition && secondCondition && thirdCondition)
	{
	    result = "Yes";
	}
	else
	{
	    result = "No";
	}

	System.out.println(result);
    }

    private static String reverseString(String s)
    {
	return new StringBuilder(s).reverse().toString();
    }

}