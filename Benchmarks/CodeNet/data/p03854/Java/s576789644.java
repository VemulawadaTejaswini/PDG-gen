import java.util.*;

public class Main{
   public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
  		String t = scanner.nextLine();
  		String t1 = t.replaceAll("eraser", "");
        String t2 = t1.replaceAll("dreamer", "");
        String t3 = t2.replaceAll("erase", "");
        String t4 = t3.replaceAll("dream", "");
     boolean flag = false;	
      if(t4.isEmpty()){
      flag = true;
      }
     
        String u1 = t.replaceAll("erase", "");
        String u2 = u1.replaceAll("dreamer", "");
        String u3 = u2.replaceAll("eraser", "");
        String u4 = u3.replaceAll("dream", "");
      if(u4.isEmpty()){
      flag = true;
      }
     if(flag == true){
     System.out.println("YES");}
     else{
     System.out.println("NO");
     }
      }
    
}