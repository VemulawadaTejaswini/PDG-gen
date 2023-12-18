import java.util.Scanner;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
public class Main {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        List<String> list = new ArrayList<String>();
        int a = s.nextInt();
        int y = 1;
        for(int i = 0; i < a; i++){
            String g = s.nextLine();
            list.add(g);
        }
        Collections.sort(list);
        String l = list.get(0);
        for(int i = 1; i < list.size(); i++){
            if(!(list.get(i).equals(l))){
                y++;
                l = list.get(i);
            }
        }
        System.out.println(y);
    }
}