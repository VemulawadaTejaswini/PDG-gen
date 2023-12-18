import java.util.Scanner;
public class Main {
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		String str=sc.nextLine();
		System.out.println(isIncludeCf(str));
	}
	
	public static String isIncludeCf(String str){
		if(str.indexOf("C")<str.lastIndexOf("F")&&str.indexOf("C")>=0){
			return "Yes";
		}
		return "No";
	} 
}