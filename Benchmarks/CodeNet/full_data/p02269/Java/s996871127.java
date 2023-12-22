import java.io.IOException;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {

        Scanner sc = new Scanner(System.in);
        int n = Integer.parseInt(sc.nextLine());
        Set<String> Dictionary = new HashSet<String>();
        String tmp;
        String[] input = new String[2];
        StringBuilder ans = new StringBuilder(); 
        
        for(int i = 0; i < n; i++){
            input = sc.nextLine().split(" ");
            //System.out.println(input[0] + " " + input[1]);
            if(input[0].equals("insert")){
                Dictionary.add(input[1]);
            }else if(input[0].equals("find")){
                if(Dictionary.contains(input[1])){
                    ans.append("yes\n");
                }else{
                    ans.append("no\n");
                }
            }else{
                System.err.println("error");
            }
        }
        System.out.println(ans.toString());
       
    }
}
