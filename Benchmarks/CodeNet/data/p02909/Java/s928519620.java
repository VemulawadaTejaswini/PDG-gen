import java.util.Scanner;

public class Main {
static Scanner reader =new Scanner (System.in);
  
    public static void main(String[] args) {
        String arr[]={"Sunny","Cloudy","Rainy" };
         String s=reader.nextLine();
         for(int i=0;i<3;i++)
         {
             if(s.equals(arr[i]))
             {
                 System.out.println(arr[i+1]);
                 break;
             }
         }
    }
    
}
