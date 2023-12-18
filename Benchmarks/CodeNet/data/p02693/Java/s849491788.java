
import java.util.*;
import java.io.*;

import static java.lang.Character.isUpperCase;

public class Main {

    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);

        int K  =  in.nextInt();
        int A  =  in.nextInt();
        int B  =  in.nextInt();

        if((B-A)%K == 0)
        {
            System.out.println("OK");
        }
        else
            {
                System.out.println("NG");
            }
    }




    }



