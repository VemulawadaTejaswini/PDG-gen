import java.util.*;

public class Main {
	public static void main(String[] args){
    	Scanner sc = new Scanner(System.in);
      	int d = sc.nextInt();
    	String christmas = "Christmas";
        String eve = " Eve";

      	if (d == 25) { 
			System.out.println(christmas);
       	} else if (d == 24) {
        	System.out.println(christmas + eve);
        } else if ( d == 23) {
        	System.out.println(christmas + eve + eve);
        } else if ( d == 22) {
        	System.out.println(christmas + eve + eve + eve);
        }else {
        	System.out.println("error");
        }
    }
}

  