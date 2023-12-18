import java.util.ArrayList;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        int numOfObs=scan.nextInt();
        int numOfRoad=scan.nextInt();
        ArrayList<Integer> obsHeights=new ArrayList<>();
        for (int i = 0; i <numOfObs ; i++) {
            obsHeights.add(scan.nextInt());
        }
        boolean[] badObs=new boolean[numOfObs];
        for (int i = 0; i <numOfRoad ; i++) {
            int a=scan.nextInt()-1;
            int b=scan.nextInt()-1;
            if (obsHeights.get(a)<obsHeights.get(b)){
                badObs[a]=true;
            }else if(obsHeights.get(a)>obsHeights.get(b)){
                badObs[b]=true;
            }else{
                badObs[a]=true;
                badObs[b]=true;
            }
        }
        int count=0;
        for (int i = 0; i <numOfObs; i++) {
            if (!badObs[i]){
                count++;
            }
        }
        System.out.println(count);
    }
}
