import java.util.*;
class Main{
    public static void main(String[] args){
	Scanner stdIn = new Scanner(System.in);
        int P = stdIn.nextInt();
	int Q = stdIn.nextInt();
	int R = stdIn.nextInt();
	int[] a={P,Q,R};
	Arrays.sort(a);
	System.out.println(a[0]+a[1]);
    }
}