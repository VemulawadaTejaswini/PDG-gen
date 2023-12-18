public class Main {

    public static void main(String[] args) throws Exception {
//        System.out.println("Hello World!");
        int count = 0;
        while (true) {
            char c = (char) System.in.read();
            if (c == '\n') {
                break;
            } else if (c == 'T') {
                count = 0;
            } else { // 'S'
                count += 1;
            }
        }
        System.out.println(count);
    }
}