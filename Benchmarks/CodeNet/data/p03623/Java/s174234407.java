public class Main {

    public static void main(String[] args) {
        int x = 5, a =2 , b = 7;
        simpleDist(x, a, b);

    }

    private static void simpleDist(int x, int a, int b) {
        int max = 1000, min =1;
        if ((x <= max && a<=max && b<=max) && (x >= min && a >=min && b>=min)  ){
            String res= Math.abs(x-a) < Math.abs(x-b) ? "A" : "B";
            System.out.println(res);
        }
    }
}