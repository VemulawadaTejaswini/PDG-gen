import java.util.*;

public class Main {
    public static void main(String[] args) throws Exception {
        // Your code here!
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int a = sc.nextInt();
        int b = sc.nextInt();
        char[] cl = sc.next().toCharArray();
        for(char c : cl){
            if(c == 'a'){
                if(a+b > 0){
                    System.out.println("Yes");
                    a--;
                }else{
                    System.out.println("No");
                }
            }else if(c == 'b'){
                if(a+b > 0 && b > 0){
                    System.out.println("Yes");
                    b--;
                }else{
                    System.out.println("No");
                }
            }else{
                System.out.println("No");
            }
        }
    }
}
