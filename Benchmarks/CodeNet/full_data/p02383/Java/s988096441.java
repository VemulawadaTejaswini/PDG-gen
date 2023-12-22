import java.util.Scanner;

class Dice {
	private int up;
	private int front;
	private int right;
	private int left;
	private int back;
	private int down;
	
	Dice(int up,int front,int right,int left,int back,int down){
		this.up=up;	this.front=front; this.right=right;
		this.left=left; this.back=back; this.down=down;
	}
	
	void printUp(){	System.out.println(up); }
	
	void rotate(char c){
		int temp;
		if(c=='E'){
			temp=up; up=left; left=down; down=right; right=temp;
		}
		
		if(c=='N'){
			temp=up; up=front; front=down; down=back; back=temp;
		}
		
		if(c=='S'){
			temp=up; up=back; back=down; down=front; front=temp;
		}
		
		if(c=='W'){
			temp=up; up=right; right=down; down=left; left=temp;
		}
	}
		
			
}


class Main {
	public static void main(String[] args){
		Scanner scan=new Scanner(System.in);
		
		Dice d=new Dice(scan.nextInt(),scan.nextInt(),scan.nextInt(),scan.nextInt(),scan.nextInt(),scan.nextInt());
		
		String com=scan.next();
		for(int i=0;i<com.length();i++)
			d.rotate(com.charAt(i));
		
		d.printUp();
	}
}
