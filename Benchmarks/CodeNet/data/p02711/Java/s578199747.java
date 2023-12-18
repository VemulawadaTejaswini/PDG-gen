import java.util.Scanner;

public class Main {
	public static void main(String[] args){
    	Scanner sc = new Scanner(System.in);
    	int N = sc.nextInt();
      	boolean res = false;
      	while(N>0){
          	int x = N%10;
          	if(x==7){
            	res = true;
              	break;
            }
          	N/=10;
        }
      	if(res) System.out.print("Yes");
      	else System.out.print("No");
    }
}