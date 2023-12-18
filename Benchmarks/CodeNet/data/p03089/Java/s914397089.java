import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        
        int n = Integer.parseInt(sc.next());
        int[] b = new int[n];
        for(int i = 0; i < n; i++){
            b[i] = Integer.parseInt(sc.next());
        }
        
        StringBuilder sb = new StringBuilder();
        for(int i = 0; i < n; i++){
            if(b[i] > i+1){
                System.out.println("-1");
                return;
            }
            sb.append(b[i]).append(System.lineSeparator());
        }
        
        System.out.println(sb);
    }
}