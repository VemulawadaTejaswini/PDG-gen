import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();
        String a = "";
        String b = "";
        boolean flag = false;
        int n = sc.nextInt();
        for (int i = 0; i < n; i++) {
            int q = sc.nextInt();
            if(q == 1){
                if(flag){
                    flag = false;
                }else{
                    flag = true;
                }
            }else if(q == 2){
                int t = sc.nextInt();
                String c = sc.nextLine().trim();
                if(t == 1){
                    if(flag){
                        b = b + c;
                    }else{
                        a = c + a;
                    }
                }else if(t == 2){
                    if(flag){
                        a = c + a;
                    }else{
                        b = b + c;
                    }
                }
            }
        }
        if(flag){
            for (int i = b.length() - 1; i >= 0; i--) {
                System.out.print(b.charAt(i));
            }
            for (int i = s.length() - 1; i >= 0; i--) {
                System.out.print(s.charAt(i));
            }
            for (int i = a.length() - 1; i >= 0; i--) {
                System.out.print(a.charAt(i));
            }
        }else{
            System.out.print(a);
            System.out.print(s);
            System.out.print(b);
        }
    }
}