public class Main {
    
    public static void main(String[] args) {
        System.out.println("start test");
        String[] strings = new String[2];
        strings[0] = args[0];
        strings[1] = args[1];
        int a = Integer.valueOf(strings[0]);
        int b = Integer.valueOf(strings[1]);
        int c = b / a;
        
        if(c == 0) {
            System.out.println(a + b);
        } else {
            System.out.println(b - a);
        }
    }
}