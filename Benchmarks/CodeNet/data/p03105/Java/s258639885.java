import java.util.*;
class Main{
    public static void main(String[] args){
	Scanner stdIn = new Scanner(System.in);
        int A = stdIn.nextInt();
	int B = stdIn.nextInt();
	int C = stdIn.nextInt();
	int l =B/A;
	if(l>C){
	    l=C;
	}
	System.out.println(l);
    }
}
