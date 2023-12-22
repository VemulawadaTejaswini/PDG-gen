import java.util.ArrayList;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO ?????????????????????????????????????????????
		Scanner s = new Scanner(System.in);
		int a,b;
		ArrayList<String> str = new ArrayList<String>();
		String[] result;
		
		for(int i = 0;i <3;i++)
		{
			str.add(s.nextLine());
			result = str.get(i).split(" ");
			System.out.println(String.valueOf(Integer.parseInt(result[0])+Integer.parseInt(result[1])).length());
		}
		
		//for(int i =0;i<200;i++);


		


	}

}