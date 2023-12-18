package test;

import java.util.Scanner;

public class ChocolateBar {
 public static double CutBar(int H, int W) {
	 if (H*W%3==0)  
		 return 0;
	 else if(H<W) 
		 return H*Math.floor(W/2)-(W-Math.floor(W/2))*Math.floor(H/2);
	 else  
		 return  W*Math.floor(H/2)-(H-Math.floor(H/2))*Math.floor(W/2);
 }
 
 public static void main(String[] args){
	 System.out.println("input H:");
	 int H=new Scanner(System.in).nextInt();
	 System.out.println("input W:");
	 int W=new Scanner(System.in).nextInt();		 
	 System.out.println("result:"+(int)CutBar(H,W));
	 
 }
 
 
}
