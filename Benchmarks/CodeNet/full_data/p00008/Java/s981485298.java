import java.util.*;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String line;
        
        while(true) {
            int count = 0;
            try {
                line = sc.nextLine();
            }catch(Exception e) {
                break;
            }
            int n = Integer.parseInt(line);
            if(n > 36) {
                System.out.println(0);
                continue;
            }
            for(int i = 0; i < 10; i++) {
                for(int j = 0; j < 10; j++) {
                    for(int k = 0; k < 10; k++) {
                        for(int l = 0; l < 10; l++) {
                            if(i + j + k + l == n) {
                                count++;
                            }
                            if(i + j + k > n) {
                                break;
                            }
                        }                        
                    }
                }
            }
            System.out.println(count);
        }
        
    }
 } 
