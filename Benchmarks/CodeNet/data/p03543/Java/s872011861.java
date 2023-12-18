import java.io.*;
import java.util.*;

class Main{
    public void run() throws Exception{
        Scanner cin = new Scanner(System.in);
        String arg = cin.next();

        if(arg.contains("111") || arg.contains("222") ||arg.contains("333") || arg.contains("444")||arg.contains("555") || arg.contains("666")||arg.contains("777") || arg.contains("888") || arg.contains("999") || arg.contains("000")){
            System.out.println("Yes");
        } else {
            System.out.println("No");
        }
    }
    public static void main(String[] args) throws Exception{
        new Main().run();
    }
}
