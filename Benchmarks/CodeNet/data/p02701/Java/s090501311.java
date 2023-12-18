import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        List<String> list = new ArrayList<>();
        for(int i=0;i<n;i++){
            String s  = sc.next();
            if(!list.contains(s)){
                list.add(s);
            }
        }
        sc.close();
        System.out.println(list.size());
    }
}