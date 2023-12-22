import java.io.*;
import java.util.Vector;
import java.util.Scanner;

class Main{
  public static void main(String[] args)throws java.io.IOException{
	
        int s[] = new int[2];
	
	Scanner sc = new Scanner(System.in);
	for(int i=0;i<s.length;i++){
	System.out.println("??´??°?????\???");
	s[i] = sc.nextInt();
	}
	System.out.println(s[0]*s[1] +" "+ 2*(s[0]+s[1]));
  }
}