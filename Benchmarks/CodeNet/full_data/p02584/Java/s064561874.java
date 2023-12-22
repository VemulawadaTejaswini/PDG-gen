import java.util.*;
public class Main {
    public static void main(String[] args) {
        Scanner fs = new Scanner(System.in);
        long x = fs.nextLong();
        long k = fs.nextLong();
        long d = fs.nextLong();

        long moves = x/d ;
        moves = Math.abs((Math.min(k,moves)));
        long rem = k - moves;

        if(x>=0){

            long pos = x - moves*d ;
            if(rem%2==1){
                pos = Math.abs(Math.min(pos-d,pos+d));
            }

            System.out.println(Math.abs(pos));


        }else{

            long neg = x + moves*d ;
            if(rem%2==1){
                neg = Math.abs(Math.min(Math.abs(neg-d),neg+d));
            }

            System.out.println(Math.abs(neg));

        }


    }
}
