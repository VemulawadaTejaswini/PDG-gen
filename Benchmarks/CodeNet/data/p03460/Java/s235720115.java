import java.util.*;


class CheckerBoard{
    private int patternSize;
    private int patternStartX, patternStartY;

    CheckerBoard(int s){
        this.patternSize = s;
        this.patternStartX = 0;
        this.patternStartY = 0;
    }

    public boolean checkPatternBoolean(int x, int y, boolean b){
        boolean divX = ((x + this.patternStartX) % (this.patternSize * 2)) >= this.patternSize;
        boolean divY = ((y + this.patternStartY) % (this.patternSize * 2)) >= this.patternSize;
        boolean isWhite = (divX == divY);
        if(b == isWhite){
            return true;
        }
        return false;
    }

    public void rotateX(int i){
        this.patternStartX += i;
    }
    public void rotateY(int i){
        this.patternStartY += i;
    }

    public int getPatternSize() {
        return patternSize;
    }

}


class Demand{
    int x;
    int y;
    boolean c;

    Demand(int x, int y, boolean c){
        this.x = x;
        this.y = y;
        this.c = c;
    }

    public int getX() {
        return x;
    }
    public int getY() {
        return y;
    }
    public boolean isC() {
        return c;
    }
}

public class Main {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int k = sc.nextInt();

        CheckerBoard cb = new CheckerBoard(k);
        ArrayList<Demand> demands = new ArrayList<Demand>();
        for(int i = 0; i < n; i++){
            int x = sc.nextInt();
            int y = sc.nextInt();
            boolean c = sc.next().endsWith("W");
            demands.add(new Demand(x, y ,c));
        }

        int max = 0;

        for(int x = 0; x < cb.getPatternSize()+1; x++){
            for(int y = 0; y < cb.getPatternSize()+1; y++){
                int currentDemandCount = 0;
                for(Demand d : demands){
                    if(cb.checkPatternBoolean(d.getX(), d.getY(), d.isC())){

                        currentDemandCount++;
                    }
                }
                if(currentDemandCount == demands.size()){
                    max = currentDemandCount;
                    break;
                }else if(currentDemandCount > max){
                    max = currentDemandCount;
                }
                cb.rotateY(1);
            }
            cb.rotateY(-cb.getPatternSize());
            cb.rotateX(1);
        }

        System.out.println(max);
    }
}
