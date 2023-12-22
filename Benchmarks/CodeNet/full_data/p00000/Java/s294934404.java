public class Main {
    public static void main(String[] arg){
        int a = 1;
        int b = 1;
        
        for(int i = 0; a < 10 && b < 10; i++){
            System.out.println(a + "x" + b + "=" + (a*b));
            b++;
            if(b == 9 && a < 10) {
                System.out.println(a + "x" + b + "=" + (a*b));
                b = 1;
                a += 1;
            }
        }

    }
}