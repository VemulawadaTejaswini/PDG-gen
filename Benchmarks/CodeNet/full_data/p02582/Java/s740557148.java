import java.util.*;
public class Main {
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		
		String a = sc.next();
      	int s = 0;
		switch (a){
			case "SSS":
				s = 0;
				break;
			case "SRR":
				s = 2;
				break;
          case "RRS":
            	s = 2;
            break;
          	case "RRR":
            	s = 3;
            break;
			default:
				s = 1;
		}
      System.out.println(s);
	}
}