import java.io.*;// 从这行开始复制，这是第一行
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        Scanner sc = new Scanner(System.in);
        String t = sc.next();
        String s=t.replace("?","D");
        System.out.println(s);
    }
}