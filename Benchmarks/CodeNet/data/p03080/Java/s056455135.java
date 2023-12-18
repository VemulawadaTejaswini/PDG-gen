import java.util.*;
 
public class Main {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);
        String line = sc.nextLine();
        int N = Integer.valueOf(line);
		String line2 = sc.nextLine();
      	char target = 'B';
        int B1 = line2.length() - line2.replace(target + "", "").length();
        
      	target = 'R';
        int R1 = line2.length() - line2.replace(target + "", "").length();
      
        if(B1<R1){
            System.out.println("Yes");
        }else{
            System.out.println("No");
        }
    }
}
