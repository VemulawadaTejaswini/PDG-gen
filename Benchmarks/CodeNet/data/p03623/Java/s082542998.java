public class Main {

    public static void main(String[] args) {
        int x = 5, a =2 , b = 7;
        int max = 1000;
        if (x <= max && a<=max && b<=max  ){
            String res= Math.abs(x-a) < Math.abs(x-b) ? "A" : "B";
            System.out.println(res);

        }
    }
}