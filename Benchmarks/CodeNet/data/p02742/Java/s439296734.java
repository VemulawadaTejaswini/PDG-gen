import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner sn = new Scanner(System.in);
        String HW = sn.nextLine();
        long h = Integer.parseInt(HW.split(" ")[0]);
        long w = Integer.parseInt(HW.split(" ")[1]);
        if (h == 1 && w == 1) {
            System.out.println(1);
        } else {
            if(h%2 == 0 && w%2 == 0){
                System.out.println(((long)h * (long)w) / 2);
            }else{
                System.out.println(((long)h * (long)w) / 2 + 1);
            }
        }

    }
}