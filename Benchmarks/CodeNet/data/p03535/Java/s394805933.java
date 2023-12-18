import java.util.*;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int d[] = new int[n + 1];
        for (int i = 1; i < d.length; i++) {
            d[i] = scanner.nextInt();
        }
        ArrayList<Integer> theVals = new ArrayList<>();
        for (int i = 0; i < d.length; i++) {
            for (int j = i + 1; j < d.length; j++) {
                theVals.add(new Pair(Math.abs(d[i] - d[j]), Math.abs(d[i] + d[j] - 24)).value());
            }
        }
        System.out.println(Collections.min(theVals));
    }
}

class Pair{
    private int a, b;
    Pair(int a, int b){
        if (a == 24) a = 0;
        if (b == 24) b = 0;
        this.a = a; this.b = b;
    }
    int value(){
        return Math.max(a, b);
    }
}