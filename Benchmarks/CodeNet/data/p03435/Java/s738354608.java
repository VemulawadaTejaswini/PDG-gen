import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int[] i1 = new int[3];
        int[] i2 = new int[3];
        int[] i3 = new int[3];
        
        for (int i = 0; i < 3; i++) {
            i1[i] = sc.nextInt();
        }
        for (int i = 0; i < 3; i++) {
            i2[i] = sc.nextInt();
        }
        for (int i = 0; i < 3; i++) {
            i3[i] = sc.nextInt();
        }
        
        int diff21 = i2[0] - i1[0];
        int diff31 = i3[0] - i1[0];
        
        if (i2[1] - i1[1] == diff21 && i2[2] - i1[2] == diff21 &&
                i3[1] - i1[1] == diff31 && i3[2] - i1[2] == diff31) {
            System.out.println("Yes");
            
        } else {
            System.out.println("No");
            
        }
    }
}