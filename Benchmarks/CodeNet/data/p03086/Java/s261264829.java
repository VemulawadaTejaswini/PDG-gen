import java.util.Scanner;

public class Main {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		 String a = sc.next();
		 int count = 0;
		 int compare = 0;
		 String[] aArray = new String[a.length()];

		 for(int i = 0; i < a.length() ; i++){
			 aArray[i] = String.valueOf(a.charAt(i));

			 if(aArray[i].equals("A") || aArray[i].equals("T") || aArray[i].equals("G") || aArray[i].equals("C")){
				 count= count + 1 ;
			 }
			 else{
				 if(compare < count){
					 compare = count;
					 count = 0;
				 }
				 else{
					 count = 0;
				 }

			 }
		 }

		 if(compare == 0){
			 compare = count;
		 }
		 System.out.println(compare);
	}
}
