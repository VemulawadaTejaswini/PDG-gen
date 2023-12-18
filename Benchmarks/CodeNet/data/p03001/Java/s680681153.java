
import java.util.Scanner;
public class Main{
    static class song{
        public  song(long a, long b){
            this.a = a;
            this.b = b;
        }
       long a;
        long b;

    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double w = sc.nextDouble();
        double h = sc.nextDouble();
        double x = sc.nextDouble();
        double y = sc.nextDouble();
        int lines = 0;
        if(h/2==y && w/2==x){
            lines=1;
        }
        double res = (w * h)/2;
        System.out.println(res+" "+lines);
        }


//        int i = 0;
//        while(true){
//            if(sc.hasNextLine()!=true){
//                sc.close();
//                break;
//            }
//            String str = sc.nextLine();
//            i++;
//            System.out.println(i+" "+str);
//        }
    }

