import java.util.*;
class Main{
  
	public static void main(String[] args){
      Scanner sc = new Scanner(System.in);
      int a = 10;
      int b = 4;
      int an = a/b;
      if(a%b != 0) an+=1;
      
      System.out.println(an);
	}
 
}