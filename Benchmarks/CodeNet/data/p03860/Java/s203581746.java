import java.util.*;

public class Main
{
    public static void main(String[] args)
    {
        Scanner input = new Scanner(System.in);
        String x = input.nextLine();
        String Splitt[] = x.split(" ");    
        for(String word : Splitt){
        System.out.print(word.charAt(0));
        	      
         }                 
    }
}