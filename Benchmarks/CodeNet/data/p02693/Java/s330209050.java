import java.util.*;

public class Main {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        int a = sc.nextInt();//5桁を1桁づつ分解
        int b = sc.nextInt();
        int k = sc.nextInt();
        sc.close();

        if((b-a)/k>=1){
            System.out.println("OK");
        }else{
            System.out.println("NG");
        }


    }
}