import java.util.*;


public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String line = sc.nextLine();
        System.out.println(ret(line));
    }
    static String ret(String line){
        char c=line.charAt(0);
        c=(char)((int)c+1);
        return String.valueOf(c);
    }
}