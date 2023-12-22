import java.util.*;
import java.io.*;

public class Main {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);
        //int n = sc.nextInt();
        int flag = 0;
        for(int i=1;i<=5;i++){
            int x = sc.nextInt();
            if(x == 0)flag=i;
        }
        System.out.println(flag);
    }
}
