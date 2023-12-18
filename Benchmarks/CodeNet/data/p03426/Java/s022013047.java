import java.util.Scanner;
class Pair{
    private int first;
    private int second;
    public Pair(int a, int b){
        first = a;
        second = b;
    }

    public int getFirst() {
        return first;
    }
    public int getSecond(){
        return second;
    }
}
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int h = sc.nextInt();
        int w = sc.nextInt();
        int d = sc.nextInt();
        Pair[] lookup = new Pair[w*h + 1];
        int value;
        for (int i = 0; i < w; i++) {
            for (int j = 0; j < h; j++) {
                value = sc.nextInt();
                lookup[value] = new Pair(i, j);
            }
        }
        int numQueries = sc.nextInt();
        int start, end, previous;
        int previousFirst, previousSecond, currFirst, currSecond;
        int cost;
        for (int i = 0; i < numQueries; i++) {
            cost = 0;
            start = sc.nextInt();
            end = sc.nextInt();
            previous = start;
            for (int j = start + d; j <= end; j += d) {
                previousFirst = lookup[previous].getFirst();
                previousSecond = lookup[previous].getSecond();
                currFirst = lookup[j].getFirst();
                currSecond = lookup[j].getSecond();
                cost += Math.abs(previousFirst - currFirst) + Math.abs(previousSecond - currSecond);
                previous = j;
            }
            System.out.println(cost);
        }
    }
}