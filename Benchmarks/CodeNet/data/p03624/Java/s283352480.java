import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		 Scanner sc = new Scanner(System.in);
	     String S = sc.nextLine();
	     String abc ="abcdefghijklmnopqrstuvwxyz";
	     String ans = "None";
	     char C;
	     String com;
	     
		 for(int i=0; i< abc.length(); i++){
		 	com =  String.valueOf(abc.charAt(i));
	     	if (!S.contains(com)){
	     		ans = com;
	     		break;
	     	}
	     }
	     System.out.println(ans);
	}
}
