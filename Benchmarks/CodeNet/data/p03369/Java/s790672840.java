import java.util.*;
import java.io.*;
import java.lang.*;

public class Main {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        String a = sc.next();

        int o = 0;

        for (int i = 0; i<3; i++){
            if (a.charAt(i) == 'o')
                o++;
        }
        System.out.println(700+(100*o));
    }
}
