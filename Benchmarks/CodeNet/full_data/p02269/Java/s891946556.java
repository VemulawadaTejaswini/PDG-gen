import java.util.Scanner;
import java.util.HashSet;

public class Main{
    public static void main(String[]argc){
        Scanner sc = new Scanner(System.in);
        HashSet<String> set = new HashSet<String>();
        int n = sc.nextInt();    
        for(int i=0;i<n;i++){
            String s1 = sc.next();
            if(s1.equals("insert")){
                String s2 = sc.next();
                set.add(s2);
            }else if(s1.equals("find")){
                String s2 = sc.next();
                if(set.contains(s2)) System.out.println("yes");
                else System.out.println("no");
            }           
        }
    }
}
