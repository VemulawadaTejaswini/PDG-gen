import java.util.ArrayList;
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
        ArrayList<Integer> visitedPlaces = new ArrayList<>();
        visitedPlaces.add(nextPlace);

        int reIndex = 0;
        int loopSize = 0;
        int visitCount = 0;
        while(true) {
            nextPlace = towns[nextPlace - 1];
            if (visitedPlaces.contains(nextPlace)) {
                reIndex = visitedPlaces.indexOf(nextPlace);
                loopSize = visitedPlaces.size() - reIndex;
                break;
            }
            visitCount++;
            visitedPlaces.add(nextPlace);
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
            System.out.println(visitedPlaces.get(visitedPlaces.size() - 1));
        }else{
            System.out.println(visitedPlaces.get(reIndex + rem - 1));
        }
    }
}