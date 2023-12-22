import java.util.Scanner;
public class Main {
    public static void main(String[] aegs){
        Scanner scan = new java.util.Scanner(System.in);
        for(;;){
            int m = scan.nextInt(); // ???????????????
            int f = scan.nextInt(); // ???????????????
            int r = scan.nextInt(); // ???????¨?
            if(m == -1 && f == -1 && r == -1){
                break;
            }else{
                if(m + f >= 80 && r == -1){
                    System.out.println("A");
                }else if((m + f < 80 && m + f >= 65) && r == -1){
                    System.out.println("B");
                }else if((m + f < 65 && m + f >= 50) && r == -1){
                    System.out.println("C");
                }else if(m + f < 50 && m + f >= 30){
                    if(r >= 50){
                        System.out.println("C");
                    }else{
                        System.out.println("D");
                    }
                }else if((m + f < 30) && r == -1){
                    System.out.println("F");
                }
            }
        }
    }
}