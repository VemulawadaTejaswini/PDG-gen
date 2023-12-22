import java.util.*;
public class Main {
	
	static int pos=0;
	public static void main(String[] args) {
		Scanner in=new Scanner(System.in);
		int H=in.nextInt(),W=in.nextInt();
		int field[][]=new int[H][W],max=0;
		
		for(int i=0;i<H;i++) {
			for(int j=0;j<W;j++) {
				field[i][j]=Integer.parseInt(in.next())==1 ? 0 : 1;
				if(i>0 && field[i][j]>0)field[i][j]=field[i-1][j]+1;
			}
		}
		
		for(int i=0;i<H;i++) {
			Stack<Rect> stk=new Stack<>();
			for(int j=0;j<W;j++) {
				if(stk.isEmpty() || field[i][j]>stk.peek().h) {
					stk.push(new Rect(field[i][j],j));
				}
				else if(field[i][j]<stk.peek().h) {
					max=Math.max(max,createRect(stk,field[i][j],j));
					stk.push(new Rect(field[i][j],pos));
				}
			}
			max=Math.max(max, createRect(stk,0,W));
		}
		
		System.out.println(max);
	}
	
	static int createRect(Stack<Rect> stk,int h,int i) {
		int max=0;
		while(!stk.isEmpty()) {
			Rect crect=stk.peek();
			if(crect.h<h)break;
			
			max=Math.max(max, crect.h*(i-crect.i));
			pos=crect.i;
			stk.pop();
		}
		return max;
	}
	
}

class Rect{
	int h,i;
	Rect(int a,int b){
		h=a;i=b;
	}
}

