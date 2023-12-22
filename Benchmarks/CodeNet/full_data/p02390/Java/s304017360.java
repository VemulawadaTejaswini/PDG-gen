
import java.util.Scanner;

class Main {
    public void cubic() {
        Scanner sc = new Scanner(System.in);
        int arg = sc.nextInt();

        int i=0;
        int h=0;
        for (i = arg; i >= 3600; h++) {
            i -= 3600;
        }
   //     System.out.println("i="+i);

        int m = 0;
        for (; i >= 60; m++) {
            i -= 60;
        }
                                        
        System.out.println(h+":"+m+":"+i);
    }
    
    public static void main(String[] args){
    new Main().cubic();
    }
}