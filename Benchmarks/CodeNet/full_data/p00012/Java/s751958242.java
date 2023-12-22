/*
  3点a, b, cと、pとの距離を測る。
  また、各頂点とpを通る直線と対辺との交点の距離も測る。
  ap, bp, cpの方が短ければ、pは三角形の内部に存在する。
*/


import java.util.*;
public class Main{
    public static void main(String[] args){
	new Main().run();
    }
    Scanner sc = new Scanner(System.in);
    Line line;

    void run(){
	while(sc.hasNext()){
	    line = new Line();
	    solve();
	}
    }

    void solve(){
	boolean ans = true;
	double dis1, dis2;
	
	// x1, y1 とp
	dis1 = line.getDisP(1);
	dis2 = line.getDisA(1);
	ans = ans && (dis1<=dis2);
	//System.out.println("1* "+dis1+" "+dis2);

	// x2, y2 とp
	dis1 = line.getDisP(2);
	dis2 = line.getDisA(2);
	ans = ans && (dis1<=dis2);
	//System.out.println("2* "+dis1+" "+dis2);

	// x3, y3 とp
	dis1 = line.getDisP(3);
	dis2 = line.getDisA(3);
	ans = ans && (dis1<=dis2);
	//System.out.println("3* "+dis1+" "+dis2);

	if(ans) System.out.println("YES");
	else System.out.println("NO");
    }

    class Point{
	double x;
	double y;
	Point(double x, double y){
	    this.x = x;
	    this.y = y;
	}
	double getX(){ return x; }
	double getY(){ return y; }
    }

    class Line{
	Point k1, k2, k3, p;
	Line(){
	    k1 = new Point(sc.nextDouble(), sc.nextDouble());
	    k2 = new Point(sc.nextDouble(), sc.nextDouble());
	    k3 = new Point(sc.nextDouble(), sc.nextDouble());
	    p = new Point(sc.nextDouble(), sc.nextDouble());
	}
	double getA(double x1, double y1, double x2, double y2){
	    if(x1-x2 == 0)
		return 0;
	    return (y1-y2)/(x1-x2);
	}
	double getB(double x1, double y1, double x2, double y2){
	    if(x1-x2 == 0)
		return 0;
	    return y2-(y1-y2)/(x1-x2)*x2;
	}
	double getDisP(int i){
	    double a1 = 0;
	    double b1 = 0;
	    double a2 = p.getX();
	    double b2 = p.getY();
	    if(i==1){
		a1 = k1.getX();
		b1 = k1.getY();
	    }
	    else if(i==2){
		a1 = k2.getX();
		b1 = k2.getY();
	    }
	    else{
		a1 = k3.getX();
		b1 = k3.getY();
	    }
	    return getDis(a1, b1, a2, b2);	
	}

	double getDisA(int i){
	    double a=0, b=0, ap=0, bp=0, o=0, q=0, r=0, s=0;
	    if(i==1){
		ap = getA(k1.getX(), k1.getY(), p.getX(), p.getY());
		bp = getB(k1.getX(), k1.getY(), p.getX(), p.getY());
		a = getA(k2.getX(), k2.getY(), k3.getX(), k3.getY());
		b = getB(k2.getX(), k2.getY(), k3.getX(), k3.getY());
		
		o = k1.getX();
		q = k1.getY();
		if(ap==0 && bp==0){
		    if(k1.getX()-p.getX()==0  && k1.getY()-p.getY()!=0){
			r = k1.getX();
			s = a*r -b;
		    }
		    else if(k1.getY()-p.getY()==0){
			s = k1.getY();
			r = (b-s)/a;
		    }
		}
		else if(a==0 && b==0){
		    if(k2.getX()-k3.getX()==0  && k2.getY()-k3.getY()!=0){
			r = k2.getX();
			s = ap*r -bp;
		    }
		    else if(k2.getY()-k3.getY()==0){
			s = k2.getY();
			r = (bp-s)/ap;
		    }
		}
		else if(ap-a != 0){
		    r = (b-bp)/(ap-a);
		    s = (ap*b-a*bp)/(ap-a);
		}
	    }
	    else if(i==2){
		ap = getA(k2.getX(), k2.getY(), p.getX(), p.getY());
		bp = getB(k2.getX(), k2.getY(), p.getX(), p.getY());
		a = getA(k1.getX(), k1.getY(), k3.getX(), k3.getY());
		b = getB(k1.getX(), k1.getY(), k3.getX(), k3.getY());
		
		o = k2.getX();
		q = k2.getY();
		
		if(ap==0 && bp==0){
		    if(k2.getX()-p.getX()==0  && k2.getY()-p.getY()!=0){
			r = k2.getX();
			s = a*r -b;
		    }
		    else if(k2.getY()-p.getY()==0){
			s = k2.getY();
			r = (b-s)/a;
		    }
		}
		else if(a==0 && b==0){
		    if(k1.getX()-k3.getX()==0  && k1.getY()-k3.getY()!=0){
			r = k1.getX();
			s = ap*r -bp;
		    }
		    else if(k1.getY()-k3.getY()==0){
			s = k1.getY();
			r = (bp-s)/ap;
		    }
		}
		else if(ap-a != 0){
		    r = (b-bp)/(ap-a);
		    s = (ap*b-a*bp)/(ap-a);
		}
	    }
	    else{
		ap = getA(k3.getX(), k3.getY(), p.getX(), p.getY());
		bp = getB(k3.getX(), k3.getY(), p.getX(), p.getY());
		a = getA(k1.getX(), k1.getY(), k2.getX(), k2.getY());
		b = getB(k1.getX(), k1.getY(), k2.getX(), k2.getY());
		
		o = k3.getX();
		q = k3.getY();
		
		if(ap==0 && bp==0){
		    if(k3.getX()-p.getX()==0  && k3.getY()-p.getY()!=0){
			r = k3.getX();
			s = a*r -b;
		    }
		    else if(k3.getY()-p.getY()==0){
			s = k3.getY();
			r = (b-s)/a;
		    }
		}
		else if(a==0 && b==0){		
		    if(k1.getX()-k2.getX()==0  && k1.getY()-k2.getY()!=0){
			r = k2.getX();
			s = ap*r -bp;
		    }
		    else if(k1.getY()-k2.getY()==0){
			s = k2.getY();
			r = (bp-s)/ap;
		    }
		}
		else if(ap-a != 0){
		    r = (b-bp)/(ap-a);
		    s = (ap*b-a*bp)/(ap-a);
		}
	    }
	    //System.out.println("ap, bp, a, b : "+ap+" "+bp+" "+a+" "+b);
	    //System.out.println("o, q, r, s : "+o+" "+q+" "+r+" "+s);
	    return getDis(o, q, r, s);
	}
	double getDis(double a1, double b1, double a2, double b2){
	    return (a1-a2)*(a1-a2)+(b1-b2)*(b1-b2);
	}
    }
}