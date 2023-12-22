import java.util.Scanner;
public class Main{
 public static void main(String[] args){
  	Scanner s = new Scanner(System.in);
   	int n = s.nextInt();
   	int result = 0;
   	
   	for(int i=1;i<=n;i++){
      int j = i;
      int count = 0;
      while(j-- > 0){
       	if(i/j==0) 
    		count++;
      }
      result = result +(i*count);
   }
   System.out.println(result);
 }
}
