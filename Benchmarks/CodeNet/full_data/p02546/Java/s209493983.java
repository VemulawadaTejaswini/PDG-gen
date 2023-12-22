
import java.util.Scanner;

/**
 * Created by enpingkuang on 2020/9/19 7:52 下午
 */
public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String n = scanner.next();
        if(n.endsWith("s")){
            System.out.println(n.substring(0,n.length()-1)+"es");
        }else{
            System.out.println(n+"s");
        }
    }
}