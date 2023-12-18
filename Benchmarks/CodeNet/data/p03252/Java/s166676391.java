import java.util.*;
class Main {
  public static void main (String[] args)  {
    
    Scanner sc = new Scanner(System.in);
    
    String S=sc.next();
    String T=sc.next();
    
    long len = S.length();
    
    LinkedList <Character> slist = new LinkedList<>();
    LinkedList <Character> tlist = new LinkedList<>();
    
    for(int i=0;i<len;i++){
      slist.add(S.charAt(i));
      tlist.add(T.charAt(i));
     }
     
     int tv=0;
     int sv=0;
     
     while(slist.size()>1){
       
       tv=tlist.pop();
       sv=slist.pop();
       
       for(int i=0;i<slist.size(); i++){
         
         if(tlist.get(i)==tv){
           if(slist.get(i)!=sv){
              System.out.println("No");
              System.exit(0);
            }else{
              tlist.remove(i);
              slist.remove(i);
              if(i==1)break;
              i--;
              }
          }
          }
        }
        
       System.out.println("Yes");
       
  }
}
