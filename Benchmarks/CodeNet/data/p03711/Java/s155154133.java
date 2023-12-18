import java.util.*;
public class Main {
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		int x = sc.nextInt();
		int y = sc.nextInt();
		
		int A[] = {1, 3, 5, 7, 8, 10, 12};
		int B[] = {4, 6, 9, 11};
		int C[] = {2};
        
        for(int i = 0; i < 7; ++i){
            if(A[i] == x){
                if(A[i] == y){
                System.out.println("Yes");    
                }
                 System.out.println("No");
            }
        }
        for(int i = 0; i < 4; ++i){
            if(B[i] == x){
                if(B[i] == y){
                System.out.println("Yes");    
                }
                 System.out.println("No");
            }
        }
        for(int i = 0; i < 1; ++i){
            if(C[i] == x){
                if(C[i] == y){
                System.out.println("Yes");    
                }
                 System.out.println("No");
            }
        }
	}
}
        
        