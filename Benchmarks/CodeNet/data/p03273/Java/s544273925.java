import java.util.*;

public class Main{
  public static void main(String[] args){
     Scanner sc = new Scanner(System.in);
     int h = sc.nextInt();
     int w = sc.nextInt();

     String[] h_array = new String[h];

     for(int i=0; i<h; i++){
       h_array[i] = sc.next();
     }

     boolean[] h_judge = new boolean[h];
     boolean[] w_judge = new boolean[w];
     Arrays.fill(h_judge,false);
     Arrays.fill(w_judge,false);

     for(int i=0; i<h; i++){
       for(int j=0; j<w; j++){
         if(h_array[i].charAt(j)=='#'){
           h_judge[i] = true;
           w_judge[j] = true;
         }
       }
     }

     StringBuilder str = new StringBuilder();
     for(int i=0; i<h; i++){
       if(h_judge[i]){
         for(int j=0; j<w; j++){
           if(w_judge[j]){
             str.append(h_array[i].charAt(j));
           }

         }
         str.append(System.getProperty("line.separator"));
       }
     }

     System.out.println(str);



  }
}