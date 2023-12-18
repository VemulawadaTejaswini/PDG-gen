import java.util.Scanner;

public class Main {
    static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        String initial = sc.next();
        StringBuilder sb = new StringBuilder("");
        StringBuilder sb2 = new StringBuilder("");
        sb.append(initial);
        int numOper = sc.nextInt();
        int temp;
        String c = "";
        char cc;

        for(int i = 0; i<numOper; i++){
            temp = sc.nextInt();
            if(temp == 1){
                sb.reverse();
            }else if (temp == 2){
                int f = sc.nextInt();
                if(f == 1){
                    c = sc.next();
                    cc = c.charAt(0);
                    sb.insert(0, cc);
                }else if(f == 2){
                    c = sc.next();
                    sb.append(c);
                }
            }

        }
        System.out.println(sb);
    }
}
