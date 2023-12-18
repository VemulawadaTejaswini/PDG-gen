import java.util.*;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
    Scanner reader=new Scanner(System.in);
  /*  String s1 =reader.next();
    String s2 =reader.next();
    String s3 =reader.next();
    String s= s1.substring(0,1)+s2.substring(0,1)+s3.substring(0,1);
    System.out.print(s.toUpperCase());
	}*/
	int A=reader.nextInt();
	int B=reader.nextInt();
	if(A==B) {
		System.out.println("Draw");
	}
	
	else if(A<B && A!=1) {
		System.out.println("Bob");
	}
	else if (B==1){
		System.out.println("Bob");
		
	}
	else {
		System.out.println("Alice");
	}
	}									
	

}
