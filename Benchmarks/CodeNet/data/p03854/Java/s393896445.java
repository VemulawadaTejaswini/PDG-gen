import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
				
				Scanner stdIn=new Scanner(System.in);
				
			String s=stdIn.next();
		
		String[] t={"dream","dreamer","erase","eraser","dreamererase","dreameraser"};
		
			
			s=s.replace(t[5],"");
			s=s.replace(t[4],"");
			s=s.replace(t[1],"");
			s=s.replace(t[3],"");
			s=s.replace(t[0],"");
			s=s.replace(t[2], "");
				
				if(s.equals(""))
		System.out.println("YES");
				else
					System.out.println("NO");
			}
}