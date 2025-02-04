import java.io.*;
import java.util.*;


public class Main{ 

	public static void main(String args[]){
		
		Scanner scan = new Scanner(System.in);
		DiceExtend d01 = new DiceExtend(scan.nextLine());
		Dice d02 = new Dice(scan.nextLine());
		if(d01.rollAllPattern(d02))
			System.out.println("Yes");
		else
			System.out.println("No");
	}

}
class DiceExtend extends Dice{
	public DiceExtend(String line){
		super(line);
	}
	public void printTop(){
		System.out.println(this.top);
	}
	public boolean rotateCheck(Dice d){
		for(int j=0;j<4;j++){
			rotate();
			if(this.equals(d))
				return true;
		}
		return false;
	}
	public boolean rollAllPattern(Dice d){
		for(int i=0; i<4;i++){
			roll('N');
			if(rotateCheck(d))
				return true;
		}
		roll('W');
		if(rotateCheck(d))
			return true;		
		roll('E');
		roll('E');		
		if(rotateCheck(d))
			return true;		
		return false;				
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
	void rotate(){
		int tmp = front;
		front = right;
		right=back;
		back = left;
		left = tmp;
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
	boolean equalFace(Dice d){
		if(this.top == d.top && 
		   this.bottom==d.bottom &&
		   this.right == d.right &&
		   this.left == d.left &&
		   this.front == d.front &&
		   this.back == d.back)
			return true;
		else
			return false;
	}
	@Override
	public int hashCode() {
	    final int prime = 31;
	    int result = 1;
	    result = prime * result + top;
	    result = prime * result +bottom;
	    result = prime * result + right;
	    result = prime * result + left;
	    result = prime * result + front;
	    result = prime * result + back;
	    return result;
    }
	@Override
	public boolean equals(Object obj) {
		Dice d = (Dice) obj;
		if(this.top == d.top && 
		   this.bottom==d.bottom &&
		   this.right == d.right &&
		   this.left == d.left &&
		   this.front == d.front &&
		   this.back == d.back)
			return true;
		else
			return false;
	}
}	
	
	