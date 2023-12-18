import java.util.*;
import java.lang.*;

public class Main{

    static long mod = 1000000007;
	public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        int k = sc.nextInt();
        int x = sc.nextInt();
        int xs = x/Math.abs(x);
        int y = sc.nextInt();
        int ys = y/Math.abs(y);

        x = Math.abs(x);
        y = Math.abs(y);

        int rTot = (x+y)%k;
        int n = (x+y)/k;
        int s = (k - rTot)/2;
        
        if(x+y<k){
            if(s%2==0){
                System.out.println(3);
                // print ans
                System.out.println((k*xs*-1)+" 0");
                System.out.println(((y+s)*xs*-1)+" "+(ys*(y+s)));
                System.out.println(x*xs+" "+y*ys);

            }else{
                System.out.println(-1);
            }
        }else if(x+y==k){
            System.out.println(1);
            // Single step ans
            System.out.println((x*xs)+" "+(y*ys));

        }else{
            if(rTot != 0 && (k-rTot)%2==1){
                System.out.println(-1);
            }else{
                // print initial ans (first n-1 steps)
                int r1 = x%k;
                int r2 = y%k;

                if(rTot == 0){
                    System.out.println(n);
                    
                }else{
                    System.out.println(n+1);
                }

                int fin = 0;
                int lim = ((r1>r2)?x/k-1:x/k);
                for(int i=0;i<lim;i++){
                    fin = xs*(k*(i+1));
                    System.out.println(fin+" 0");
                }

                lim = ((r1>r2)?y/k:y/k-1);
                if(rTot==0)lim+=1;
                int finy = 0;
                for(int i=0;i<lim;i++){
                    finy = ys*(k*(i+1));
                    System.out.println(fin+" "+finy);
                }

                if(rTot!=0){
                    // print last 2 steps using s. we have fin and finy
                    if(r1<=r2){
                        finy = ys*(k-Math.abs(xs*(x+s) - fin))+finy;
                        fin = xs*(x+s);
                        System.out.println(fin+" "+finy);
                        System.out.println(xs*x+" "+ys*y);
                    }else{
                        fin = xs*(k-Math.abs(ys*(y+s) - finy))+fin;
                        finy = ys*(y + s);
                        System.out.println(fin+" "+finy);
                        System.out.println(xs*x+" "+ys*y);
                    }


                }
            }
        }

        

        

        
        
        sc.close();
	}
}