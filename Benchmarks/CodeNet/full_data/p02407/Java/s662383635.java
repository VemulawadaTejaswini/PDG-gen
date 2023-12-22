import java.util.*;

public class Exam04_05_03{
	public static void main(String[] args) throws Exception{
		Scanner sc = new Scanner(System.in)
                String str=sc.nextLine();
                String str=sc.nextLine();
		String[] s=str.split(" ");
		for(int i=(s.length-1);i>=0;i--){
			System.out.print(s[i]);
		}
	}
}