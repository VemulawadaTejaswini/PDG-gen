import java.util.*;

public class Main {
  public static void main(String[] args) {
	Scanner sc = new Scanner(System.in);
	char at=sc.next().charAt(0),top=sc.next().charAt(0);
	if(at=='H'){
		if(top=='H')System.out.println("H");
		else System.out.println("D");
	}
	else{
		if(top=='H')System.out.println("D");
		else System.out.println("H");
	}
	sc.close();
  }
}
