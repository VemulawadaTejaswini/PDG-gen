import java.util.Scanner;
public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        char S[] = new char[14];
        char H[] = new char[14];
        char C[] = new char[14];
        char D[] = new char[14];
        int n = sc.nextInt();
        for(int i = 1; i <= 13; i++){
        	S[i] = 1;
        	H[i] = 1;
        	C[i] = 1;
        	D[i] = 1;
        }
        
        for(int i = 0; i < n; i++){
        	String a = sc.next();
        	int b = sc.nextInt();
        	
        	if(a.equals("S")){
        		S[b] = 0;
        	}
        	else if(a.equals("H")){
        		H[b] = 0;
        	}
        	else if(a.equals("C")){
        		C[b] = 0;
        	}
        	else if(a.equals("D")){
        		D[b] = 0;
        	}
        }
        for(int i = 1; i <= 13; i++){
        	if(S[i] == 1) System.out.println("S "+ i);
        }
        for(int i = 1; i <= 13; i++){
        	if(H[i] == 1) System.out.println("H "+ i);
        }
        for(int i = 1; i <= 13; i++){
        	if(C[i] == 1) System.out.println("C "+ i);
        }
        for(int i = 1; i <= 13; i++){
        	if(D[i] == 1) System.out.println("D "+ i);
        }
    }
}
