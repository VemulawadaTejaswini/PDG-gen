import java.util.*;


public class Main {
    public static void main(String[] args) {
      
        Scanner sc = new Scanner(System.in);
        String line = sc.nextLine();
        if(line == "A") System.out.println("T");
        if(line == "T") System.out.println("A");
        if(line == "G") System.out.println("C");
        if(line == "C") System.out.println("G");
    }
}