import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		String str=new String();
		String p = new String();
		int count=0;
		 p = scan.nextLine();
		 while(scan.hasNext()){
		 str =  scan.next();

		 if(str.equals("END_OF_FILE"))break;
		for(int i=str.length()-1;i>=0; i--){
			int index=str.indexOf(p, i);
			if(i==index)count++;
			}
		 }
		 System.out.println(count);
	}
}