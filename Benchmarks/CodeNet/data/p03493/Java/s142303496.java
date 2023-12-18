import java.util.Scanner;

public class Main {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        String str = sc.next();
        String[] strs = str.split("");
        System.out.println(Integer.parseInt(strs[0])+Integer.parseInt(strs[1])+Integer.parseInt(strs[2]));
    }
}