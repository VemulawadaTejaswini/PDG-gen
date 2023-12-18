import java.util.Scanner;
import java.util.ArrayList;
import java.util.List;
public class Main{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        String s = sc.next();
        List<Character> list = new ArrayList<>();

        for(int i = 0;i < n;i++){
            list.add(s.charAt(i));
        }
        int min = n;
        for(int i = 0;i < n;i++){
            int cnt = 0;
            List<Character> left = list.subList(0,i);
            List<Character> right = list.subList(i+1,n);
            System.out.println("left : " + left);
            System.out.println("right : " + right);
            for(Character ch : left){
                System.out.println("ch : " + ch);
                if(ch == 'W'){
                    cnt++;
                    System.out.println("if left");
                }
            }
            for(Character ch : right){
                System.out.println("ch : " + ch);
                if(ch == 'E'){
                    cnt++;
                    System.out.println("if right");
                }
            }
            System.out.println("cnt = " + cnt);
            min = Math.min(min,cnt);
        }
        System.out.println(min);
    }
}
