import java.util.*;
import java.util.Date;
 
class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        ArrayList<Integer> list = new ArrayList<Integer>();
        int[] count = new int[101];
        int a;
        int n = 0;
        while(true) {
            try {
                a = sc.nextInt();
            }catch(Exception e) {
                break;
            }
            count[a]++;
            n++;
        }
        int max = 0;
        for(int i = 0; i < n; i++) {
            if(max < count[i]) {
                max = count[i];
            }
        }
        for(int i = 0; i < n; i++) {
            if(max == count[i]) {
                list.add(i);
            }
        }
        Collections.sort(list);
        for(int i : list) {
            System.out.println(i);
        }
    }
}
