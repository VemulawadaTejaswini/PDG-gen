import java.util.*;
 
class Main {
 
    public static void main (String args[])
    {
        Scanner in = new Scanner(System.in);
       

        String compet = in.nextLine();

        if(compet.equals("ABC"))
        System.out.println("ARC");
       else if(compet.equals("ARC"))
        System.out.println("ABC");
        
        
    }
}