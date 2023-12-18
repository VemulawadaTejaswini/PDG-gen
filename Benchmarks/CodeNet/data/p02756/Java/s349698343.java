import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String s = scanner.nextLine().trim();
        StringBuilder sb = new StringBuilder(s);
        boolean reversed  = false;
        int q = scanner.nextInt();
        for (int i = 0; i < q; i++) {
            int t = scanner.nextInt();
            if(t==1){
                reversed = !reversed;
            }else{
                int f = scanner.nextInt();
                char c = scanner.nextLine().trim().charAt(0);
                if((f==1) ^ reversed){
                    sb.insert(0, c);
                }else{
                    sb.append(c);
                }
            }
        }
        if(reversed){
            sb.reverse();
        }
        System.out.println(sb.toString());
    }
}