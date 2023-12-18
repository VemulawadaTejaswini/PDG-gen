import java.util.*;
class Main {
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        int k = scan.nextInt();
        int a = scan.nextInt();
        int b = scan.nextInt();
        String ans = "NG";
        outloop:for (int i = 1 ; i*k<=b ; i++){
            if ( (i*k>=a)&&(i*k<=b)){
                ans = "OK";
                break outloop;
            }
        }
        System.out.println(ans);
        }
        }