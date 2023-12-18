

import java.util.Scanner;

class Main{
	public static void main(String[] ag) {
		Scanner sc=new Scanner(System.in);
		long A=sc.nextLong();
		long B=sc.nextLong();
		long C=sc.nextLong();
      
      if(Math.abs(B-A)>Math.abs(C-A)){
        System.out.println("B");
      }
      else{
        System.out.println("A");
      }
	}
}