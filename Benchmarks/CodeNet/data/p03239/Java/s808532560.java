    import java.util.*;
     
    public class Main {
        public static void main(String[] args) {
            // Your code here!
            Scanner sc = new Scanner(System.in);
            String line = sc.nextLine();
            String[] nt = line.split(" ");
            int n = Integer.parseInt(nt[0]);
            int t = Integer.parseInt(nt[1]);
            
            String rel = "TLE";
            for (int i = 0; i < n; i++) {
                String keiro = sc.nextLine();
                String[] k = keiro.split(" ");
                if (Integer.parseInt(k[1]) <= t) {
                    if (rel.equals("TLE")) {
                        rel = String.valueOf(k[0]);
                    } else if (Integer.parseInt(rel) > Integer.parseInt(k[0])) {
                        rel = String.valueOf(k[0]);
                    }
                }    
            }
            System.out.println(rel);
            sc.close();
        }
    }