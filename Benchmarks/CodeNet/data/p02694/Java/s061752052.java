import java.util.*;
class Main {
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        int x = scan.nextInt();
        int y = 100;
        int year = 0;
        outloop:for(int i = 0; ;i++){
            y = y + (0.01)*y;
            if (y>=x){
                year = i;
                break outloop;
            }
        }
        System.out.println(year);
        }
        }