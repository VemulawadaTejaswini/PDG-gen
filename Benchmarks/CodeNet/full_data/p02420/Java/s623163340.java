import java.util.Scanner;

public class Main{
    public static void main(String[]argc){
        Scanner sc = new Scanner(System.in);
        for(int k=0;;k++){
            String s1 = sc.next();
            if(s1.equals("-")) break;
            int m = sc.nextInt();
            for(int i=0;i<m;i++){
                int h = sc.nextInt();
                String s2 = s1.substring(h,s1.length());
                s2 += s1.substring(0,h);
                s1 = s2;
            }
            System.out.println(s1);
        }
    }
}

