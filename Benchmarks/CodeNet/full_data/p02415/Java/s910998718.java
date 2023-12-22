import java.util.Scanner;
public class Main {
	public static void main(String[] args){
		Scanner scan=new Scanner(System.in);
		String s=scan.nextLine();
		for(int i=0;i<s.length();i++){
			if(65<=(s.charAt(i))&&(s.charAt(i))<=90){
				System.out.print((char)(s.charAt(i)+32));
			}else if(97<=(s.charAt(i))&&(s.charAt(i))<=122){
				System.out.print((char)(s.charAt(i)-32));
			}else{
				System.out.print(s.charAt(i));
			}
		}
		System.out.println();
		scan.close();
	}
}