import java.util.*;
import java.io.*;

public class Main {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        Set<String> set = new HashSet<>();
        int n = sc.nextInt();
        while(n-- != 0){
            set.add(sc.nextLine());
        }
        System.out.println(set.size());
    }
}
