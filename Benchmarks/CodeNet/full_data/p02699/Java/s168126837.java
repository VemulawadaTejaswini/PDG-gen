public class Atcoder{

    public static void main(String[] args) {
        
        int n1 = Integer.parseInt(args[0]);
        int n2 = Integer.parseInt(args[1]);

        if (n2 >= n1) System.out.println("unsafe");
        else System.out.println("safe");
    }
}
