import java.util.*;

class Main{
public static void main(String args[]) {
	Scanner sc = new Scanner(System.in);
	int a = sc.nextInt();
  	int b = sc.nextInt();
	int sum = 0;
  	
  	if (a > b){
    sum += a;
    a--;
    }else{
    sum += b;
    b--;
    }
  	if (a > b){
    sum += a;
    a--;
    }else{
    sum += b;
    b--;
    }
  
  	System.out.println(sum);
  
  	
}
}