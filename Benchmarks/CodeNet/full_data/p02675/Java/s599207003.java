import java.util.*;
public class Main
{
	public static void main(String[] args) {
	    Scanner sc = new Scanner(System.in);
	    int N = sc.nextInt();
	    int op= N%10;
	    if(op==2|| op==4||op==5||op==7||op==9){
	        System.out.println("hon");
	    }
	    if(op==0|| op==1||op==6||op==8){
	        System.out.println("pon");
	    }
	   	if(op==3){
	        System.out.println("bon");
	    }
	}
}