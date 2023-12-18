import java.util.Scanner;

public class Main {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        String s1s2s3 = sc.toString();
        String[] strings = s1s2s3.split("[0-1]{2}");
        System.out.println(Integer.parseInt(strings[0])+Integer.parseInt(strings[1])+Integer.parseInt(strings[2]));
    }
}