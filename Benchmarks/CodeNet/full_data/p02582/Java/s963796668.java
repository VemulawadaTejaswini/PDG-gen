import java.util.*;
public class Main {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
 
        String a = sc.next();
        String b = sc.next();
        String c = sc.next();
 
		int n;
        n=0;
        
        if(a.equals("R")){
        	n=1;
            if(b.equals("R")){
            	n=2;
                if(c.equals("R")){
                	n=3;
                }
            }
        }else{
        if(b.equals("R")){
        	n=1;
            if(c.equals("R")){
            	n=2;
            }
        }
		}
        if(a.equals("S")&&b.equals("S")&&c.equals("R")){
        	n=1;
        }
 
// 出力
        System.out.println(n);
    }
}