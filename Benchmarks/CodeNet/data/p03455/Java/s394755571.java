import java.io.*;
import java.util.*;

public class Main{
    public static void main (int args[]){
         EasyMod(args[0],args[1]);
    }
    
    static void EasyMod(int a, int b){
        if ((a*b) % 2 == 0)
            System.out.println("Even");
        else 
            System.out.println("Odd");
    }
}
