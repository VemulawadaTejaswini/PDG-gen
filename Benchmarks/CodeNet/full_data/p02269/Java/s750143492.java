import java.util.*;

public class Main{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        Set<String> S = new HashSet<String>();
        for(int i = 0;i<n;i++ ){
            String cmd = sc.next();
            String word = sc.next();
            if(cmd.equals("insert"))
                S.add(word);
            else if(cmd.equals("find")){
                if(S.contains(word)){
                    System.out.println("yes");
                }
                else{
                    System.out.println("no");
                }
            }
        }

    }
}
