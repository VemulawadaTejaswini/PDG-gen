import java.util.Scanner;
import java.util.ArrayList;

public class Main{

   ArrayList<int[]> kangs = new ArrayList<int[]>();
   
   public void addKang(int pos, int steps){
      int[] newKang = {pos, steps};
      kangs.add(newKang);
   }
   
   public void clean(){
      for(int i = 0; i < kangs.size() ; i++){
         for(int j = i + 1; j < kangs.size(); j++){
            if(kangs.get(i)[0] == kangs.get(j)[0]){
               if(kangs.get(i)[1] <= kangs.get(j)[1]){
                  kangs.remove(j);
               } else if(kangs.get(i)[1] > kangs.get(j)[1]){
                  kangs.remove(i);
                  kangs.add(i, kangs.get(j-1));
                  kangs.remove(j);
               }
            }
         }
      }
      
      for(int r = kangs.size() - 1; r >= 0 ; r--){
         if(kangs.get(r)[0] < 0){
            kangs.remove(r);
         }
      }
            
   }
   
   public void branch(int step){
   
      ArrayList<int[]> replace = new ArrayList<int[]>();
      
      for(int i = 0; i < kangs.size(); i++){
         int[] currKang = kangs.get(i);
         
         int[] a1 = {currKang[0] + step, currKang[1] + 1};
         int[] a2 = {currKang[0] - step, currKang[1] + 1};
         int[] a3 = {currKang[0], currKang[1] + 1};
         
         replace.add(a1);
         replace.add(a2);
         replace.add(a3);   
      }
      
      kangs = replace;
   }
   
   public boolean hasFinished(int target){
      for(int i = 0; i < kangs.size(); i++){
         if(target == kangs.get(i)[0]){
            return true;
         }
      }
      
      return false;
   }
   
   public void finalClean(int target){
      for(int i = kangs.size() - 1; i >= 0 ; i--){
         if(kangs.get(i)[0] != target){
            kangs.remove(i);
         }
      }
   }            
      
    
   public static void main(String[] args){
      
      Scanner reader = new Scanner(System.in); 
      int home = reader.nextInt();
      //System.out.println(home);
      int step = 1;
      
      //int test = 0;
      
      KangHome aussie = new KangHome();
      aussie.addKang(0,0);
             
      while(!aussie.hasFinished(home) /*&& test < 30*/){
         aussie.branch(step);
         aussie.clean();
         step++;
      }
      
      aussie.finalClean(home);
      int smallest = aussie.kangs.get(0)[1];
      
      for(int i = 0; i < aussie.kangs.size(); i++){
         if(aussie.kangs.get(i)[1] < smallest){
            smallest = aussie.kangs.get(i)[1];
         }
      }
      
      System.out.println(smallest);
   }
}
         
         
         
      
   
      
      
      
    