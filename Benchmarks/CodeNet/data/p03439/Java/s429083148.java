import java.util.Scanner;

public class Main {

 
        public static void main(String[] args) {
            Scanner scanner = new Scanner(System.in);
            int N = scanner.nextInt();
            for(int i=0; i<=N/2; i++){
                System.out.println(i);
                System.out.flush();
                String s=scanner.next();
                if (s.equals("Vacant")){
                    return;
                }
                System.out.println(N-i-1);
                System.out.flush();
                s=scanner.next();
                if (s.equals("Vacant")){
                    return;
                }
            }          
        }
}