import java.util.Scanner;

public class Main {
	static StringBuffer buf = new StringBuffer();
    public static void main (String args[]){
    	Scanner sc = new Scanner(System.in);
    	int X = sc.nextInt();
    	int H = sc.nextInt();
    	int x = sc.nextInt();
    	int y = sc.nextInt();
    	int r = sc.nextInt();

    	if(x<0){
    		x = -x;
    	}

    	if(y<0){
    		y = -y;
    	}
    	
    	int count = 0;
    	if(x+r<=X){
    	    count++;
    	}
    	if(y+r<=H){
    	    count++;
    	}

    	if(count == 2){
    	    System.out.println("Yes");
    	}else{
    	    System.out.println("No");
    	}



    }
}