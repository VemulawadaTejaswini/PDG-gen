import java.util.*;
import java.lang.Math;

public class Main {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    
   	int a = sc.nextInt();
    int count = 0;
    int count2 = 0;
    
    if(a == 1) count--;
    if(a == 2) count -= 2;
    
    while(count2 < 2){
      	count++;
      	if(a == 4) count2++;
		if(a % 2 == 0) a /= 2;
      	else a = a*3+1;     	
    }
    
    System.out.println(count);

  }
}
