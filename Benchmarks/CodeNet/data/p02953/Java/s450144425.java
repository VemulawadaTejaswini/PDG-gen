import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num = Integer.parseInt(sc.nextLine());
        String block = sc.nextLine();
        check(num, block);
    }

    public static void check(int num, String block) {
        String[] blocks = block.split(" ");
        boolean result = false;
        if(num==1) {
            System.out.println("Yes");
            return;
        }

        for(int i=1;i<num-1;i++) {
            if(Integer.parseInt(blocks[i-1])-1 <= Integer.parseInt(blocks[i])) {
                //NOP
                result = true;
            } else {
                result = false;
            }
        }

        System.out.println(result ? "Yes":"No");
    }
}