import java.lang.reflect.Array;
import java.util.*;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Main {




    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        int N = Integer.parseInt(scan.next());
        int X = Integer.parseInt(scan.next());

        int distance;
        int[] distanceArray = new int[N];
        for(int i = 0; i < N; i++){
            distance = Integer.parseInt(scan.next()) - X;
            if(distance < 0) distance = -(distance);
            distanceArray[i] = distance;
        }

        Arrays.sort(distanceArray);
        System.out.println(distanceArray[0]);
    }
}