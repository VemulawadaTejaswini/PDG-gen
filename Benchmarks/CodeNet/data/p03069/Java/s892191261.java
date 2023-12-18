import java.util.Scanner;
public class Main {

    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        while (sc.hasNext()){
            int n = sc.nextInt();
            StringBuffer sb = new StringBuffer(sc.next());

            int count = 0;
            for (int i = 0; i < sb.length()-1; i++) {
                if ((sb.charAt(i) == '#') && (sb.charAt(i+1) == '.')){
                    count++;
                }
            }
            System.out.println(count);
        }
    }
}