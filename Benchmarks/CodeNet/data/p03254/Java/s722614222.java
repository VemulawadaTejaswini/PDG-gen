import java.util.ArrayList;
import java.util.Scanner;

public class Candy {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int child=sc.nextInt();
        int candy=sc.nextInt();
        ArrayList<Integer> distribution= new ArrayList<>(child);
        for(int i=1;i<=child;++i){
            distribution.add(sc.nextInt());
        }
        distribution.sort(Integer::compareTo);
        int max=0;
        int count = 0;
        for(int i=0;i<child;++i){
            if (max<candy){
                max+=distribution.get(i);
                ++count;
            }
            else{
                break;
            }
        }
        System.out.println(count);
    }
}
