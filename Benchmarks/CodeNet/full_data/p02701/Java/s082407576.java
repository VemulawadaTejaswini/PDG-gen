import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner scan =new Scanner(System.in);

        int N =scan.nextInt();

        Map<String,Integer> map=new HashMap<>();

      int i=0;


while(i<N){
   map.put(scan.next(),1);

    i=i+1;

}

System.out.println(map.size());


    }
}