import java.util.*;
class Main{
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int h=in.nextInt(),w = in.nextInt();
        in.nextLine();
        StringBuilder pad = new StringBuilder();
        for(int i=0;i<w+2;i++) pad.append("#");
        System.out.println(pad);
        for(int i=0;i<h;i++){
            String temp = in.nextLine();
            System.out.println("#"+temp+"#");
        }
        System.out.println(pad);
    }
}