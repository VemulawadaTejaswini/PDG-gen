import java.io.*;
import java.util.*;

class Main{
    public static void main(String[] args){
    Scanner scan = new Scanner(System.in);

    int S = scan.nextInt();

    int m = S % 60;
    int s = S % 3600;
    int h = S / 3600:

    System.out.println(h + ":" + s + ":" + m);
    }
}