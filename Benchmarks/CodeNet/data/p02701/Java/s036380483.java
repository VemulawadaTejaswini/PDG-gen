import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int a = s.nextInt();
        int k = 0;
        int y = 0;
        String[] st = new String[a];
        for(int i = 0; i < a; i++){
            st[i] = "";
        }
        for(int i = 0; i < a; i++){
            String g = s.nextLine();
            boolean exist = false;
            for(String h: st){
                if(h.equals(g)){
                    exist = true;
                }
            }
            if(!exist){
                y++;
            }
        }
        System.out.println(y);
    }
}