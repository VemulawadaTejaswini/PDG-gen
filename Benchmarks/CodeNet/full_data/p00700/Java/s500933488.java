import java.util.*;
import java.lang.Math;
class Main
{
    static int maxX;
    static int maxY;
    static int maxLength;
    final static int startX=0;
    final static int startY=0;
    
    public static void main(String[] args)
    {
	int dx,dy,length;
	int currentX,currentY;
	Scanner sc=new Scanner(System.in);
	int attend=sc.nextInt();
	for(int i=0;i<attend;i++){
	    currentX=startX;
	    currentY=startY;
	    maxLength=0;maxX=0;maxY=0;
	    while(true){
		dx=sc.nextInt();
		dy=sc.nextInt();
		currentX+=dx;
		currentY+=dy;
		if(dx==startX&&dy==startY)break;

		length=currentX*currentX+currentY*currentY;

		if(maxLength==length){
		    if(maxX<currentX){
			maxX=currentX;
			maxY=currentY;
		    }
		}
		else if(maxLength<length){
		    maxLength=length;
		    maxX=currentX;
		    maxY=currentY;
		}
	    }
	    System.out.println(maxX+" "+maxY);
	}
	
    }
    
}