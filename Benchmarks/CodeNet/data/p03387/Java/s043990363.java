import java.util.*;

public class Main {

    public static  void main(String args[]) {
        Scanner scanner = new Scanner(System.in);
        ArrayList<Integer> array = new ArrayList<>();
        for(int i = 0; i < 3; i++){
            array.add(scanner.nextInt());
        }
        Collections.sort(array);
        int s = array.get(0);
        int m = array.get(1);
        int l = array.get(2);
        int count = 0;
        while (s <= l-2){
            s += 2;
            count++;
        }
        while (m <= l-2){
            m += 2;
            count++;
        }

        if(s == m){
            if(m != l){
                count += 1;
            }
        }else{
            count += 2;
        }
        System.out.println(count);
    }
}
