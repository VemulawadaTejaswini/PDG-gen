import java.util.*;


public class Main {
    public static void main(String[] args) {
        // 自分の得意な言語で
        // Let's チャレンジ！！

        Scanner sc = new Scanner(System.in);
        String line = sc.nextLine();
        String s[]=line.split("",0);
        int n=Integer.parseInt(line);
        int a=0;
        for(int i=0;i<s.length;i++){
            a+=Integer.parseInt(s[i]);
        }
        if((n/a)*a==n)
        System.out.println("Yes");
        else
        System.out.println("No");
    }
}