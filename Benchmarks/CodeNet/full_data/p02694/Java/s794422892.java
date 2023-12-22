import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        long x = Long.parseLong(sc.next());
        long deposit = 100;
        int yearCount = 0;
        
        while(deposit < x){
            deposit += Math.floor(deposit*0.01);
            yearCount++;
        }
        
        System.out.println(yearCount);
    }
}