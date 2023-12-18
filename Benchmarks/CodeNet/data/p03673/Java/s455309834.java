import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String b ="";
        StringBuilder sb =null;
        int n = sc.nextInt();
      sc.nextLine();
        String s = sc.nextLine();
        String ss[] = s.split(" ");
        for (int i = 0; i < ss.length; i++) {
            b += ss[i]+" ";
         sb = new StringBuilder(b);
            
       sb.reverse();
        }
        sb.deleteCharAt(0);
        System.out.println(sb);
       

    }
}
