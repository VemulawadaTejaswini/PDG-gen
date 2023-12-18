import java.util.*;
import java.util.HashSet;
import java.util.Set;
public class Main{
    public static void main(String[]args){
        Scanner sc=new Scanner(System.in);
        String s=sc.next();
        int a=0;
        int z=0;
        for(int i=0;i<s.length();i++){
            if(s.charAt(i)=="A"){
                a=i;
            }
            if(s.charAt(i)=="Z"){
                z=i;
            }
        }
        System.out.println(z-a);



        }
       
        
    }
