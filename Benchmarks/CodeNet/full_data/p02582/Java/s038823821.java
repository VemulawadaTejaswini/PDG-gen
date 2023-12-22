import java.util.*;
public class Main{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String L = sc.nextLine();
        
        switch(L){
            case "SSS":
                System.out.println("0");
            case "SSR":
                System.out.println("1");
            case "SRS":
                System.out.println("1");
            case "RSS":
                System.out.println("1");
            case "RRS":
                System.out.println("2");
            case "RSR":
                System.out.println("1");
            case "SRR":
                System.out.println("2");
            case "RRR":
                System.out.println("3");
        }
    }
}







