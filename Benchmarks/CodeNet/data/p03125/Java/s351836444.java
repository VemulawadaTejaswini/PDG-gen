public class Main {
    
    public static void main(int arg[]) {
        System.out.println("start test");
        //約数のとき
        int a = arg[0];
        int b = arg[1];
        int c = b / a;
        
        if(c == 0) {
            System.out.println(a + b);
        } else {
        //約数でない時
            System.out.println(b - a);
        }
    }
}