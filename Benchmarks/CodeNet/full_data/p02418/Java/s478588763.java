import java.io.*;
import java.util.Scanner;
 
class Main {
    	public static void main(String[] args) {
        	Scanner sc = new Scanner(System.in);
        	String str = sc.nextLine();
        	String str2 = sc.nextLine();
        	String str3 = str + str;
        	if (str3.contains(str2)) {
            		System.out.println("Yes");
        	}else{
            		System.out.println("No");
        	}
    	}
}