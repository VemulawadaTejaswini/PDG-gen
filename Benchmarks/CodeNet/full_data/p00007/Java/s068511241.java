import java.util.*;
public class Main {
    static Scanner sc = new Scanner(System.in);
    static int n;

    public static void main(String[] args){
        while(read()){
            slove();
        }
    }
    static boolean read(){
        if(!sc.hasNext())return false;
        n = sc.nextInt();
        return true;
    }
    static void slove(){
        double Debt = 100000;
        for(int i = 0; i < n; i++){
            Debt = Debt*1.05;
            int r = (int)Debt%1000;
            if(r != 0){
                Debt += 1000;
                Debt -= r;
                //Debt = Math.round(Debt);
            }
        }
        System.out.println((int)Debt);
    }


}