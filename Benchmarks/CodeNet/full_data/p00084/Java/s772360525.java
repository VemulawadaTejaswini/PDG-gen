import java.util.Scanner;
public class Main{
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String str = "";
		String pstr = "";
		while(sc.hasNext()){
			str = sc.next();
			if(str.indexOf(".")!=-1)
				str=str.substring(0, str.length()-1);
			if(str.indexOf(",")!=-1)
				str=str.substring(0, str.length()-1);
			if(str.length()<3 || str.length()>6){
				continue;
			}
			else
				pstr+=str+" ";
		}
		pstr=pstr.substring(0,pstr.length()-1);
		System.out.println(pstr);
	}
}