import java.util.Scanner;

public class Main{

    public static void main(String[] args) {

        new Main().solve();
    }

    void solve(){

        int a, b;

        Scanner sc = new Scanner(System.in);
        a = Integer.parseInt(sc.next());
        b = Integer.parseInt(sc.next());
        sc.close();

        double ataxfreemax, ataxfreemin; 
        double btaxfreemax, btaxfreemin;

        ataxfreemax = (a + 1) / 0.08;
        ataxfreemin = a / 0.08;
        btaxfreemax = (b + 1) / 0.1;
        btaxfreemin = b / 0.1;

        int amax, amin;
        if (Math.floor(ataxfreemax) == ataxfreemax){
            amax = (int) ataxfreemax - 1;
        }
        else {
            amax = (int) ataxfreemax;
        }

        if(Math.ceil(ataxfreemin) == ataxfreemin){
            amin = (int) ataxfreemin;
        }
        else{
            amin = (int) ataxfreemin + 1;
        }

        int bmax, bmin;
        if (Math.floor(btaxfreemax) == btaxfreemax){
            bmax = (int) btaxfreemax - 1;
        }
        else {
            bmax = (int) btaxfreemax;
        }

        if(Math.ceil(btaxfreemin) == btaxfreemin){
            bmin = (int) btaxfreemin;
        }
        else{
            bmin = (int) btaxfreemin + 1;
        }

        if(amax>bmax && bmax>amin){
            if(bmin>amin){
                System.out.println(bmin);
            }
            else{
                System.out.println(amin);
            }
        }
        else if(amax>bmin && bmin>amin){
            System.out.println(bmin);
        }
        else if(bmax>amax && amax>bmin){
            if(amin>bmin){
                System.out.println(amin);
            }
            else{
                System.out.println(bmin);
            }
        }
        else if(bmax>amin && amin>bmin){
            System.out.println(amin);
        }
        else{
            System.out.println("-1");
        }
    }
}