import java.util.*;

class Main{
	public static void main(String[] args){
    	Scanner sc = new Scanner(System.in);
      	int a = sc.nextInt();
      	int b = sc.nextInt();
      	int c = sc.nextInt();
      	int d = sc.nextInt();
      	while(a < 1){
        	c -= b;
          	if(c<1)
              break;
          	a -= d;
        }
      	System.out.println(a > c ? "Yes" : "No");
    }
}
