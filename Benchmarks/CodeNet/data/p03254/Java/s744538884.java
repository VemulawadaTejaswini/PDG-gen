import java.util.ArrayList;
import java.util.Scanner;

public class Main {
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
        for(int i=0;i<child;++i){
            if (max<candy){
                max+=distribution.get(i);
            }
            else{
                if(max==child){
                    System.out.println(i-1);
                }
                else{
                    System.out.println(i);
                }

                break;
            }
        }
    }
}
