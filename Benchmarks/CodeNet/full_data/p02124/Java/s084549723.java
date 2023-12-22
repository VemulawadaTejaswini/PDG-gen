import java.util.Scanner;
public class Main {
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
            //while (sc.hasNext()) {
                int x = sc.nextInt();
                System.out.println(id(x));
            //}
        sc.close();
 
    }
    
    private static String id(int x){
        StringBuilder sb = new StringBuilder();
        
        int n = x / 100;
           // System.out.print(n);
        sb.append("ai1333");
        
            for (int t = 0; t < n ; t++) {
                sb.append("3");
            }
            
        return sb.toString();
    }
    
}

