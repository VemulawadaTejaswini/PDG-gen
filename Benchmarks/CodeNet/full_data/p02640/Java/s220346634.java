import java.util.*;
public class Main {
    public static void main(String[] args) throws Exception {
        // Your code here!
        Scanner sc = new Scanner(System.in);
        int zoo = sc.nextInt();;
        int leg = sc.nextInt();
        if(leg % 2 != 0){
            System.out.println("No");
        }else if(zoo * 4 < leg){
            System.out.println("No");
        }else if(zoo * 2 > leg){
            System.out.println("No");
        }else{
            System.out.println("Yes");
        }
    }
}
