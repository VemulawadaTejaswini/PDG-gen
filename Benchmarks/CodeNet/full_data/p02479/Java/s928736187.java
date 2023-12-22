import java.util.*;
import java.lang.*;
import java.io.*;

class Circle{
    public static void main(String[] args) throws IOException{
        Scanner r = new Scanner(System.in);
        double rd = r.nextDouble();
        System.out.println(Math.PI*rd*rd +" " +Math.PI*rd*2);
    }
}