import java.util.*;


class CheckerBoard{
    private int patternSize;
    private int patternStartX, patternStartY;

    CheckerBoard(int s){
        this.patternSize = s;
        this.patternStartX = 0;
        this.patternStartY = 0;
    }

    public boolean checkPatternBoolean(int x, int y){
        boolean divX = ((x + this.patternStartX) % this.patternSize * 2) < this.patternSize;
        boolean divY = ((y + this.patternStartY) % this.patternSize * 2) < this.patternSize;
        return (divX == divY);
    }

    public void setX(int x){
        this.patternStartX = x;
    }
    public void setY(int y){
        this.patternStartY = y;
    }

    public int getPatternSize() {
        return patternSize;
    }

}


class Demand{
    private int x;
    private int y;

    Demand(int x, int y){
        this.x = x;
        this.y = y;
    }

    public int getX() {
        return x;
    }
    public int getY() {
        return y;
    }
}


public class Main {

    static void solve(){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int k = sc.nextInt();

        CheckerBoard cb = new CheckerBoard(k);
        ArrayList<Demand> demands = new ArrayList<Demand>();
        HashSet<Integer> xSet = new HashSet<Integer>();
        HashSet<Integer> ySet = new HashSet<Integer>();
        for(int i = 0; i < n; i++){
            int x = sc.nextInt();
            int y = sc.nextInt();
            boolean c = sc.next().endsWith("W");
            x = c ? x+k : x;
            demands.add(new Demand(x % (k*2), y % (k*2)));
            xSet.add((x+k)     % (k*2));
            xSet.add((x+k*2)   % (k*2));
            xSet.add((x+k-1)   % (k*2));
            xSet.add((x+k*2-1) % (k*2));
            ySet.add((y+k)     % (k*2));
            ySet.add((y+k*2)   % (k*2));
            ySet.add((y+k-1)   % (k*2));
            ySet.add((y+k*2-1) % (k*2));
        }

        int max = 0;

        for(int x : xSet){
            cb.setX(x);
            for(int y : ySet){
                cb.setY(y);
                int currentDemandCount = 0;
                for(Demand d : demands){
                    if(cb.checkPatternBoolean(d.getX(), d.getY())){
                        currentDemandCount++;
                    }
                }
                if(currentDemandCount > max){
                    max = currentDemandCount;
                }
            }
        }

        System.out.println(max);
    }

    public static void main(String[] args){
        solve();
    }
}