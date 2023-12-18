import java.util.*;
class Main{
    public static void main(String[] args){
	Scanner stdIn = new Scanner(System.in);
	int a = stdIn.nextInt();
	int b = stdIn.nextInt();
	int min=Math.min(a,b);
	int max=Math.max(a,b);
	for(int i=0;i<max;i++){
	    System.out.print(min);
	}
	System.out.println("");
    }
}
