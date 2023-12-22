import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        while(true) {
            String str = scn.next();
            if(str.equals("0")) break;
            int i = 0;
            int sum = 0;
            for(i = 0; i < str.length(); i++){
                String st = str.substring(i,i + 1);
                sum =  sum + Integer.parseInt(st);
            }
            System.out.println(sum);
        }
    }
}
