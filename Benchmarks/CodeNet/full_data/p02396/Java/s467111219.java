import java.util.Scanner;

public class Main {
	public static void main(String[] args){
	    Scanner std = new Scanner(System.in);
	    int num = 1;
	    while(true){
	    	int n = Integer.parseInt(std.next());
	    	if(n!=0){
	    		System.out.println("Case "+num+": "+n);
	    		num++;
	    	}else{
	    		break;
	    	}
	    }
	}
}