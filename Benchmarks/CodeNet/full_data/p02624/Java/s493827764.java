import java.util.Scanner;
public class Main{
 public static void main(String[] args){
  	Scanner s = new Scanner(System.in);
   	int n = s.nextInt();
   	int result[];
   	int count = 0;
   	for(int i=1;i<=n;i++){
      int j = i;
      while(j-- > 0){
       	if((j/j)==0) 
    		count++;
      }
   }
   System.out.println(count);
 }
}
