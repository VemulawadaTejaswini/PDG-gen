import java.util.*;
public class Main {
     public static void main(String [] args){
      Scanner input = new Scanner(System.in);
       
      int a = input.nextInt();
      int b = input.nextInt();
      int c = input.nextInt();
    
      int arr[] = {5, 7, 5};
      
      if(arr[0]==a && arr[1]==b && arr[2]==c)
          System.out.println("YES");
      else if(arr[0]==a && arr[1]==c && arr[2]==b)
          System.out.println("YES");
      else if(arr[0]==b && arr[1]==a && arr[2]==c)
          System.out.println("YES");
      else
          System.out.println("NO");
     
     }
}
