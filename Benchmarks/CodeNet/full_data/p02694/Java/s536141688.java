import java.util.*;
class Main {
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        long x = scan.nextLong();
        long y = 100;
        int year = 0;
        outloop:for(int i = 1; ;i++){
            y = y + (y/100);
            if (y>=x){
                year = i;
                break outloop;
            }
        }
        System.out.println(year);
        }
        }