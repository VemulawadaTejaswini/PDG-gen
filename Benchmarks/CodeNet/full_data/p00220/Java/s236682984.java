import java.util.*;

class Main{

    void solve(){
        Scanner sc = new Scanner(System.in);

        while(true){
            double in = sc.nextDouble();
            if(in==-1.0) break;

            in = in * 2 * 2 * 2 * 2;
            if(in%1.0!=0){
                System.out.println("NA");
                continue;
            }

            String bit = Integer.toBinaryString((int)in);
            if(bit.length()>12){
                System.out.println("NA");
                continue;
            }

            String seisu = bit.substring(0, bit.length()-4);
            String syousu = bit.substring(bit.length()-4, bit.length());
            while(seisu.length()<8) seisu = "0" + seisu;

            System.out.println(seisu+"."+syousu);
        }
    }

    public static void main(String[] args){
        new Main().solve();
    }
}