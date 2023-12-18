import java.util.*;
public class Main{
    public static void main(String[] args)throws Exception{
        Scanner sc = new Scanner(System.in);

        int a = sc.nextInt();
        int b = sc.nextInt();

        int temp = 0;

        for(int i = 1;i <= b-a ;i++){//i=0,1,2,,,,n-1 で動作
            temp += i;
        }

        System.out.println(temp - b);
    }
}