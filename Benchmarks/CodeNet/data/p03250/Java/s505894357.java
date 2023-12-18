import java.util.*;
class MaxFormula{
    public static void main(String[] args){
	Scanner stdIn=new Scanner(System.in);
	int A = stdIn.nextInt();
	int B = stdIn.nextInt();
	int C = stdIn.nextInt();
        int max=Math.max(A,Math.max(B,C));
	int o =A+B+C-max;
	System.out.println(max*10+o);
    }
}
