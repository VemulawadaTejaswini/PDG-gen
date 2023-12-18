import java.util.*;
class Main {
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        double x = scan.nextInt();
        double y = 100.0;
        int year = 0;
        outloop:for(int i = 0; ;i++){
            y = y + (0.01)*y;
            y = Math.floor(y);
            if (y>=x){
                year = i;
                break outloop;
            }
        }
        System.out.println(year);
        }
        }