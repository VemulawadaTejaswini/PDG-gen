import java.util.*;
import java.io.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        if(N==3) System.out.println("2 5 63");
        else{
            System.out.print("3 9");
            for(int n=1;n<N-2;n++) System.out.print(" "+(2*n));
            System.out.print(" ");
            switch(N%3){
                case 1:
                	System.out.println(29998);
                	break;
                default:
                	System.out.println(30000);
            }
        	
        }
    }
}