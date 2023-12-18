import java.util.Scanner;
import java.util.ArrayList;
import java.util.List;
public class Main {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        List<String> list = new ArrayList<String>();
        int a = s.nextInt();
        int y = 0;
        for(int i = 0; i < a; i++){
            String g = s.nextLine();
            boolean exist = false;
            for(String h: list){
                if(h.equals(g)){
                    exist = true;
                }
            }
            if(!exist){
                y++;
                list.add(g);
            }
        }
        System.out.println(y);
    }
}