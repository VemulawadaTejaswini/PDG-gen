public class XCubic {

    
}
public class Main {
    public static void main(String[] args) {
        run();
    }
static void run () {
        int xc = readInput();
        printCubic(xc);
    }
    static int readInput() {
        Scanner sc = new Scanner(System.in);
        return sc.nextInt();
    }
    static void printCubic (int x){
        System.out.println(x*x*x);
    }
}