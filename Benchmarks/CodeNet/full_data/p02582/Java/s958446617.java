import java.util.*;
public class Main {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
 
        String a = sc.next();
        String b = sc.next();
        String c = sc.next();
 
		int n;
        n=0;
        
        if(a.equals("S")&&b.equals("S")&&c.equals("S")){
        	n=0;
        }
      
        if(a.equals("S")&&b.equals("S")&&c.equals("R")){
        	n=1;
        }
      
        if(a.equals("S")&&b.equals("R")&&c.equals("S")){
        	n=1;
        }        
      
        if(a.equals("R")&&b.equals("S")&&c.equals("S")){
        	n=1;
        }
      
        if(a.equals("R")&&b.equals("R")&&c.equals("S")){
        	n=2;
        }
      
        if(a.equals("S")&&b.equals("R")&&c.equals("R")){
        	n=2;
        }
 
        if(a.equals("R")&&b.equals("R")&&c.equals("R")){
        	n=3;
        }
      
        if(a.equals("R")&&b.equals("S")&&c.equals("R")){
        	n=1;
        }
      

// 出力
        System.out.println(n);
    }
}
