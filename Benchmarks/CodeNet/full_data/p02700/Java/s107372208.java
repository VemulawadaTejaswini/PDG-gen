import java.util.*;
import java.io.*;
public class Main{
  public static void main(String [] args){

	Scanner sc=new Scanner(System.in);
	int ah=sc.nextInt();
	int as=sc.nextInt();

	int bh=sc.nextInt();
	int bs=sc.nextInt();

	int ahamla=((bh+as-1)/as);
	int bhamla=((ah+bs-1)/bs);

	if(ahamla<=bhamla){
		System.out.println("Yes");
	}
	else{
		System.out.println("No");
	}
  }

}