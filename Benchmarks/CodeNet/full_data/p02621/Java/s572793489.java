public class App {
    public static void main(String[] args) throws Exception {
        calc(Integer.parseInt(args[0]));
    }

    public static int calc(int a){
        return a + a*a + a*a*a;
    }
}