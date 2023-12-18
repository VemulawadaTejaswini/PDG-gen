import java.util.*;
 
public class Main {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);
        int wideLength = Integer.parseInt(sc.next());
        List<Integer> topList = new ArrayList<>();
        for(int x=1; x<= wideLength; x++) {
            topList.add(Integer.parseInt(sc.next()));
        }
        List<Integer> secondList = new ArrayList<>();
        for(int x=1; x<= wideLength; x++) {
            secondList.add(Integer.parseInt(sc.next()));
        }
        int res = 0;
        for(int x=1; x<= wideLength; x++) {
            int candy = 0;
            for(int y=1; y<=x; y++) {
                candy += topList.get(y-1);
            }
            for(int y=x; y<=wideLength; y++) {
                candy += secondList.get(y-1);
            }
            res = res>=candy?res:candy;
        }
        System.out.println(res);
    }
}