import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Main {


    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);

        int a = in.nextInt();

        int b = in.nextInt();

        if(b<a) a--;

        System.out.println(a);

        in.close();
    }

}
