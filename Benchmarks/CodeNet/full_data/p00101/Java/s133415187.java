import java.io.*;
import java.util.*;

public class Main {
	public static void main(String[] args)
			throws java.io.IOException{
		Scanner scan = new Scanner(System.in);
		int n= scan.nextInt();
		scan.nextLine();
		for(int i =0;i<n;i++){
			String str = scan.nextLine();
			System.out.println(str.replaceAll("Hoshino","Hoshina"));
		}
	}
}