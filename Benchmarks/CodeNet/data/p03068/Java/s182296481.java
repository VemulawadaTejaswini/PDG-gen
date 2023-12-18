import java.util.*;
 
public class Main{
 
	public static void main(String[] args){
 
		Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        String S = sc.next();
        int K = sc.nextInt();
      
        char[] list = S.toCharArray();
        char jd = list[K-1];
      
        for(int i = 0; i < list.length; i++){
          if(list[i] != jd){
            list[i] = '*';
          }
          
          System.out.print(list[i]);
        }
          System.out.println();
   }
}