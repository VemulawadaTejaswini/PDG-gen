import java.util.*;
class Main{
    public static void main(String[] args){
	Scanner stdIn = new Scanner(System.in);
        int A = stdIn.nextInt();
	int B = stdIn.nextInt();
	int tem = A+B;
	if(tem%2==0){
	    System.out.println(tem/2);
	}else{
	    System.out.println("IMPOSSIBLE");
	}
    }
}
