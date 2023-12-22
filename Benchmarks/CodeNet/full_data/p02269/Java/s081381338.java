import java.util.*;
import java.util.Scanner;

public class Main {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        Set<String> Dic = new HashSet<String>();
        int Data = sc.nextInt();
        for(int i = 0; i < Data; i++){
            String IorF = sc.next();
            if(IorF.equals("insert")){
                String insert = sc.next();
                Dic.add(insert);
            }else if(IorF.equals("find")){
                String search = sc.next();
                if(Dic.contains(search)){
                    System.out.println("yes");
                }else{
                    System.out.println("no");
                }
            }
        }
        sc.close();
    }
}
