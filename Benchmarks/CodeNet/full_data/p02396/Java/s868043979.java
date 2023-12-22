import java.util.*;

public class Main{
  public static void main(String[] args){
	Scanner sc = new Scanner(System.in);

	int i;

	for(i=1;i<10001;i++){
	int a = sc.nextInt();

	  if(a == 0) break;

	  System.out.println("Case "+i+": "+a);
	}

  }
}