import java.util.*;
import java.util.ArrayList;

public class Main{

	public static void main(String[] args){

		Scanner sc = new Scanner(System.in);
        int s = sc.nextInt();
        int ans = 0;
        
        ArrayList<Integer> list = new ArrayList<>();
        list.add(s);
        int n = 0;
       
        while(true){
          n++;
          int next;
          if(s % 2 == 0){
            next = s / 2 ;
          }else{
            next = 3*s + 1;
          }
          
           list.add(n,next);
           s = next;
           
          
         for(int i = 0 ; i < list.size()-1; i++){
           if(list.get(i)==list.get(n)){
             ans = n;
             System.out.println(ans+1);
             return;
           }else{
             continue;
           }
         }
        }
      
       
	}
}