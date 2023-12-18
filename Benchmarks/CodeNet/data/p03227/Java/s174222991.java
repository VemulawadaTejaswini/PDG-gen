import java.util.*;

public class Main {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        
        String s = sc.next();
        
        if(s.length() == 2){
            System.out.println(s);
        }else{
            Character[] c = new Character[s.length()];
            for(int i = 0; i < s.length(); i++) c[i] = s.toCharArray()[i];
            Arrays.sort(c, Collections.reverseOrder());
            
            Arrays.stream(c).forEach(System.out::print);
        }
    }
}
