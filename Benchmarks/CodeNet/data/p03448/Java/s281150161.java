import java.util.*;

public class Main{
	public static void main(String[] args){
      
      Scanner sc = new Scanner(System.in);
      
      int a = sc.nextInt();
      int b = sc.nextInt();
      int c = sc.nextInt();
      int x = sc.nextInt();
      
      int res=0;
      
      for(h < 0; h<=a ; h++ ){
      	for(i < 0; i<=b; i++){
        	int j = (x-500*h-100*i)/50;
        	if(j >= 0 ; j <= c)
        	  res++;
      	}
      }
    System.out.println(res);
    }
}