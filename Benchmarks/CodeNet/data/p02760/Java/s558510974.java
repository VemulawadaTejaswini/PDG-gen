import java.util.ArrayList;
import java.util.*;
import java.lang.*;
//import java.lang.*;
import java.util.regex.*;
public class CodeChef{
     public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
     List<Integer> l=new ArrayList<>();
     List<Integer> search=new ArrayList<>();
     for(int i=0;i<3;i++){
         for(int j=0;j<3;j++)
            l.add(sc.nextInt());
     }
     Collections.sort(l);
   int n=sc.nextInt();
   for(int i=0;i<n;i++)
      search.add(sc.nextInt());
   
   Collections.sort(search);
   
   for(int i=0;i<search.size();i++){
         if(search.contains(l.get(i))){
            System.out.println("Yes");
            System.exit(0);
         }else continue;
   }  
   System.out.println("NO");
   System.exit(0);
   }
}  