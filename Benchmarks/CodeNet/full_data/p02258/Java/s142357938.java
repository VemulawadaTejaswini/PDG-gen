
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        // write your code here
        Scanner scanner=new Scanner(System.in);
        int n=scanner.nextInt();
        int min=Integer.MAX_VALUE;
        int result=Integer.MIN_VALUE;
        for(int i=1;i<n;i++){
            int x=scanner.nextInt();
            result=x-min>result?x-min:result;
            min=min>x?x:min;
        }
        System.out.println(result);
    }

}

