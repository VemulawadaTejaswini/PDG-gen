import java.util.*;
public class Main{
	public static void main(String[] args){
    	Scanner sc = new Scanner(System.in);
      int[] array = new int[5];
      int[] mod = new int[5];
      int re = 0;
		for(int i = 0;i < 5;i++){
          array[i] = sc.nextInt();
          mod[i] = array[i]%10;
          if(mod[i] == 0){
            	mod[i] = 10;
          }
          re = re + array[i] + 10 - mod[i];
        }
      
      int x = 11;
      for(int i = 0;i < 5;i++){
      	x = Math.min(x,mod[i]);
      }
      System.out.println(re-10+x);
    }
}