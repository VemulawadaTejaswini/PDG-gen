import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();
        int q = sc.nextInt();
        char temp;
        for(int i = 0;i < q;i++){
            if(sc.nextInt() == 1){
                StringBuilder sub = new StringBuilder(s);
                s = sub.reverse().toString();
            }else{
                if(sc.nextInt() == 1){
                    s = sc.next() + s;
                }else{
                    s = s + sc.next();
                }
            }
        }
        System.out.println(s);
    }
}
