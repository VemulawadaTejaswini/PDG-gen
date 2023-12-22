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
                if(m == -1){
                    notM(m, f, r);
                }
                if(f == -1){
                    notF(m, f, r);
                }
                if(m != -1 && f != -1){
                    Seiseki(m, f, r);
                }
            }
        }
    }
    // m == -1
    public static void notM(int m, int f, int r){
        /*if(f >= 30 && (r == -1 || r < 50)){
            System.out.println("D");
        }else if(f >= 30 && r >= 50){
            System.out.println("c");
        }else if(f < 30 && r == -1){
            System.out.println("F");
        }*/
        System.out.println("F");
    }
    // f == -1
    public static void notF(int m, int f, int r){
        /*if(m >= 30 && (r == -1 || r < 50)){
            System.out.println("D");
        }else if(m >= 30 && r >= 50){
            System.out.println("c");
        }else if(m < 30 && r == -1){
            System.out.println("F");
        }*/
        System.out.println("F");
    }
    // m != -1 && f != -1
    public static void Seiseki(int m, int f, int r){
        if(m + f >= 80 && r == -1){
            System.out.println("A");
        }else if((m + f < 80 && m + f >= 65) && r == -1){
            System.out.println("B");
        }else if((m + f < 65 && m + f >= 50)){
            if(r == -1){
                System.out.println("C");
            }else if(r >= 50){
                System.out.println("C");
            }
        }else if(m + f < 50 && m + f >= 30){
            if(r >= 50){
                System.out.println("C");
            }else{
                System.out.println("D");
            }
        }else if((m + f < 30) && (r == -1 || r >= 0)){
            System.out.println("F");
        }
    }

}