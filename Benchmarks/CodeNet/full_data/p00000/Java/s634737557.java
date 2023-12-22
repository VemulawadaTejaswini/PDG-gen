import java.io.PrintWriter;

class Main{
    public static void main(String[] a) throw IOException {
        PrintWriter out = new PrintWriter(System.out);
        for(int x: rangeClosed(9)) {
            for(int y: rangeClosed(9)) {
                out.println(x + "x" + y + "=" + x*y);
            }
        }

        out.flush();
    }

    private int[] rangeClosed(int end) {
        int[] array = new int[end];
        int i = 1;
        for(int a: array) {
            a = i;
            i++;
        }

        return array;
    }
}