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
        //visitedPlaces.add(nextPlace);

        long reIndex = 0;
        long loopSize = 0;
        for(long i = 0; i < k; i++){
            nextPlace = towns[nextPlace-1];
            if(visitedPlaces.contains(nextPlace)){
                reIndex = visitedPlaces.indexOf(nextPlace);
                //loopSize = visitedPlaces.size() - reIndex;
                for(long j = 0; j < reIndex; j++){
                    visitedPlaces.remove(j);
                }
                loopSize = visitedPlaces.size();
                break;
            }
            visitedPlaces.add(nextPlace);
        }

        long rem = ((k-reIndex) % loopSize);
        //for(int i = 0; i < visitedPlaces.size(); i++){
        //    System.out.print(visitedPlaces.get(i) + " ");
        //}
        //System.out.print("\n");
        System.out.println(visitedPlaces.get((int)rem-1));
    }
}