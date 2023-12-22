import java.util.Scanner;

class Main{

    public static void main(String[] args){
	Scanner scan = new Scanner(System.in);

	while(true){

	    String data = scan.next();

	    if(data.equals("apple") || data.equals("Apple")){
		System.out.print("peach ");
	    }else if(data.equals("peach") || data.equals("Peach")){
		System.out.print("apple ");
	    }else{
		int length = data.length();

		if(data.charAt(length-1)=='.'){
		    if(data.substring(0, length-1).equals("apple") || data.substring(0, length-1).equals("Apple")){
			System.out.print("peach");
		    }else if(data.substring(0, length-2).equals("paech") || data.substring(0, length-1).equals("Peach")){
			System.out.print("apple");
		    }
		    System.out.println(".");
		    break;
		}

		System.out.print(data + " ");
	    }
	}
    }
}