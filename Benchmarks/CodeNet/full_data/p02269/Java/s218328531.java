import java.util.HashSet;
import java.util.Scanner;

public class Main{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        HashSet<String> dic = new HashSet<>();
        int n = sc.nextInt();
        for(int i=0; i<n; i++){
            String S = sc.next();
            String word = sc.next();
            if(S.equals("insert")) dic.add(word);
            else if(S.equals("find")){
                if(dic.contains(word)) System.out.println("yes");
                else System.out.println("no");
            }
        }
    }
}
