import java.util.Arrays;
import java.util.Scanner;

public class Main {
    	public static void main(String[] args){
    	Scanner sc = new Scanner(System.in);
    	String[] n = sc.next().split("");
    	String[] s = sc.next().split("");

    	 Arrays.sort(n);
    	 Arrays.sort(s);


        String nn_last = String.join("", n);
        String ss_last = String.join("", s);

        System.out.println(nn_last.compareTo(ss_last) < 0 ? "Yes" : "No");


    	}
    }