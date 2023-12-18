import java.util.*;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        String line = scanner.nextLine();
        
        String arr[] = line.split(" ", 0);
        
        int X = Integer.parseInt(arr[0]);
        int Y = Integer.parseInt(arr[1]);
        int Z = Integer.parseInt(arr[2]);
        
        System.out.println((X-Z)/(Y+Z));

    }
}