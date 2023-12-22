import java.util.*;
public class Main {
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
      	String s = sc.next();
     
      	String str[] = new String[3];
          str[0] = s.substring(0,1);
      		str[1] = s.substring(1,2);
      str[2] = s.substring(2,3);
          
      int min = 0;
      int c = 0;
      for(int i=0;i<3;i++){
        if("R".equals(str[i])){
          c++;
        }else{
          if(c>min) {
            min = c;
            c = 0;
          }
        }
      }
        
        if(c> min) min = c;
        System.out.println(min);
      
      }
}

