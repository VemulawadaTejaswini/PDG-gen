import java.util.*;
public class Main {
	public static void main(String[] args) {
		Scanner input=new Scanner(System.in);
		int a[]=new int [3];
		for (int i = 0; i < a.length; i++) {
			a[i]=input.nextInt();
		}
		if(a[0]==5&&a[1]==5&&a[2]==7)
			System.out.println("yes");
		     System.out.println("Using three phrases of length 5, 5 and 7, it possible to construct a Haiku"); 
		if(a[0]!=5&&a[1]!=5&&a[2]!=7)
			    System.out.println("no");
	}

}
