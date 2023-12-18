import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        List<Integer>  list = new ArrayList<>();

        for(int i=0; i<3; i++){
            list.add(Integer.parseInt(sc.next()));
        }

        int a1 = list.get(0) + list.get(1);
        int a2 = list.get(1) + list.get(2);
        int a3 = list.get(0) + list.get(2);
        int result = 0;
        if(a1 < a2)
        {
            if(a1 < a3)
                result =  a1;
            else
                result = a2;
        }else{
            if(a2 < a3)
                result = a2;
            else
                result = a3;
        }
        
        if(a1 == a2 && a2 == a3) result = a1;
        System.out.println(result);

    }
}