public class Main {

    public static void main(String[] args) {
        
        System.out.println(
            new Main().calcCost(
                 toInt(args[0])
                ,toInt(args[1])
                ,toInt(args[2])
                ,toInt(args[3])
            )
        );
    }

    public static int toInt (String a) {
        return Integer.parseInt(a);
    }

    private int calcCost(
          final int n
        , final int k
        , final int x
        , final int y) {
        return x * k + y * (n - k);
    }
}