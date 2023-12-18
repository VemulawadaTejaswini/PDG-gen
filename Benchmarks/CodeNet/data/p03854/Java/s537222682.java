import java.io.*;
import java.util.*;

class Main{
	public static void main(String[] args){
    	Scanner in = new Scanner(System.in);
      	String s = in.next();
     	if(s.contains("dreamer")){
          	
        	if(s.contains("dreamerase")||s.contains("dreameraser")){
            	s = s.replace("dreamerase","");
              	s = s.replace("dreameraser","");
            }
          	else s = s.replace("dreamer","");
        }
      	s = s.replace("dream","");
      	s = s.replace("eraser","");
      	s = s.replace("erase","");
      
      	if(s.isEmpty())
       	System.out.println("YES");
      	else System.out.println("NO");
    }
}