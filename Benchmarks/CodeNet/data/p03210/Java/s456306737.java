import java.util.*;
public class Main{
        public static void main(String[] args){
                Scanner sc = new Scanner(System.in);
                int x = sc.nextInt();
                if(x > 2 && x < 8 && x % 2 != 0){
                        System.out.println("YES");
                }else{
                        System.out.println("NO");
                }
        }
}
//条件カッコよくした