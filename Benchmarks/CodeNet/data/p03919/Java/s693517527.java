import java.util.Scanner;
import java.util.stream.IntStream;

public class Main{
	static final Scanner s=new Scanner(System.in);
	static int getInt(){
		return Integer.parseInt(s.next());
	}
	public static void main(String[] __){
		int h=getInt(),w=getInt();
		for(int i=1;i<=h;i++)
			for(char c='A';c-'A'<w;c++)
				if(s.next().equals("snuke"))
					System.out.println(""+c+i);
	}
}
