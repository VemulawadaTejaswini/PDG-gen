import java.util.Scanner;

class Main {
	public static void main(String[] args){
    	Scanner sc = new Scanner(System.in);
      	int A = sc.nextInt();
      	int B = sc.nextInt();
        int C = sc.nextInt();
        int count = 0;
      	if(A == B){
          count++;
        }else if(B == C){
          count++;
        }else if(C == A){
          count++;
        }
      	if(count == 1){
          System.out.println("かわいそう");
        }
        
    }
}