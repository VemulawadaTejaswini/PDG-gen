import java.util.*;
public class Main{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        String line = sc.nextLine();
        String line2 = sc.nextLine();
        String line3 = sc.nextLine();
        String line4 = sc.nextLine();
        
        String alone = (line+line2+line3+line4);
        
        String x ="1974";
        
        if (alone.equals(x)){
            System.out.println("YES");
        }else{
            System.out.println("NO");
        }

    }
}