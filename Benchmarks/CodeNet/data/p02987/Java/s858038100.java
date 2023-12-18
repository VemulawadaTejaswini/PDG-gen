import java.util.*;
 
class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
		
      	String str = sc.next();
        
        if ((str[0] == str[1] && str[2] == str[3] && str[1] != str[2])
           || (str[0] == str[2] && str[1] == str[3] && str[0] != str[1])
           || (str[0] == str[3] && str[1] == str[2] && str[0] != str[1])) {
            System.out.print("Yes");
        } else {
            System.out.print("No");
        } 
    }
}