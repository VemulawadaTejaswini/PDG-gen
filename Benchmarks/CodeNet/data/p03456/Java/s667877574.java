import java.util.*;
import java.lang.*;
import java.io.*;

/**
 *
 * @author cl18413
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        esCuadrado(1,22);
    }
    
    public static void esCuadrado(int a, int b){
        Double f=Math.sqrt(Integer.parseInt(""+a+b));
        if(f==f.intValue()){
            System.out.println("yes");            
        }else{
            System.out.println("no");
        }            
    }
    
}