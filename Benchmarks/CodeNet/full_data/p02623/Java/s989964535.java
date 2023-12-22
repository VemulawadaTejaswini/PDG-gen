import java.util.*;
import java.util.ArrayList;

class Main {
    public static void main(String[] args) {
      Scanner sc = new Scanner(System.in);
      int an = sc.nextInt();
      int bn = sc.nextInt();
      int time = sc.nextInt();
      int counter =0;
      List<Integer> Lista = new ArrayList<Integer>();
      List<Integer> Listb = new ArrayList<Integer>();
      for(int i =0; i <an; i++){
      	int t = sc.nextInt();
        Lista.add(t);
      }
      for(int i =0;i<bn;i++){
        int t = sc.nextInt();
      	Listb.add(t);
      }
      while(time >0){
        int aa ;
        int bb ;
        if(Lista.size() == 0 ){
     		aa =0;
        }else{
        	aa =Lista.get(0);
        }
        if(Listb.size() == 0){
        	bb =0;
        }else{
        	bb = Listb.get(0);
        }
        
         if( aa == bb && aa == 0){
           break;
         }else if(aa == 0){
         	time -=bb;
           counter++;
           Listb.remove(0);
         }else if(bb == 0){
           time -= aa;
           counter++;
           Listb.remove(0);
         }else if(aa < bb){
         	time -=aa; 
             counter++;
             Lista.remove(0);
        }else{
            time -=bb;
            counter++;
            Listb.remove(0);
         }
      
      }
  
      if(Lista.size() == 0 && Listb.size() == 0){
      System.out.println(counter);
      }else{
      System.out.println(counter-1);
      }
    }
}