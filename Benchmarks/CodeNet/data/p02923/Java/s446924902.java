import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        logic pos = new logic();
        System.out.println(pos.move());
    }

    public static class logic{
        int num;
        int ans = 0;
        
        private int move(){
            Scanner sc = new Scanner(System.in);
            num = sc.nextInt();
            int mass[] = new int[num];
            for (int i = 0; i < mass.length; i++) {
                mass[i] = sc.nextInt();
            }
            sc.close();
            for (int i = 0; i < mass.length - 1; i++) {
                if (mass[i] >= mass[i + 1]) {
                    ans++;
                }else{
                    ans = 0;
                }
            }
            
            return ans;
        }
    }
}