import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.math.*;

public class Main {

    public static void main(String[] args) {
       
        Scanner sc = new Scanner(System.in);
        
       List<Integer> list1 = new ArrayList<>();
       List<String>  list2 = new ArrayList<String>();
       List<Integer> list3 = new ArrayList<>();
       
       int count = 0;
       
      while(true){
         
          list1.add(sc.nextInt());
          list2.add(sc.next()); 
          list3.add(sc.nextInt());
          
          if("?".equals(list2.get(count))){
             break;
          }
          
          count++;
          
      }
        
       for(int i=0; i<list1.size(); i++){
           if("+".equals(list2.get(i))){
               System.out.println(list1.get(i)+list3.get(i));
           }else if("-".equals(list2.get(i))){
               System.out.println(list1.get(i)-list3.get(i));
           }else if("*".equals(list2.get(i))){
               System.out.println(list1.get(i)*list3.get(i));
           }else if("/".equals(list2.get(i))){
               System.out.println(list1.get(i)/list3.get(i));
           }else{
               break;
           }
           
       }
    }
}
