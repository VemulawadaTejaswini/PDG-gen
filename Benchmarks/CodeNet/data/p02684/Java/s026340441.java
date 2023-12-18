import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        long k = sc.nextLong();

        //System.out.println("n = " + n);
        //System.out.println("k = " + k);

        int[] towns = new int[n];
        for(int i = 0; i < n; i++){
            towns[i] = sc.nextInt();
        }

        int nextPlace = 1;
        //ArrayList<Integer> visitedPlaces = new ArrayList<>();
        //visitedPlaces.add(nextPlace);
        Integer[] visitedPlaces = new Integer[n];
        visitedPlaces[0] = 1;

        int reIndex = 0;
        int loopSize = 0;
        int visitCount = 0;
        int visitedPlacesSize = 0;
        for(int i = 0; i < k; i++) {
            nextPlace = towns[nextPlace - 1];
            if (Arrays.asList(visitedPlaces).contains(nextPlace)) {
                reIndex = Arrays.asList(visitedPlaces).indexOf(nextPlace);
                visitedPlacesSize = i;
                loopSize = i - reIndex;
                break;
            }
            visitCount++;
            visitedPlaces[i] = nextPlace;
            if(i + 1 == k){
                System.out.println(nextPlace);
                return;
            }
        }

        int rem = (int)((k-visitCount) % loopSize);

        //System.out.println("rem = " + rem);
        //System.out.println("visitCount = " + visitCount);
        //System.out.println("reIndex = " + reIndex);
        //System.out.println("loopSize = " + loopSize);

        //for(int e : visitedPlaces){
        //    System.out.print(e + " ");
        //}
        //System.out.println();

        if(rem == 0) {
            System.out.println(visitedPlaces[visitedPlacesSize - 1]);
        }else{
            System.out.println(visitedPlaces[reIndex + rem - 1]);
        }
    }
}