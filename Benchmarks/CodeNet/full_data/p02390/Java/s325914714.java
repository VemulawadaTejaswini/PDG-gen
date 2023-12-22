import java.util.*;

class Main{
        public static void main(String[] args){
                Scanner scanner = new Scanner(System.in);
                int i = scanner.nextInt();
                int h = i/(60*60);
                int m = (i%(60*60))/60;
                int s = (i%(60));
                System.out.println(h + ":" + m + ":" + s);
        }
}