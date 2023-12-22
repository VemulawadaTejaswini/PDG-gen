import java.util.*;
public class Main{
    public static void main(String[] args){
	Scanner kbd = new Scanner(System.in);
	
	while(kbd.hasNext()){
	    
	    int r = kbd.nextInt();
	    int c = kbd.nextInt();

	    if(r!=0 && c!=0){
		if((r*c)%2==0) System.out.println("yes");
		else System.out.println("no");
	    }
	}
    }
}
	