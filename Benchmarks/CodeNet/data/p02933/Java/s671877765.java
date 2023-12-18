import java.io.*;
import java.lang.*;
import java.util.*;

class Main {
   
    public static void main(String[] args) {
        
        Scanner input = new Scanner(System.in);
        int a = input.nextInt();
        String s = input.nextLine();
        if(a >= 3200)
        {
            System.out.println(s);
        }
        else
        {
            System.out.println("red");
        }
        
    }
    
}
