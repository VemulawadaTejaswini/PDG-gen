import java.util.Scanner;
import java.util.ArrayList;

public class Main{

    public static void main(String args[]){

        Scanner scan = new Scanner(System.in);
        Long L = Long.parseLong(scan.next());
        Long R = Long.parseLong(scan.next());

        ArrayList<Long> array = new ArrayList<Long>();

        for(long i=L;i<=R;i++){
            for(long j=i+1;j<=R;j++){
                    //array.add((i * j) % 2019L); 
                    array.add(((i % 2019L) * (j % 2019L)) % 2019L);
            }
        }
        long min = array.get(0);
        for(int i=1;i<array.size();i++){
            if(array.get(i) < min){
                min = array.get(i);
            }
        }
        System.out.println(min);

    }

}