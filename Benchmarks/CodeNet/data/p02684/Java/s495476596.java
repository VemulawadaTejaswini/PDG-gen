import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        long k = sc.nextLong();

        int[] towns = new int[n];
        for(int i = 0; i < n; i++){
            towns[i] = sc.nextInt();
        }

        int nextPlace = 1;
        ArrayList<Integer> visitedPlaces = new ArrayList<>();

        int reIndex = 0;
        int loopSize = 0;
        for(long i = 0; i < k; i++){
            nextPlace = towns[nextPlace-1];
            if(visitedPlaces.contains(nextPlace)){
                reIndex = visitedPlaces.indexOf(nextPlace);
                loopSize = visitedPlaces.size() - reIndex;
                break;
            }
            visitedPlaces.add(nextPlace);
        }

        int rem = (int)((k-reIndex) % loopSize);

        System.out.println(visitedPlaces.get(reIndex + rem - 1));
    }
}