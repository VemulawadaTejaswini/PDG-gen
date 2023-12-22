import java.util.Scanner;

class Main{
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        int m, f, r;
        while(true){
            m = scan.nextInt();
            f = scan.nextInt();
            r = scan.nextInt();
            if(m < 0 && f < 0 && r < 0) break;
            System.out.println(calcGrade(m, f, r));
        }
    }
    public static char calcGrade(int m, int f, int r){
        if(m < 0 || f < 0) return 'F';
        if(m + f >= 80){ return 'A'; }
        else if(m + f >= 65){ return 'B'; }
        else if(m + f >= 50){ return 'C'; }
        else if(m + f >= 30){
            if(r >= 50){ return 'C'; }else{ return 'D'; }
        }
        return 'F';
    }
}
