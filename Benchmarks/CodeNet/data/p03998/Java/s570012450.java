import java.util.*;
import java.io.*;

public class Main{
    
    

     public static void main(String []args){
       Scanner scanner = new Scanner(System.in);
       String a = scanner.next();
       String b = scanner.next();
       String c = scanner.next();
       List<Character> list1 = new ArrayList<>();
       List<Character> list2= new ArrayList<>();
       List<Character> list3 = new ArrayList<>();
       
       int current =1;
       
       for(int i=0;i<a.length();i++)
       list1.add(a.charAt(i));
       
       for(int i=0;i<b.length();i++)
       list2.add(b.charAt(i));
       
       for(int i=0;i<c.length();i++)
       list3.add(c.charAt(i));
      
       outerloop:
       while(list1.size()!=0 || list2.size()!=0 || list3.size()!=0 )
       {
           
           System.out.println("A___"+list1.toString());
           System.out.println("B___"+list2.toString());
           System.out.println("C___"+list3.toString());
           
          System.out.println(" ");
          System.out.println(" ");
         
          if(current==1)
          {
              
              while(list1.size()!=0 &&list1.get(0)=='a' )
              {
                
                  list1.remove(0);
              }
              if(list1.size()!=0 && list1.get(0)=='b' )
              current =2;
               if( list1.size()!=0 && list1.get(0)=='c')
               current =3;
               
               if(list1.size()!=0)
              list1.remove(0);
              else break outerloop;
              
          }
          
          else if(current==2)
          {
              while(list2.size()!=0 && list2.get(0)=='b')
              {
                  list2.remove(0);
              }
              if(list2.size()!=0 && list2.get(0)=='a' )
              current =1;
               if(list2.size()!=0 && list2.get(0)=='c')
               current =3;
               
                if(list2.size()!=0)
                  list2.remove(0);
                else break outerloop;
              
          }
          
          else if(current==3)
          {
              while(list3.size()!=0 && list3.get(0)=='c' )
              {
                  list3.remove(0);
              }
              if(list3.size()!=0 &&list3.get(0)=='a')
              current =1;
               if(list3.size()!=0 && list3.get(0)=='b' )
               current =2;
               
                if(list3.size()!=0)
                  list3.remove(0);
                else break outerloop;
              
          }
       }
       
       if(list1.size()==0)
       System.out.println("A");
       else if(list2.size()==0)
       System.out.println("B");
       else if(list3.size()==0)
       System.out.println("C");
       
       
     }
}