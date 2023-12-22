import java.util.*;
import java.io.*;
public class Main {
    static Scanner sc = new Scanner(System.in);
    static InputStreamReader reader = new InputStreamReader(System.in);
    static int n, a, b, c;//prepare "number" and "Edge".
    static int A,B,C;
    public static void main(String[] args) {
	
	read();
	
    }
    
    static boolean read(){
	//	System.out.println("Input the nummber.");
	    n = sc.nextInt();//read "number".
	    int i;
	    for(i = 0; i < n; i++){
		a = sc.nextInt();//read "edge".
		b = sc.nextInt();//read "edge".
		c = sc.nextInt();//read "edge".

		if(a == 0 || b == 0 || c == 0){
		    System.out.println("NO");
		}//end of if

		
		if(a != 0 && b != 0 && c!= 0){
		    A = a * a;//calculate the power of edge of A.
		    B = b * b;//calculate the power of edge of B.
		    C = c * c;//calculate the power of edge of C.
		    if(A == B + C){//compare
			System.out.println("YES");//output
		    }else if(B == A + C){//compare
			System.out.println("YES");//output
		    }else if(C == A + B){//compare
			System.out.println("YES");//output
		    }else{
			System.out.println("NO");
		    }
		}//end of if		    
	    }//end of for
	    return true;
    }//brock of read()
}//brock of Main()