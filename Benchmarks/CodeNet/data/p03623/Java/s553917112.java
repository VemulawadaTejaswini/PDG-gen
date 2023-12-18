public class Main {

    public static void main(String[] args) {
        int x = 5, a =2 , b = 7;
        String res= Math.abs(x-a) < Math.abs(x-b) ? "A" : "B";
        System.out.println(res);
    }
}