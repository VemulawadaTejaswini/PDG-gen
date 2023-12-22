
//import java.lang.Math;
import java.util.*;
//import java.util.ListIterator;
//import java.util.Iterator;
//import java.util.LinkedList;
 
 
class Main{
     
    public static void main(String[] arg){
         
     
 
     
        Scanner sc= new Scanner(System.in);
        List<Integer> list =new ArrayList<Integer>();
        int[] s=new int[3];
        for(int i=0;i<3;i++){
            s[i]=sc.nextInt();
            list.add(new Integer(s[i]));
        }
         
                int a=Collections.min(list);
               
        int b=Collections.max(list);
         
        System.out.println(a+" "+b);
         
}
        }
