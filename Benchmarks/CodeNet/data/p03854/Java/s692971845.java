import java.util.*;
public class Main{
	public static void main(String[] args){
      Scanner sc = new Scanner(System.in);
      String a = sc.next();
      String text = "dream,dreamer,erase,eraser";
      List<String> split = Arrays.asList(text.split(","));
        
        for(int i = 0; i < 4 ; i++ ){
          for(int j = 0; j < 4 ; j++ ){
            if(a.equals(split.get(i) + split.get(j))){
            	System.out.println("YES");
                return;
            }
          }
        } 
     System.out.println("NO");     
  }    
}