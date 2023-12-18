import java.util.*;


public class test
{
	
	public static void main(String[] atgs) {
		Scanner s=new Scanner(System.in);
		String str=s.nextLine();
		str=str.replace("eraser","");
		str=str.replace("erase","");
		str=str.replace("dreamer","");
		str=str.replace("dream","");
		if(str.equals(""))
			System.out.println("true");
		else System.out.println("false");
	}
}

