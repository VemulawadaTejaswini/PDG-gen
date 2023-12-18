import java.util.*;
class Main {
    public static void main(String[] args) {
	Scanner sc = new Scanner(System.in);
	int K = sc.nextInt();
	long A = sc.nextLong();
	long B = sc.nextLong();
	long prepre = 1;
	long pre = 2;
	for(int i = 2; i<=K; i++) {
	    long bis = 0;
	    if(prepre>=A) {
		bis = (long)(Math.max(pre+1, prepre-A+B));
	    }else {
		bis = pre+1;
	    }
	    prepre = pre;
	    pre = bis;
	}
	System.out.println(pre);
    }
}