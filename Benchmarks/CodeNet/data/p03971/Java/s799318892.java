import java.util.*;
import java.io.*;

public class Main{
    public static void main(String[] args){
	Scanner sc = new Scanner(System.in);
	//	BufferedReader reader1 = new BufferedReader(new InputStreamReader(System.in));
	//	BufferedReader reader2 = new BufferedReader(new InputStreamReader(System.in));

	int N = sc.nextInt();
	int A = sc.nextInt();
	int B = sc.nextInt();
	int sum = A+B;
	int OS = 0;
	String S = sc.next();
	    
	// String str1 = reader1.readLine();
	// String s_input1[] = str1.split("[\\s]+");
	// int N = Integer.parseInt(s_input1[0]);
	// int A = Integer.parseInt(s_input1[1]);
	// int B = Integer.parseInt(s_input1[2]);
	// int sum = A+B;
	// int OS = 0;
	// String S = reader2.readLine();

	    
	for(int i = 0; i < N; i++){
	    if(S.charAt(i) == 'a'){
		if(sum > 0){
		    System.out.println("Yes");
		    sum--; 
		}
		else
		    System.out.println("No");
	    }
	    else if(S.charAt(i) == 'b'){
		if(sum > 0 && (++OS) <= B){
		    System.out.println("Yes");
		    sum--;
		}
		else
		    System.out.println("No");		    
	    }
	    else
		System.out.println("No");
		
		    
	}
    }
}
