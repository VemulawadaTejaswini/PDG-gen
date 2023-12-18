import java.util.*;

public class Main {
    public static void main(String[] args) {
        // Your code here!
        Scanner sc = new Scanner(System.in);
        String s = sc.next();
        
        String strf = s.substring(0,2);
        String strb = s.substring(2); 
        
        int sf = Integer.parseInt(strf);
        int sb = Integer.parseInt(strb);
        
        if(sf > 12 && sb >12 || sf <= 0 || sb <= 0){
            System.out.println("NA"); 
        }else if(sf < 13 && sb < 13){
            System.out.println("AMBIGUOUS");
        }else if(sf < 13 && sb > 12){
            System.out.println("MMYY");
        }else if(sf > 12 && sb < 13){
            System.out.println("YYMM");    
        }
        
       
    }
}