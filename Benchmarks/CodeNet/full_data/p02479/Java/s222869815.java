import java.io.*;
import java.util.Scanner;

class Test{
    public static void main(String args[]){
	//int r;//半径
	double menseki;//面積
	double syuu;//円周の長さ
	Scanner stdIn = new Scanner(System.in);
	int r = stdIn.nextInt();
	menseki = r*r*3.14;
	syuu = 2*3.14*r;
	System.out.println("面積="+menseki);
	System.out.println("円周の長さ ="+syuu);
    }
}