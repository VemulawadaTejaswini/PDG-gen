import java.util.Scanner;
import java.lang.StringBuffer;

class Main{
    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        StringBuffer sb = new StringBuffer(in.nextLine());
        System.out.println(sb.reverse().toString());
    }
}