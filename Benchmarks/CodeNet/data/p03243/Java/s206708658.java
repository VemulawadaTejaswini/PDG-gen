import java.util.*;
public class Main {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        // 整数の入力
        int n = sc.nextInt();
        a=n%10;
        b=n%100/10;
        c=n%1000/100;
        a=n>a*111?999:a*111;
        b=n>b*111?999:b*111;
        c=n>c*111?999:c*111;
        System.out.println((a<c?a:c)<b?(a<c?a:c):b);
        // 出力
        
    }
}
