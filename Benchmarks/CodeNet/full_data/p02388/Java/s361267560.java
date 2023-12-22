public class Main {
    public static void main(String[] args){
        int x = Integer.parseInt(args[0])
        if (x < 0 || x > 100) {
            return -1;
        }
        return x*x*x;
    }
}

