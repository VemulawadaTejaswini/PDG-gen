import java.util.*;
class Main{
    public static void main(String[] args){
	Scanner stdIn = new Scanner(System.in);
        int A = stdIn.nextInt();
	int B = stdIn.nextInt();
	int C = stdIn.nextInt();
	int o = A-B;
	if(o!=0){
	    C-=o;
	}
	if(C>0){
	    System.out.println(C);
	}else{
	    System.out.println(0);
	}
    }
}
