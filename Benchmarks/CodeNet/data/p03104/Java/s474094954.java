import java.util.*;
class Main {
    public static void main(String[] args) {
	Scanner sc = new Scanner(System.in);
	long A = Long.parseLong(sc.next());
	long B = Long.parseLong(sc.next());
	long rest = A-1;
	long flag = ((rest+1)/2 + (B+1)/2) % 2;

	if(rest % 2 == 0) {
	    flag = rest ^ flag;
	}
	if(B % 2 == 0) {
	    flag = B ^ flag;
	}
	System.out.println(flag);
    }
}