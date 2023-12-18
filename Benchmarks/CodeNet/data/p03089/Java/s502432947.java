import java.util.*;
import java.util.stream.Collectors;

public class Main {

    public static void main(String[] args) {
        // TODO code application logic here
        Scanner sc = new Scanner(System.in);
//        String str = sc.nextLine();
        int count = sc.nextInt();
        boolean flag = true;
        ArrayList<Integer> data = new ArrayList<>();
        ArrayList<Integer> nullData = new ArrayList<>();
        for (int i = 1; i <= count; i++) {
            data.add(sc.nextInt());
        }
        int index = -1;
        int posit = 0;

        while (data.isEmpty() == false) {
            posit = 1;
            for (Integer s : data) {
                if (s == posit) {
                    index = posit-1;
                }
                posit++;
            }
            if(data.size() == 1 && data.get(0)==1){
                index=0;
            }else if (data.size() == 1) {
                index=-1;
            }
            
            if (index == -1) {
                System.out.println("-1");
                flag = false;
                break;
            }
            nullData.add(0, data.get(index));
            data.remove(index);
            index=-1;
        }
        if (flag == true) {
            for (Integer s : nullData) {
                System.out.println(s);
            }
        }
    }
}
