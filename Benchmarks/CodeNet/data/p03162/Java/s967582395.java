
import static java.lang.Math.abs;
import static java.lang.System.exit;
import java.math.BigInteger;
import java.util.*;
import java.util.LinkedList;
import java.io.*;

public class Main {

    static Long result;
    static Long[][] posibilities;
 
    static int last=0;
    static Long happiness;

    public static Long NS(int[] a, int[] b, int[] c, int n, int i, int happiness, int last) {
        //System.out.println("1");  
        //System.out.println(n);
        
        
        if (i == n) {
            //System.out.println("sali");
            return Long.valueOf(0);
            
            
        } else {
            //System.out.println(n);
            if (posibilities[i][last] == null) {
                                  
               
                        if (last == 1) {
                            Long temB = b[i] + NS(a, b, c, n, i + 1, happiness + b[i],2);
                            Long temC = c[i] + NS(a, b, c, n, i + 1, happiness + c[i],3);
                            if (temB> temC){
                           
                            result = temB;
                            //n_last=2;
                            
                            
                        }
                            else{
                              result = temC;
                              //n_last=3;
                            }
                    

                        } else if (last == 2) {
                            Long temA = b[i] + NS(a, b, c, n, i + 1, happiness + b[i],1);
                            Long temC = c[i] + NS(a, b, c, n, i + 1, happiness + c[i],3);
                            if (temA> temC){
                            result = temA;
                            //n_last=1;
                            
                        }
                            else{
                              result = temC;
                             // n_last=2;
                            }
                             

                        } else if (last == 3 ) {
                            Long temA = a[i] + NS(a, b, c, n, i + 1, happiness + a[i],1);
                            Long temB = b[i] + NS(a, b, c, n, i + 1, happiness + b[i],2);
                            if (temA> temB){
                            result = temA;
                           // n_last=1;
                            
                        }
                            else{
                              result = temB;
                              //n_last=2;
                            }

                        }
                        posibilities[i][last]=result;
                        //last= n_last;
                        //System.out.println(list.toString());
                        return result;
                    
              
            } else {
               // System.out.println("hello");
                return posibilities[i][last];
            }
            
            //System.out.println("hola");
        }
        
        

    }

    public static void main(String args[]) {

        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();

        int[] a = new int[n];
        int[] b = new int[n];
        int[] c = new int[n];

        //int max = 4;
        for (int i = 0; i < n; i++) {
            //System.out.println(i);
            a[i] = scan.nextInt();
            b[i] = scan.nextInt();
            c[i] = scan.nextInt();
            //max+=a[i]+b[i]+c[i];
            
        }

        posibilities = new Long[n][4];
        Long r1=NS(a,b,c,n,0,0,1);
        Long r2=NS(a,b,c,n,0,0,2);
        Long r3=NS(a,b,c,n,0,0,3);
        Long max1= Math.max(r1,r2);
        Long r= Math.max(max1, r3);
        result= r;
        

        System.out.print(result);

    }

}
