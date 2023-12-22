import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        List<String> list = new ArrayList<>();
        for(int i=0;i<n;i++){
            String s  = sc.next();
            list.add(s);
        }
        List<String> listb = new ArrayList<String>(new HashSet<>(list));
        sc.close();
        System.out.println(listb.size());
    
        
    }
}