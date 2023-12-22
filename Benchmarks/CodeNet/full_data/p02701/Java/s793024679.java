import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        long a = s.nextInt();
        long k = 0;
        long y = 0;
        String[] st = new String[a];
        for(long i = 0; i < a; i++){
            st[i] = "";
        }
        for(long i = 0; i < a; i++){
            String g = s.nextLine();
            boolean exist = false;
            for(String h: st){
                if(h.equals(g)){
                    exist = true;
                }
            }
            if(!exist){
                y++;
                st[k] = g;
                k++;
            }
        }
        System.out.println(y);
    }
}