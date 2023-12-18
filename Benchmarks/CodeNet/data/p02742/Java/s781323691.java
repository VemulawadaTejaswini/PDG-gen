import java.util.*;
import java.io.*;
class Main{
    public static void main(String [] arghs){
        Scanner sc=new Scanner(System.in);
        long h=sc.nextLong();
        long w=sc.nextLong();

        long t=((h*w)+1)/2;
        System.out.println(t);
    }
}