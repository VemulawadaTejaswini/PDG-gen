import java.util.Scanner;
public class Main{
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String str = "";
		while(sc.hasNext()){
			str = sc.next();
			if(str.indexOf(".")!=-1)
				str=str.substring(0, str.length()-1);
			if(str.indexOf(",")!=-1)
				str=str.substring(0, str.length()-1);
			if(str.length()<3 || str.length()>6){
				continue;
			}
			System.out.print(str);
			if(sc.hasNext())
				System.out.print(" ");
			else
				System.out.println("");		
		}
	}

}