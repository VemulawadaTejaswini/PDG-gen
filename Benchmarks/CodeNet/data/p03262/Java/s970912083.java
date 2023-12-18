import java.util.*;

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

        if(distanceArray.length == 1){

            System.out.println(distanceArray[0]);

        }else{

            System.out.println(gcd(distanceArray[1], distanceArray[0]));
        }

    }

    private static int gcd(int a, int b){
        
        if(a%b == 0){
            
            return b;
            
        }else{
            
            return gcd(b, a%b);
            
        }
    }
}