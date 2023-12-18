import java.util.*;
import java.util.ArrayList;
public class Main{
    public static void main(String[]args){  
    Scanner sc=new Scanner(System.in);
    String O=sc.next();
    String E=sc.next();
    char[]OO=O.toCharArray();
    char[]EE=E.toCharArray();
    for(int i=0;i<O.length();i++){
            System.out.print(OO[i]);
            if((i==O.length()-1)&&(O.length()>E.length())){
                break;
            }
        
    
    
        System.out.print(EE[i]);
    }
    
    
    }
}