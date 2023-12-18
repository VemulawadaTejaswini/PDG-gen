import java.util.*;
    public class Main {// Main
        public static void main(String[] args){
            Scanner scanner = new Scanner(System.in);
            int x = scanner.nextInt();
            int a = scanner.nextInt();
            int b = scanner.nextInt();
            int y = (x-a);
            int n = (y/b);
            int f = y-(n*b);
            System.out.println(f);
}
}