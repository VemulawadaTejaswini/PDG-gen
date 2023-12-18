import java.util.*;
class Main{
    public static void main(String[] args){
	Scanner stdIn = new Scanner(System.in);
        int P = stdIn.nextInt();
	int Q = stdIn.nextInt();
	int R = stdIn.nextInt();
	int min=P+Q;
	int pr=P+R;
	int qr=Q+R;
	if(min>pr){
	    min=pr;
	}else if(min>qr){
	    min=qr;
	}
	System.out.println(min);
    }
}
