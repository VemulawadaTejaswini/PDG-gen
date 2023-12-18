public class Main
{
	public static void main(String[] args)
	{
		String input1 = "CODEFESTIVAL";
		String input2 = "POSTGRADUATE";
		String input3 = "ABCDEFGHIJKL";
		
		System.out.println(question1(input1));
		System.out.println(question1(input2));
		System.out.println(question1(input3));
	}
	
	public static String question1(String input)
	{
		String result = input.substring(0, 4) + " " + input.substring(4);
		
		return result;
	}
}