public class Main {
    
    public static void main(int[] args) {
        System.out.println("start test");
        //約数のとき
        int a = args[0];
        int b = args[1];
        int c = b / a;
        
        if(c == 0) {
            System.out.println(a + b);
        } else {
        //約数でない時
            System.out.println(b - a);
        }
    }
}