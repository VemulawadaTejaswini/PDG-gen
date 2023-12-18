import java.util.*;
class Main {
    public static void main(String[] args) {
	Scanner sc = new Scanner(System.in);
	int A = sc.nextInt();
	int B = sc.nextInt();
	int C = sc.nextInt();
	int X = sc.nextInt();
	int Y = sc.nextInt();

	int minN = X;
	int many = B;
	if(Y<X) {
	    minN = Y;
	    many = A;
	}

	int a = A*X + B*Y;
	int b = C*2*minN+(int)(Math.abs(X-Y))*many;
	int c = C*2*Math.max(X,Y);
	int result = Math.min(a,b);
	result = Math.min(result,c);
	System.out.println(result);
    }
}