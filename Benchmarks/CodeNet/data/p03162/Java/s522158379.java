
import static java.lang.Math.abs;
import static java.lang.System.exit;
import java.math.BigInteger;
import java.util.*;
import java.util.LinkedList;
import java.io.*;

public class Main {

    static Long result;
    static Long[][] posibilities;
    static LinkedList<String> list = new LinkedList();
    static Long happiness;

    public static Long NS(int[] a, int[] b, int[] c, int n, int i, int happiness) {
        //System.out.println("1");  
        //System.out.println(n);
        if (i == n) {
            //System.out.println("sali");
            return Long.valueOf(0);
            
            
        } else {
            //System.out.println(n);
            if (posibilities[i][happiness] == null) {
                if (list.isEmpty() == false) {
                    //System.out.println("Hola");
                    String last = list.peekLast();
               
                        if (last == "A") {
                            Long temB = b[i] + NS(a, b, c, n, i + 1, happiness + b[i]);
                            Long temC = c[i] + NS(a, b, c, n, i + 1, happiness + c[i]);
                            if (temB> temC){
                           
                            result = temB;
                            list.add("B");
                            
                            
                        }
                            else{
                              result = temC;
                              list.add("C");
                            }
                            
                             
                            
                            
                            

                        } else if (last == "B") {
                            Long temA = b[i] + NS(a, b, c, n, i + 1, happiness + b[i]);
                            Long temC = c[i] + NS(a, b, c, n, i + 1, happiness + c[i]);
                            if (temA> temC){
                            result = temA;
                            list.add("A");
                            
                        }
                            else{
                              result = temC;
                              list.add("C");
                            }
                             

                        } else if (last == "C") {
                            Long temA = a[i] + NS(a, b, c, n, i + 1, happiness + a[i]);
                            Long temB = b[i] + NS(a, b, c, n, i + 1, happiness + b[i]);
                            if (temA> temB){
                            result = temA;
                            list.add("A");
                            
                        }
                            else{
                              result = temB;
                              list.add("B");
                            }

                        }
                        posibilities[i][happiness]=result;
                        //System.out.println(list.toString());
                        return result;
                    
                } else {
                   // System.out.println(i);
                    Long temA = a[i] + NS(a, b, c, n, i + 1, happiness + a[i]);
                    Long temB = b[i] + NS(a, b, c, n, i + 1, happiness + b[i]);
                    Long temC = c[i] + NS(a, b, c, n, i + 1, happiness + c[i]);
                    Long num = Math.max(temA, temB);
                    result = Math.max(num, temC);
                    if (result== temA){
                        list.add("A");
                    }
                    else if (result == temB){
                        list.add("B");
                    }
                    else if (result == temC){
                        list.add("C");
                    }
                    
                    return result;

                }
            } else {
                return posibilities[i][happiness];
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

        int max = 10000;
        for (int i = 0; i < n; i++) {
            //System.out.println(i);
            a[i] = scan.nextInt();
            b[i] = scan.nextInt();
            c[i] = scan.nextInt();
            
        }

        posibilities = new Long[n][max];
        result=NS(a,b,c,n,0,0);

        System.out.print(result);

    }

}
