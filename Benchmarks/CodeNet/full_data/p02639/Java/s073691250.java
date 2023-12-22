import java.util.*;

public class Main {
    public static void main(String[] args) throws Exception {
        
        Scanner scan = new Scanner(System.in);
        String s = scan.nextLine();
        
        String[] str = s.split(" ");
        
        for(int i = 0; i < str.length; i++){
            if(str[i].equals("0")){
                System.out.println(i + 1);
            }
        }
    }
}