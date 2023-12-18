import java.util.*;
class Main{
    public static void main(String[] args){
	Scanner stdIn = new Scanner(System.in);
        int N = stdIn.nextInt();
	int M = stdIn.nextInt();
	int m=(M*(M-1))/2; //偶数を２つ選ぶ
	int n=(N*(N-1))/2; //奇数を２つ選ぶ
	System.out.println(m+n);
    }
}
	    
	    
