package sample;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		String str = scan.nextLine();
		String[] strContena = str.split(" ");
      int sum = 0;
      
      if(strContena[0].equals("5") || strContena[0].equals("7")) {
      	sum += Integer.parseInt(strContena[0]);
      	System.out.println(strContena[0]);
      }
      if(strContena[1].equals("5") || strContena[1].equals("7")) {
      	sum += Integer.parseInt(strContena[1]);
      	System.out.println(strContena[1]);
      }
      if(strContena[2].equals("5") || strContena[2].equals("7")) {
      	sum += Integer.parseInt(strContena[2]);
      	System.out.println(strContena[2]);
      }
      
      if(sum == 17) {
      	System.out.print("Yes");
      }else {
      	System.out.print("No");
      }
      scan.close();
	}

}
