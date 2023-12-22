import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		String str = sc.next();
		char[] list = str.toCharArray();

        int[] intArray = convertIntArray(list);
        int sum = 0;

		for(int i = 0; i < intArray.length; i++)
		{
			sum += intArray[i];
		}

		if(sum % 9 != 0)
		{
			System.out.println("No");
		}
		else
		{
			System.out.println("Yes");
		}
	}

	private static int[] convertIntArray(char[] array)
	{
		int[] intArray = new int[array.length];
		int index = 0;

		for(int i = 0; i < array.length; i++)
		{
			intArray[i] = Character.getNumericValue(array[i]);
		}

		return intArray;
	}
}
