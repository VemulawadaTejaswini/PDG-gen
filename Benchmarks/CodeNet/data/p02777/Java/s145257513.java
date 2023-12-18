import java.util.Scanner;
class Main{
	public static void main(String args[]){
    	Scanner sc = new Scanner(System.in);
      	String S = sc.next();
      	String T = sc.nextLine();
      	int A = sc.nextInt();
      	int B = sc.nextInt();
      	String U = sc.next();
      
      	if(U.equals(S)){
        	A--;
        }
      	if(U.equals(T)){
        	B--;
        }
      	System.out.print(A + " " + B);
    }
}