import java.util.*;


public class Main {
    public static void main(String[] args) throws Exception {
        // Your code here!
        Scanner scanner=new Scanner(System.in);
        int N=scanner.nextInt();
        if(N%func(N)==0){
            System.out.println("Yes");
        }else{
            System.out.println("No");
        }
        System.out.println();
    }
    public static int func(int x){
        if(x/10==0){
            return x%10;
        }
        return x%10+func(x/10);
    }
}
