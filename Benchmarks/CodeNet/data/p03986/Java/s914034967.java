
import java.io.*;
import java.util.NoSuchElementException;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

	Scanner sc = new Scanner(System.in);

	String st=sc.next();
	StringBuilder str=new StringBuilder(st);
	int aaa=1;
	while(aaa!=-1){
	
	aaa=str.indexOf("ST");
		if(aaa!=-1){
		    str.deleteCharAt(aaa);
		    str.deleteCharAt(aaa);
		}
		}
	
	System.out.println(str.toString().length());
    }

}
