import java.util.Scanner;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
public class Main {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        List<String> list = new ArrayList<String>();
        List<String> list2 = new ArrayList<String>();
        int a = s.nextInt();
        for(int i = 0; i < a; i++){
            list.add(s.nextLine());
        }
        Collections.sort(list);
        String l = list.get(0);
        for(int i = 1; i < list.size(); i++){
            if(!(list.get(i).equals(l))){
                l = list.get(i);
                list2.add(l);
            }
        }
        System.out.println(list2.size()+1);
    }
}