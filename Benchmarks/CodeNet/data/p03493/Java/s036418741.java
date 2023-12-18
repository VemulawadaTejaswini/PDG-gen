import java.util.Scanner;

class Main{
    public static void main(String[] args){
	Scanner scan = new Scanner(System.in);

	String box = scan.next();
	int count = 0;
	
	for(int i = 0; i < box.length(); i++){
	    if(box.charAt(i) == '1'){
		count++;
	    }
	}

	System.out.println(count);
    }
}
	
