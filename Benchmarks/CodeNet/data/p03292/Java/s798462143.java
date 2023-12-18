import java.util.*;

public class Main{
    public static void main(String[] args){
	Scanner sc = new Scanner(System.in);
        int[] A = new int[3];
	A[0]=sc.nextInt();
	A[1]=sc.nextInt();
	A[2]=sc.nextInt();
	Arrays.sort(A);
	System.out.print(A[2]-A[0]);
    }
}
