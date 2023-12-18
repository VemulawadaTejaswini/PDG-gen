import java.util.*;
public class Main { 
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String[] strs = sc.next().split(" ");
        System.out.println(strs[0].charAt(0) + strs[1].charAt(0) + strs[2].charAt(0));
    }
}