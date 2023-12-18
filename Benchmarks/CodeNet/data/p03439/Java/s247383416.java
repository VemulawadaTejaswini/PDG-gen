import java.util.Scanner;

public class Main {

 
        public static void main(String[] args) {
            Scanner scanner = new Scanner(System.in);
            int N = scanner.nextInt();
            for(int i=0; i<=N; i=i+2){
                System.out.println(i);
                String s=scanner.next();
                if (s.equals("Vacant")){
                    return;
                }
            }          
        }
}