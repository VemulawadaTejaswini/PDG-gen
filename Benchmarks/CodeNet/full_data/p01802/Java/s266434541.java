import java.util.*;

public class Main {
    
    public static void main(String[] args) {
        try(Scanner sc = new Scanner(System.in)) {
            while(sc.hasNext()) {
                int D = sc.nextInt();
                int E = sc.nextInt();
                if(D+E==0) break;
                
                double r = Double.MAX_VALUE;
                for(int i=0; i<D; i++) {
                    int j = D - i;
                    r = Math.min(r, Math.abs(Math.sqrt(i*i+j*j)-E));
                }
                System.out.println(r);
            }
        }
    }
}

