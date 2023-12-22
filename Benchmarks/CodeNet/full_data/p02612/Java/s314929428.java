//'main' method must be in a class 'Rextester'.
//openjdk version '11.0.5' 

import java.util.*;
import java.lang.*;

class Rextester
{  
    public static void main(String args[])
    {
        Scanner s = new Scanner(System.in);
        System.out.println(1000-s.nextInt()%1000);
    }
}