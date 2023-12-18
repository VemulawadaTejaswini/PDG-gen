import java.util.*;

public class Main{

	public static void main(String[] args){
      
      Scanner scan = new Scanner(System.in);
      String Input = scan.next();
      String[] lists = Input.split("");
      
      
      
      ArrayList<String> Array = new ArrayList<String>();  
      
     
      
      
      for (int i=0; i<lists.length; i++){
        if(lists[i].equals("B") && Array.size()>0 ){
          try{
          if(lists[i+1].equals("B")){
            System.out.print("pass");  
          }
          else{
            Array.add(lists[i]);
          }
          }catch (ArrayIndexOutOfBoundsException e){
            Array.add(lists[i]);
          }
        }
        else{
          //System.out.println(lists[i]);
          Array.add(lists[i]);
        }
      }
     System.out.println(Array);
     
      
      
     for (int j=0; j<Array.size(); j++){
      try{
       if (Array.get(j).equals("B")){
       }
       else if(j>0 && Array.get(j+1).equals("B")){
       }
       else{
         System.out.print(Array.get(j));
       }
      }catch (IndexOutOfBoundsException e){
        System.out.print(Array.get(j));
      }
       
    }
}
}