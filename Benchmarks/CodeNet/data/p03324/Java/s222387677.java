import java.util.Scanner;
 
class Main{
	public static void main(String[] args){
    	Scanner sc = new Scanner(System.in);
      	int D = sc.nextInt();
      	int N = sc.nextInt();
      	sc.close();
      	if(N != 100){
        	System.out.println(pow(100,D)*N);
        }
    }
}