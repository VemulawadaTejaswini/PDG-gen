import java.util.Scanner;

class Main{

    public static void main(String[] args){
	Scanner scan = new Scanner(System.in);

	while(true){

	    String data = scan.next();

	    if(data.equals("apple")){
		System.out.print("peach ");
	    }else if( data.equals("Apple")){
		System.out.print("Peach ");
	    }else if(data.equals("peach")){
		System.out.print("apple ");
	    }else if(data.equals("Peach")){
		System.out.print("Apple ");
	    }else{

		int length = data.length();
		if(data.charAt(length-1)=='.'){
		    if(data.substring(0, length-1).equals("apple")){
			System.out.print("peach");
		    }else if( data.substring(0, length-1).equals("Apple")){
			System.out.print("Peach");
		    }else if(data.substring(0, length-2).equals("paech")){
			System.out.print("apple");
		    }else if(data.substring(0, length-1).equals("Peach")){
			System.out.print("Apple");
		    }
		    System.out.println(".");
		    break;
		}else{
		    
		    System.out.print(data + " ");
		}
	    }
	}
    }
}