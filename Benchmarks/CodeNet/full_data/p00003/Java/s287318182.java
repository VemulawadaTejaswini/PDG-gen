import java.util.*;
/*
Main class for AOJ where there is no input.
*/
public class Main{
   public static void main(String[] args){
      Scanner sc = new Scanner(System.in);
      int n = Integer.parseInt(sc.nextLine());
      String str;
      String[] arr;
      int side[] = new int[3];
      
    
      
      
      for(int i = 0; i < n; i ++){
         str = sc.nextLine();
         arr = str.split(" ");
         side[0] = Integer.parseInt(arr[0]);
         side[1] = Integer.parseInt(arr[1]);
         side[2] = Integer.parseInt(arr[2]);
         
         Arrays.sort(side);
         
         if(Math.pow((int)side[2],2) == Math.pow(side[0],2) + Math.pow(side[1],2)){
            System.out.println("YES");
         }else{
            System.out.println("No");
         }
       
      
      }
   }//main
}//class