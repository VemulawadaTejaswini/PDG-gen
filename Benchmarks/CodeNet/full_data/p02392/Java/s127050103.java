import java.io.*;
import.java.util.*;

class Main{
    public static void main(String[] args){
    Scanner scan = new Scannner(System.in);

    int a = scan.nextInt();
    int b = scan.nextInt();
    int c = scan.nextInt();

    if(a < b && b < c){
    System.out.println("Yes");
    }else{
    System.out.println("No");
    }
}       