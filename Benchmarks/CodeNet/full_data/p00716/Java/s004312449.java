import java.util.Scanner;

/**
 * Created by Reopard on 2014/05/22.
 */
public class Main {
    static Scanner sc = new Scanner(System.in);
    int initial, year, janre;

    OhgasFortune(int initial, int year, int janre){
        this.initial = initial;
        this.year = year;
        this.janre = janre;
    }


    public static void main(String args[]){
        int m, simpOrComp, commission, tmp, interest, max;
        double rate;
        OhgasFortune o;
        m = sc.nextInt();
        for(int i = 0; i < m; i++){
            max = 0;
            o = new OhgasFortune(sc.nextInt(), sc.nextInt(), sc.nextInt());
            for(int j = 0; j < o.janre; j++){
                tmp = o.initial;
                simpOrComp = sc.nextInt();
                rate = sc.nextDouble();
                commission = sc.nextInt();
                if(simpOrComp == 0){
                    interest = 0;
                    for(int k = 0; k < o.year; k++){
                        interest += tmp * rate;
                        tmp -= commission;
                    }
                    tmp += interest;
                }else{
                    for(int k = 0; k < o.year; k++) tmp += tmp * rate - commission;
                }
                if(max < tmp) max = tmp;
            }
            System.out.println(max);
        }
    }
}