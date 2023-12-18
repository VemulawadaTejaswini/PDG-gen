

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b  = sc.nextInt();
        int res  =  1;
        int total = a;
        for(int i  = 0 ;i<4 && total < b;i++)
        {
            total+=a;
            res+=1;
        }
        System.out.println(res);
    }
}
