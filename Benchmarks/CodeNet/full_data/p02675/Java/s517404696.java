
import java.io.*;
import java.util.*;
public class test{


public static void main(String[] args) {
	Scanner sc=new Scanner(System.in);
	int N=sc.nextInt();
	String pron[]=new String[10];
	pron[0]="pon";
	pron[1]="pon";
	pron[2]="hon";
	pron[3]="bon";
	pron[4]="hon";
	pron[5]="hon";
	pron[6]="pon";
	pron[7]="hon";
	pron[8]="pon";
	pron[9]="hon";
	System.out.println(pron[N%10]);
	
		
}

}
