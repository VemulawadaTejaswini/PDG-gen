
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class Main {

    public static int queryCount=0;
    public static void main(String[] args) {
	// write your code here
        Scanner scanner=new Scanner(System.in);
        String s=scanner.next();
        String[] strings=s.split("");
        System.out.println(Arrays.stream(strings).mapToInt(ss->Integer.parseInt(ss)).sum());
    }
}
