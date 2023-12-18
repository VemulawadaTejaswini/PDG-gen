import java.util.Scanner;

public class Main{

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String O = sc.nextLine();
		String E = sc.nextLine();
		String [] Oarray = O.split("");
		String [] Earray = E.split("");
		String output ="";
		if( Oarray.length >= Earray.length){
         for (int i =1; i < Oarray.length ; i++){
        	output +=Oarray[i];
        	output +=Earray[i];
         }
		}
		if( Oarray.length < Earray.length){
	         for (int i =1; i < Earray.length ; i++){
	        	output +=Oarray[i];
	        	output +=Earray[i];
	         }
	    }
		System.out.println(output);
	}

}