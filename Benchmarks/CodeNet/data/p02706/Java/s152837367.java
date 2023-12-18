
import.java.util.*;

public class Test {
    private static int error =-1;
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        int sum = 0;
        for (int i = 0; i < b ; i++) {
            int c = sc.nextInt();
            if(a>sum)
                {
                    sum+=c;
                }
            else
                break;
            }
        if(a < sum){
            System.out.println(error);
        }
        else
            System.out.println(a-sum);
            
    

            }
}