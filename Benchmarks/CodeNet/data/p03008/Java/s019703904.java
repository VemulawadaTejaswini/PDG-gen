import java.util.*;
import java.lang.*;

class Exchange{
    long goldRate, silverRate, bronzeRate;
    public Exchange(long g, long s, long b){
        goldRate=g;
        silverRate=s;
        bronzeRate=b;
    }
    public long mostAcorn(long acorn, Exchange later){
        long ans = 0;
        for(long gold = 0; gold<=acorn/goldRate; gold++){
            long acornForSB = acorn - gold*goldRate;
            for(long silver=0; silver<=acornForSB; silver++){
                long acornForB = acornForSB - silver*silverRate;
                long bronze = this.bronzeRate<later.bronzeRate ? acornForB/this.bronzeRate : 0;
                long acornNoExc = acornForB - bronze*bronzeRate;
                long newAcorn = acornNoExc + gold*later.goldRate + silver*later.silverRate + bronze*later.bronzeRate;
                //System.err.printf("%10d : %10d %10d %10d\n", newAcorn,gold,silver,bronze);

                ans = Math.max(ans, newAcorn);
            }
        }
        return ans;
    }
    public String toString(){
        return "Ex:["+goldRate+" "+silverRate+" "+bronzeRate+"]";
    }
}


public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        long acorn = sc.nextLong();
        Exchange A = new Exchange(sc.nextLong(), sc.nextLong(), sc.nextLong());
        Exchange B = new Exchange(sc.nextLong(), sc.nextLong(), sc.nextLong());

        acorn = A.mostAcorn(acorn, B);
        //System.err.println(acorn);
        acorn = B.mostAcorn(acorn, A);
        System.out.println(acorn);

    }
}