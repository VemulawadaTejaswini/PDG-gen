import java.util.Scanner;

class Main {
	public static void main(String args[]){
		Scanner scan = new Scanner(System.in);
		String s = scan.nextLine();
		String change = "";
		
		for(int i=0;i<s.length();i++){
			if(97<=s.charAt(i) && s.charAt(i)<=122){
				change += (char)(s.charAt(i)-32);
			}else if(65<=s.charAt(i) && s.charAt(i)<=90){
				change += (char)(s.charAt(i)+32);
			}else{
				change += s.charAt(i);
			}
		}
		
		System.out.println(change);
	}
}