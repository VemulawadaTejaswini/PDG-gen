/*abc110b*/
import java.io.PrintWriter;
import java.util.*;

public class Main {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        PrintWriter out = new PrintWriter(System.out);

        String s = "No War";

        int ncitiesAN = scanner.nextInt();
        int ncitiesBM = scanner.nextInt();
        int capitalAX = scanner.nextInt();
        int capitalBY = scanner.nextInt();
        int[] coordsAx = new int[ncitiesAN+1];
        int[] coordsBy = new int[ncitiesBM+1];
        for(int i=0;i<ncitiesAN;i++){
            coordsAx[i] = scanner.nextInt();
        } //coordsAxの読み込み
        for(int i=0;i<ncitiesBM;i++){
            coordsBy[i] = scanner.nextInt();
        } //coordsByの読み込み

        coordsAx[ncitiesAN] = capitalAX;
        coordsBy[ncitiesBM] = capitalBY;

        Arrays.sort(coordsAx);
        Arrays.sort(coordsBy); //小さい順

        if(coordsAx[ncitiesAN] >= coordsBy[0]){
            s = "War";
        }
//        //debug
//        for(int i=0;i<ncitiesAN+1;i++){
//            out.print(String.valueOf(coordsAx[i])+" ");
//        } //coordsAxの読み込み
//        out.println();
//        for(int i=0;i<ncitiesBM+1;i++){
//            out.print(String.valueOf(coordsBy[i])+" ");
//        } //coordsByの読み込み
//        out.println();

        out.println(s);
        out.flush();
    }
}
