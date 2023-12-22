import java.util.*;
class Main{
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		while(sc.hasNext()) {
		  int n1 = sc.nextInt();
		  int n2 = sc.nextInt();
      int div;
		  while(n2 != 0){
			  div = n1 % n2;
		  	n1 = n2;
		  	n2 = div;
		  }
		System.out.println(n1);
	  }
	}
}
