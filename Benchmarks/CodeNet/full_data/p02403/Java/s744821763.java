import java.util.Scanner;

class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int h, l;

        do {
            h = sc.nextInt();
            l = sc.nextInt();
            
            for (int i=0; i<h; i++){
                for (int j=0; j<l; j++) {
                    System.out.print('#');
                }
                System.out.println();
            }
            
            System.out.println();
            
        } while (h==0 && l==0);
        
        System.out.println();
    }

}