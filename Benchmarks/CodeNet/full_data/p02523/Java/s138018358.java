import java.io.*;
import java.util.*;

class Main{
    public static void main(String[] arg){
	Scanner sc = new Scanner(System.in);
	int x1, y1, x2, y2;
	x1 = sc.nextInt();
	y1 = sc.nextInt();
	x2 = sc.nextInt();
	y2 = sc.nextInt();
	
	System.out.println(Math.sqrt((x1-x2)*(x1-x2)+(y1-y2)*(y1-y2)));
    }
}