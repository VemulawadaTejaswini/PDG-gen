import java.util.*;
import java.io.*;
public class Main{
    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        int a = in.nextInt();
        int b = in.nextInt();
        int c = in.nextInt();
        int half = (a+b+c)/2;
        if(half*2==(a+c+b)){
            System.out.println("YES");
        }
        else{
            System.out.println("NO");
        }
    }
}