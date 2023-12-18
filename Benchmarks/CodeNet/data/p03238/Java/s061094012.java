import java.util.*;
import java.io.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int age = sc.nextInt();
        if(age==1){
        	System.out.println("Hello World");
        }else if(age==2){
        	int a = sc.nextInt();
        	int b = sc.nextInt();
        	System.out.println(a+b);
        }else{
        	System.out.println("you are too old");
        }
    }
}