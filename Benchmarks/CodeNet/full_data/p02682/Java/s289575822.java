import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String s = scanner.nextLine();
        List<String> list = new ArrayList<>(Arrays.asList(s.split(" ")));
        List<String> out = new ArrayList<>();
        for (String l : list){
            int c = 0;
            for (String s2 : list) {
                if(l.equals(s2)) c = c + 1;
            }
            if(c == 2) out.add(l);
        }
        int i1 = 0;
        int i2 = 0;
        if(out.size() == 2){
            i1 = Integer.parseInt(out.get(0));
        } else if(out.size() == 4){
            i1 = Integer.parseInt(out.get(0));
            i2 = Integer.parseInt(out.get(2));
        }
        if(i1 == i2){
            System.out.println(i1);
        } else if(i1 > i2){
            System.out.println(i1);
        } else if(i2 > i1){
            System.out.println(i2);
        }
    }
}
