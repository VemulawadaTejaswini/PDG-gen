import java.util.Scanner;

public class Main {
    public static boolean debug = true;
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.next();
        String t = sc.next();

        char[] sa = s.toCharArray();
        char[] ta = t.toCharArray();

        int count =0;
        for(int i=0;i<3;i++){
            if(sa[i] == ta[i]){
                count++;
            }
        }
        System.out.println(count);




    }
    public static void d(String message){
        if(debug){
            System.out.println(message);
        }
    }
}