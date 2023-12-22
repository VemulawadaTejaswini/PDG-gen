import java.io.*;
import java.util.*;

class Rectangle implements Comparable<Rectangle> {
	int height;
	int width;
	int diag;
	
	Rectangle(int h,int w){
		height= h;
		width = w;
		diag  = h*h+w*w;
	}
	
	public int compareTo(Rectangle rec) {
		if( this.diag==rec.diag ){
			return this.height-rec.height;
		} else{
			return this.diag-rec.diag;
		}
	}
	
	@Override
	public String toString(){
		return height+" "+width;
	}
}

public class Main{
	public static TreeSet<Rectangle> prepare() {
		final int MAX_WIDTH= 100;
		final int MAX_DIAG= 2*MAX_WIDTH*MAX_WIDTH;
		TreeSet<Rectangle> result= new TreeSet<Rectangle>();
		for(int h=1; h*h<=MAX_DIAG; h++){
			for(int w=h+1; w*w+h*h <= MAX_DIAG; w++){
				result.add(new Rectangle(h,w));
			}
		}

		return result;
	}
    public static void main(String args[]) throws Exception{
    	Scanner sc= new Scanner(System.in);
    	TreeSet<Rectangle> ans= prepare();
    	int h,w;
    	while( (h= sc.nextInt())>0 && (w= sc.nextInt())>0 ){
        	System.out.println( ans.higher(new Rectangle(h,w)) );
    	}
    }
}