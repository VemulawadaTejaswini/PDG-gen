import java.util.ArrayList;
import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class Main {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        HashSet<String> PrizeSet = new HashSet<>();
        int num = sc.nextInt();
        for(int i = 0;i < num;i++){
            String Prize = sc.next();
            PrizeSet.add(Prize);
        }
        System.out.println(PrizeSet.size());
    }
}