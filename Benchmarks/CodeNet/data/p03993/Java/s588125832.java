import java.util.*;
public class Main {
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
        int A[] = new int[N];
        for(int i = 0; i < N; i++){
        	A[i] = sc.nextInt();
        }
        int count = 0;
        for(int i = 0; i < N; i++){
        	if(i + 1 == A[A[i]-1]){
            	count += 1;
            }
        }
        System.out.println(count / 2);
     }
}