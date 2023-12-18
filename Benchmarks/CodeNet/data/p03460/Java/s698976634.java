import java.util.*;


public class Main {


    static class CheckerBoard{
        private int patternSize;
        private int patternStartX, patternStartY;

        CheckerBoard(int s){
            this.patternSize = s;
            this.patternStartX = 0;
            this.patternStartY = 0;
        }

        boolean checkPatternBoolean(int x, int y){
            boolean divX, divY;
            if(this.patternStartX >= this.patternSize) {
                divX = x < this.patternStartX || x >= this.patternStartX + this.patternSize;
            }else{
                divX = x < this.patternStartX && x >= this.patternStartX - this.patternSize;
            }
            if(this.patternStartY >= this.patternSize) {
                divY = y < this.patternStartY || y >= this.patternStartY + this.patternSize;
            }else{
                divY = y < this.patternStartY && y >= this.patternStartY - this.patternSize;
            }
            return (divX && divY);
        }

        void rotateX(int x){
            this.patternStartX += x;
        }
        void rotateY(int y){
            this.patternStartY += y;
        }

        int getPatternSize() {
            return patternSize;
        }

        public int getPatternStartX() {
            return patternStartX;
        }

        public int getPatternStartY() {
            return patternStartY;
        }
    }


    static class Demand{
        private int x;
        private int y;

        Demand(int x, int y){
            this.x = x;
            this.y = y;
        }

        int getX() {
            return x;
        }
        int getY() {
            return y;
        }
    }

    static void solve(){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int k = sc.nextInt();

        CheckerBoard cb = new CheckerBoard(k);
        ArrayList<Demand> demands = new ArrayList<Demand>();
        for(int i = 0; i < n; i++){
            int x = sc.nextInt();
            int y = sc.nextInt();
            boolean c = sc.next().equals("B");
            x = c ? ((x+k) % (k*2)) : (x % (k*2));
            y %= k*2;
            demands.add(new Demand(x, y));
        }

        int max = 0;

        for (int x = 0; x < cb.getPatternSize()*2; x++){
            for(int y = 0; y < cb.getPatternSize()*2; y++){
                int currentDemandCount = 0;
                for(Demand d : demands){
                    if(cb.checkPatternBoolean(d.getX(), d.getY())){
                        currentDemandCount++;
                    }
                }
                if(currentDemandCount > max){
                    max = currentDemandCount;
                }
                cb.rotateY(1);
            }
            cb.rotateX(1);
            cb.rotateY(- cb.getPatternSize()*2);
        }

        System.out.println(max);
    }

    public static void main(String[] args){
        solve();
    }
}