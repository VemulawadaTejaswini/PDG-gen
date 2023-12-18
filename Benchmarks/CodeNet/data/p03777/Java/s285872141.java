import java.util.Scanner;
public class Main{
	public static void main(String[] args) {
		Scanner in=new Scanner(System.in);
		String str=in.nextLine();
		char ch1=str.charAt(0);
		char ch2=str.charAt(2);
		//System.out.println(ch1+"=="+ch2);
		
		if(ch1=='H'){
			if(ch2=='H'){
				System.out.println("H");
			}else if(ch2=='D'){
				System.out.println("D");
			}
		}else if(ch2=='D'){
			if(ch2=='H'){
				System.out.println("D");
			}else if(ch2=='D'){
				System.out.println("H");
			}
		}
	}
}