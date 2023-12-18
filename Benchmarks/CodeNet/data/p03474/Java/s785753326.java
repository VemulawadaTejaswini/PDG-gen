import java.util.*;
 
public class Main {
    public static void main(String[] args) throws Exception {
        
        Scanner sc = new Scanner(System.in);
        int A = sc.nextInt();
        int B = sc.nextInt();
        String[] ary = sc.next().split("");
        if(!ary[A].equals("-")){
            System.out.println("No");
            System.exit(0);
        }else if(ary.length != (A + B + 1)){
            System.out.println("No");
            System.exit(0);
        }
        for(String str : ary){
            if(!str.matches("[1-9]")){
            System.out.println("No");
            System.exit(0);
            }
        }
        System.out.println("Yes");
    }
}