import java.io.*;
import java.util.*;


public class Main{ 

	public static void main(String args[]){
		
		Scanner scan = new Scanner(System.in);
		Dice d = new Dice(scan.nextLine());
		String order = scan.nextLine();
        for(int i=0; i<order.length();i++)
        	d.roll(order.charAt(i));
        d.printTop();
	}
}

class Dice{
	int top;
	int back;
	int right;
	int left;
	int front;
	int bottom;
	public Dice(String line){
		String[] face = line.split(" ");
		top = Integer.parseInt(face[0]);
		back = Integer.parseInt(face[1]);
		right = Integer.parseInt(face[2]);		
		left = Integer.parseInt(face[3]);
		front = Integer.parseInt(face[4]);
		bottom = Integer.parseInt(face[5]);
	}
	public void roll(char c){
		int tmp = top;
		switch(c){
			case 'N':
				top = back;
				back=bottom;
				bottom = front;
				front = tmp;
				break;
			case 'E':
				top = left;
				left = bottom;
				bottom = right;
				right = tmp;
				break;
			case 'S':
				top = front;
				front = bottom;
				bottom = back;
				back = tmp;
				break;
			case 'W':
				top = right;
				right = bottom;
				bottom = left;
				left = tmp;
				break;
		}
	}
	public void printTop(){
		System.out.println(this.top);
	}
	
}	
	
	