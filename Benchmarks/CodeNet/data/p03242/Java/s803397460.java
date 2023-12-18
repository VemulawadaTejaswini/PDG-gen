import java.util.*;

public class Main {
	public static void main(String[] args){
	     Scanner sc = new Scanner(System.in);
	     int n = sc.nextInt();
	     
	     int n3 = n%10;
	     int n2 = n/10%10;
	     int n1 = n/100;

	     Switch(n1){
	     	case 1;
	     	n1 = 9;
	     	break;
	     	case 9;
	     	n1 = 9;
	     	break;
	     }

	     Switch(n2){
	     	case 1;
	     	n2 = 9;
	     	break;
	     	case 9;
	     	n2 = 1;
	     	break;
	     }

	     Switch(n3){
	     	case 1;
	     	n3 = 9;
	     	break;
	     	case 9;
	     	n3 = 1;
	     	break;
	     }

	     System.out.println(100*n1 + 10*n2 + n3);
	}
}