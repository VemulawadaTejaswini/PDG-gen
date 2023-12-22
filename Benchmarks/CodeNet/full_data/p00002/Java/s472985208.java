import java.util.*;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        while(true) {
            String line;
            try {
                line = sc.nextLine();
            }catch(Exception e) {
                break;
            }
            
            String[] linesp = line.split(" ");
            int a = Integer.parseInt(linesp[0]);
            int b = Integer.parseInt(linesp[1]);
            
            String sum = String.valueOf(a + b);
            
            System.out.println(sum.length());
        }
    }
 } 
