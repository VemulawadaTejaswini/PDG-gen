import java.util.*;
 
public class Main {
	public static void main (String[] args) {
		Scanner in = new Scanner(System.in);
		
		int nam = in.nextInt();
        int len = String.valueOf(nam).length();
        
        if(len == 1){nam = nam;}
        if(len == 2){nam = nam%10;}
        if(len == 3){nam = nam%10;}

        if(nam == 3){System.out.print("bon");}
        else if(nam == 0 || nam == 1 || nam == 6 || nam == 8){System.out.print("pon");}
        else{System.out.print("hon");}
      
	}
}
