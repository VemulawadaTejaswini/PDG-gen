import java.util.*;

public class Main{
	public void run(){
		Scanner scan = new Scanner(System.in);
		while(true){
			int x1 = scan.nextInt();
			int y1 = scan.nextInt();
			int x2 = scan.nextInt();
			int y2 = scan.nextInt();
			int x3 = scan.nextInt();
			int y3 = scan.nextInt();
			if(x1==0 && y1==0 && x2==0 && y2==0 && x3==0 && y3==0) break;
			double ab = Math.sqrt(Math.pow(x1-x2,2)+Math.pow(y1-y2,2));
			double bc = Math.sqrt(Math.pow(x2-x3,2)+Math.pow(y2-y3,2));
			double ca = Math.sqrt(Math.pow(x3-x1,2)+Math.pow(y3-y1,2));
			double s =  (ab+bc+ca)/2;
			double scale = Math.sqrt(s*(s-ab)*(s-bc)*(s-ca));
			double r = scale/s;
			double h=0;
			double arad=0;
			double brad=0; 
			double crad=0;
			if(ab>=bc && ab>=ca){
				h=2*(scale/ab);
				brad = Math.asin(h/ca);
				crad = Math.asin(h/bc);
				arad = Math.PI-(brad+crad);
			}
			else if(bc>=ab && bc>=ca){
				h=2*(scale/bc);
				arad = Math.asin(h/ca);
				crad = Math.asin(h/ab);
				brad = Math.PI-(arad+crad);
			}
			else if(ca>=ab && ca>=bc){
				h=2*(scale/ca);
				arad = Math.asin(h/bc);
				brad = Math.asin(h/ab);
				crad = Math.PI-(arad+brad);
			}
			double r1 = (r*(1+Math.tan(brad/4))*(1+Math.tan(crad/4)))/(2*(1+Math.tan(arad/4)));
			double r2 = (r*(1+Math.tan(arad/4))*(1+Math.tan(crad/4)))/(2*(1+Math.tan(brad/4)));
			double r3 = (r*(1+Math.tan(arad/4))*(1+Math.tan(brad/4)))/(2*(1+Math.tan(crad/4)));
			//System.out.println(ab+":"+bc+":"+ca);
			//System.out.println("S:"+scale);
			//System.out.println(arad+":"+brad+":"+crad);
			//System.out.println(r);
			System.out.println(r2+" "+r3+" "+r1);
		}
	}

    public static void main(String[] args){
		Main app = new Main();
		app.run();	
    }
}