import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();

        if(N>=400){
            if(N<=599){
                System.out.println(8);
            }
        }
        if(N>=600){
            if(N<=799){
                System.out.println(7);
            }
        }
        if(N>=800){
            if(N<=999){
                System.out.println(6);
            }
        }
        if(N>=1000){
            if(N<=1199){
                System.out.println(5);
            }
        }
        if(N>=1200){
            if(N<=1399){
                System.out.println(4);
            }
        }
        if(N>=1400){
            if(N<=1599){
                System.out.println(3);
            }
        }
        if(N>=1600){
            if(N<=1799){
                System.out.println(2);
            }
        }
        if(N>=1800){
            if(N<=1999){
                System.out.println(1);
            }
        }

    }
}