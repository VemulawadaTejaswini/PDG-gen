import java.util.*;
import java.util.Arrays;
import java.util.ArrayList;
import java.util.Set;
import java.util.HashSet;
import java.util.Collections;


public class Main{
   
   

    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        String S=sc.next();
        int a=Integer.parseInt(""+S.charAt(0));
        int b=Integer.parseInt(""+S.charAt(1));
        int c=Integer.parseInt(""+S.charAt(2));
        int d=Integer.parseInt(""+S.charAt(3));
        if(a+b+c+d==7){
            System.out.println(a+"+"+b+"+"+c+"+"+d+"=7");
        }
        else if(a+b-c+d==7){
            System.out.println(a+"+"+b+"-"+c+"+"+d+"=7");
        }
        else if(a+b+c-d==7){
            System.out.println(a+"+"+b+"+"+c+"-"+d+"=7");
        } 
        else if(a+b-c-d==7){
            System.out.println(a+"+"+b+"-"+c+"-"+d+"=7");
        }
        else if(a-b+c+d==7){
            System.out.println(a+"-"+b+"+"+c+"+"+d+"=7");
        }
        else if(a-b-c+d==7){
            System.out.println(a+"-"+b+"-"+c+"+"+d+"=7");
        }
        else if(a-b+c-d==7){
            System.out.println(a+"-"+b+"+"+c+"-"+d+"=7");
        }
        else if(a-b-c-d==7){
            System.out.println(a+"-"+b+"-"+c+"-"+d+"=7");
        }

        

        
        

    }

        
        
    }
