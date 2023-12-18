import java.io.*;
import java.util.*;

public class Main{
    public static void main(String[] args)throws Exception{
        Scanner sc=new Scanner(System.in);
        int x=sc.nextInt();
        sc.close();
        System.out.println((x/100>=(x%100)/5+((x%100%5!=0)?1:0))?1:0);
    }
}