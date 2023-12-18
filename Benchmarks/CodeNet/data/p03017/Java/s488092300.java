import java.util.Scanner;

public class Main {

    private static final Scanner  SC = new Scanner(System.in);
    private static final int N = SC.nextInt();
    private static final int A = SC.nextInt();
    private static final int B = SC.nextInt();
    private static final int C  = SC.nextInt();
    private static final int D  = SC.nextInt();
    private static final String MAP = SC.next();


    public static void main(String[] args) {
        Player snuke = new Player(N,MAP,A,C);
        Player fnuke = new Player(N,MAP,B,D);
        boolean canGetTo;

        if(C<D){
            canGetTo = !fnuke.hasTwoRocks() && !snuke.hasTwoRocks();
        }else{
            canGetTo = !fnuke.hasTwoRocks() && fnuke.canBeJumpedOver() && !snuke.hasTwoRocks();
        }

        if(canGetTo){
            System.out.println("Yes");
        } else {
            System.out.println("No");
        }
    }
}

class Player{
    private boolean existsTwoRocks;
    private boolean jumpedOver;

    public Player(int mapSize, String wholeMap,int start,int goal){
        start--;
        goal--; //substringで使えるようなマス番号に変換
        String map = wholeMap.substring(start, goal);
        if(start!=0)  start--;
        if(goal !=mapSize-1) goal++; //マップの拡張
        String expandedMap = wholeMap.substring(start, goal);

        this.existsTwoRocks = map.contains("##");
        this.jumpedOver = expandedMap.contains("...");
    }

    public boolean hasTwoRocks() {
        return existsTwoRocks;
    }

    public boolean canBeJumpedOver() {
        return jumpedOver;
    }

}