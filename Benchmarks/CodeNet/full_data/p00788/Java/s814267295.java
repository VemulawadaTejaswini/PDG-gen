import java.awt.geom.Line2D;
import java.awt.geom.Point2D;
import java.awt.geom.Point2D.Double;
import java.util.ArrayList;
import java.util.Scanner;
import java.lang.Object;
 
public class Main {
    Scanner sc = new Scanner(System.in);
   
    public static void main(String[] args) {
        new Main(); 
    }
   
    public Main() {
        new H().doIt();
    }
    class H{
    	int p, n;
    	int x = 0, y = 0, v = 0, u = 0;
    	void sternBrocot(int pl,int ql ,int pr,int qr){
    		int pm = pl+pr, qm = ql+qr;
//    		System.out.println(x+" "+y);
    		//??????
    		if (pm > n || qm > n) return;
    		//??§?????????
    	    if (p*qm*qm < pm*pm) {
    	        u = pm; v = qm;
    	        sternBrocot(pl, ql, pm, qm);
    	    //?°??????????
    	    } else if (p*qm*qm > pm*pm) {
    	        x = pm; y = qm;
    	        sternBrocot(pm, qm, pr, qr);
    	    //?±??????°
    	    } else {
    	        x = u = pm;
    	        y = v = qm;
    	    }
    	}
    	void doIt(){
    		while(true){
    			p = sc.nextInt();
    			n = sc.nextInt();
    			if(p + n == 0)break;
    			//?????????1/1?????¨??????????????????????????????
    			sternBrocot(0,1,1,0);
    			System.out.println(u+"/"+v+" "+x+"/"+y);
    		}
    	}
    }
}