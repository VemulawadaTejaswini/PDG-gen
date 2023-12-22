import java.util.Scanner;
import java.lang.StringBuilder;

class Main{
    public static void main(String[] args){
	final Scanner sc = new Scanner(System.in);
	final StringBuilder sb=new StringBuilder(sc.next());
	System.out.println(sb.reverse());
    }
}