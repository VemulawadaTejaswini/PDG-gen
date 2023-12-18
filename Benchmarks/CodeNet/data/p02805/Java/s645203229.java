import java.util.*;
import java.io.*;

class Main{
    public static void main(String[] args){
        double delta=0.00000001;
        FastScanner fsc=new FastScanner();
        int n=fsc.nextInt();
        Coordinate.Complex[] c=new Coordinate.Complex[n];
        for(int i=0;i<n;i++){
            double x=fsc.nextInt();
            double y=fsc.nextInt();
            c[i]=new Coordinate.Complex(x, y);
        }
        fsc.close();
        if(n==2){
            System.out.println(Coordinate.Complex.dist(c[0], c[1])/2.);
            return;
        }
        double dmax=0;
        int a=0, b=0;
        for(int i=0;i<n-1;i++){
            for(int j=i+1;j<n;j++){
                double d=Coordinate.Complex.dist(c[i], c[j]);
                if(d>dmax){
                    dmax=d;
                    a=i;
                    b=j;
                }
            }
        }
        dmax/=2.;
        Coordinate.Complex pM=Coordinate.pM(c[a], c[b]);
        boolean in=true;
        for(int i=0;i<n;i++){
            if(Coordinate.Complex.dist(pM, c[i])>=dmax+delta){
                in=false;
                break;
            }
        }
        if(in){
            System.out.println(dmax);
            return;
        }
        double min=Double.MAX_VALUE;
        for(int i=0;i<n-2;i++){
            for(int j=i+1;j<n-1;j++){
                for(int k=j+1;k<n;k++){
                    Coordinate.Complex p=c[i], q=c[j], r=c[k];
                    Coordinate.Complex pO=Coordinate.pO(p, q, r);
                    double radius=Coordinate.Complex.dist(pO, p);
                    if(radius>=min){
                        continue;
                    }
                    for(int l=0;l<n;l++){
                        if(radius+delta<Coordinate.Complex.dist(pO, c[l])){
                            continue;
                        }
                    }
                    min=Math.min(min, radius);
                }
            }
        }
        System.out.println(min);
    }

    static class Coordinate{
        private static double DELTA=0.0000001;
        private static double P_INF=1e100;
        private static double N_INF=-1e100;
        private static double NaN=Double.NaN;
    
        public static double innerProduct(Complex u, Complex v){
            return u.x*v.x+u.y+v.y;
        }
        public static double outerProductZ(Complex u, Complex v){
            return u.x*v.y-u.y*v.x;
        }
    
        public static Complex pM(Complex a, Complex b){
            return Complex.div(Complex.add(a, b), 2.);
        }
        public static Complex internalDivision(Complex a, Complex b, int m, int n){
            return Complex.div(Complex.add(Complex.mul(a, n), Complex.mul(b, m)), m+n);
        }
        public static Complex externalDivision(Complex a, Complex b, int m, int n){
            return internalDivision(a, b, -m, n);
        }
    
        public static Complex pG(Complex a, Complex b, Complex c){
            return Complex.div(Complex.add(a, b, c), 3.); 
        }
        public static Complex pH(Complex a, Complex b, Complex c){
            Complex pO=pO(a, b, c);
            return Complex.add(Complex.sub(a, pO), Complex.sub(b, pO), Complex.sub(c, pO), pO);
        }
        public static Complex pI(Complex a, Complex b, Complex c){
            double la=Complex.dist(b, c);
            double lb=Complex.dist(c, a);
            double lc=Complex.dist(a, b);
            return Complex.div(Complex.add(Complex.mul(a, la), Complex.mul(b, lb), Complex.mul(c, lc)), la + lb + lc);
        }
        public static Complex pO(Complex a, Complex b, Complex c){
            double la=Complex.dist(b, c); la*=la;
            double lb=Complex.dist(c, a); lb*=lb;
            double lc=Complex.dist(a, b); lc*=lc;
            double sa=la*(lb+lc-la);
            double sb=lb*(lc+la-lb);
            double sc=lc*(la+lb-lc);
            return Complex.div(Complex.add(Complex.mul(a, sa), Complex.mul(b, sb), Complex.mul(c, sc)), sa+sb+sc);
        }
        public static Complex[] pIabc(Complex a, Complex b, Complex c){
            Complex[] pIabc=new Complex[3];
            pIabc[0]=pI(Complex.mul(a, -1.), b, c);
            pIabc[1]=pI(a, Complex.mul(b, -1.), c);
            pIabc[2]=pI(a, b, Complex.mul(c, -1.));
            return pIabc;
        }
    
        public static boolean onLine(Line l, Complex c){
            return Math.abs(l.a*c.x+l.b*c.y+l.c)<DELTA && c.x>=l.lx && c.x<=l.rx && c.y>=l.ly && c.y<=l.ry;
        }
    
        public static boolean oneLine(Complex a, Complex b, Complex... c){
            for(Complex z:c){
                if(Complex.PI-arg(a, b, z)>=0.0000001){
                    return false;
                }
            }
            return true;
        }
    
        public static double dist(Line l, Complex c){
            return Math.abs(l.a*c.x+l.b*c.y+l.c);
        }
    
        public static Complex crossPoint(Line l1, Line l2){
            Complex o=l1.begin;
            Complex v1=Complex.sub(l1.end, o);
            Complex v2=Complex.sub(l2.begin, o);
            Complex v3=Complex.sub(l2.end, o);
            double opz12=Coordinate.outerProductZ(v1, v2);
            double opz13=Coordinate.outerProductZ(v1, v3);
            if((opz12>0 && opz13>0) || (opz12<0 && opz13<0)){
                return null;
            }
            double p=l1.a*l2.b-l2.a*l1.b;
            double qx=l1.b*l2.c-l2.b*l1.c;
            double qy=l2.a*l1.c-l1.a*l2.c;
            if(Math.abs(p)<=DELTA){
                if(Math.abs(qx)<=DELTA && Math.abs(qy) <= DELTA){
                    return new Complex(NaN, NaN);
                } else{
                    return new Complex(P_INF, P_INF);
                }
            } else{
                return new Complex(qx/p, qy/p);
            }
        }
    
        public static Complex[] crossPoint(Circle c, Line l){
            double d=dist(l, c.c);
            if(c.r<d){
                return null;
            } else if(c.r-d<DELTA){
                Complex v=Complex.mul(new Complex(l.a, l.b), c.r);
                Complex p=onLine(l, Complex.add(c.c, v))?Complex.add(c.c, v):Complex.sub(c.c, v);
                Complex[] ret={p};
                return ret;
            } else{
                if(c.in(l.begin) && c.in(l.end)){
                    return null;
                } else {
                    ArrayList<Complex> cross=new ArrayList<>();
                    Complex v=Complex.mul(new Complex(l.a, l.b), d);
                    for(int i=0;i<2;i++){
                        Complex h=i==0?Complex.add(c.c, v):Complex.sub(c.c, v);
                        for(int j=0;j<2;j++){
                            Complex mov=j==0?new Complex(-l.b, l.a):new Complex(l.b, -l.a);
                            Complex p=Complex.add(h, mov);
                            if(onLine(l, p)){
                                cross.add(p);
                            }
                        }
                    }
                    return (Complex[]) cross.toArray();
                }
            }
        }
    
        public static Complex[] crossPoint(Circle c1, Circle c2){
            double d=Complex.dist(c1.c, c2.c);
            if(d>c1.r+c2.r+DELTA){
                return null;
            } else if(Math.abs(c1.r+c2.r-d)<=DELTA){
                Complex[] ret={Complex.mul(Complex.sub(c2.c, c1.c), c1.r/d)};
                return ret;
            } else if(d>Math.abs(c1.r-c2.r)+DELTA){
                double a=c1.r, b=c2.r;
                double l=(a+b+d)*(a+b-d)*(a-b+d)*(-a+b+d)/(4*d*d);
                Complex h=Complex.mul(Complex.sub(c2.c, c1.c), (d*d+a*a-b*b)/(2*d*d));
                Line line=Line.create(c1.c, c2.c, false, false);
                Complex mov=Complex.mul(new Complex(line.b, -line.a), l);
                Complex[] ret={Complex.add(h, mov), Complex.sub(h, mov)};
                return ret;
            } else if(Math.abs(Math.abs(c1.r-c2.r)-d)<=DELTA){
                if(c1.r>c2.r){
                    Complex[] ret={Complex.mul(Complex.sub(c2.c, c1.c), c1.r/d)};
                    return ret;
                } else if(c1.r<c2.r){
                    Complex[] ret={Complex.mul(Complex.sub(c1.c, c2.c), c2.r/d)};
                    return ret;
                } else{
                    Complex[] ret={new Complex(NaN, NaN)};
                    return ret;
                }
            } else{
                return null;
            }
        }
    
        public static double arg(Complex a, Complex b, Complex c){
            double arg=Complex.arg(Complex.div(Complex.sub(c, b), Complex.sub(a, b)));
            if(arg<0){
                arg*=-1.;
            }
            return arg;
        }
    
        static class Circle{
            public Complex c;
            public double r;
             
            public Circle(Complex center, double radius){
                this.c=center;
                this.r=Math.abs(radius);
            }
    
            public boolean inon(Complex z){
                return Complex.dist(c, z) <= r + DELTA;
            }
            public boolean in(Complex z){
                return Complex.dist(c, z) < r-DELTA;
            }
            public boolean on(Complex z){
                return inon(z) && !in(z);
            }
        }
    
        static class Line{
            // a*a+b*b=1.
            public double a, b ,c;
            public double t;
            public double lx, rx, ly, ry;
            public Complex begin, end;
    
            public static Line create(Complex a, Complex b, boolean extendA, boolean extendB){
                if(a.x>b.x){
                    return new Line(b, a, extendB, extendA);
                } else {
                    return new Line(a, b, extendA, extendB);
                }
            }
    
            private Line(Complex a, Complex b, boolean extendA, boolean extendB){
                this.a=b.y-a.y;
                this.b=a.x-b.x;
                this.c=-a.x*b.y+b.x*a.y;
                double hp=Math.hypot(this.a, this.b);
                this.a/=hp;
                this.b/=hp;
                this.c/=hp;
                if(a.x==b.x){
                    this.t=P_INF;
                    if(a.y<b.y){
                        if(!extendA){
                            this.begin=a.clone();
                            this.lx=a.x;
                            this.ly=a.y;
                        } else{
                            this.begin=new Complex(this.lx=a.x, this.ly=N_INF);
                        }
                        if(!extendB){
                            this.end=b.clone();
                            this.rx=b.x;
                            this.ry=b.y;
                        } else{
                            this.end=new Complex(this.rx=b.x, this.ry=P_INF);
                        }
                    }
                } else {
                    this.t=(b.y-a.y)/(b.x-a.x);
                    if(!extendA){
                        this.begin=a.clone();
                        this.lx=a.x;
                        this.ly=a.y;
                    } else{
                        if(t>0){
                            if(t>=1.){
                                this.begin=new Complex(this.lx=x(N_INF), this.ly=N_INF);
                            } else{
                                this.begin=new Complex(this.lx=N_INF, this.ly=y(N_INF));
                            }
                        } else{
                            if(t<=-1.){
                                this.begin=new Complex(this.lx=x(P_INF), this.ly=P_INF);
                            } else{
                                this.begin=new Complex(this.lx=N_INF, this.ly=y(N_INF));
                            }
                        }
                    }
                    if(!extendB){
                        this.end=b.clone();
                        this.rx=b.x;
                        this.ry=b.y;
                    } else{
                        if(t>0){
                            if(t>=1.){
                                this.begin=new Complex(this.rx=x(P_INF), this.ry=P_INF);
                            } else{
                                this.begin=new Complex(this.rx=P_INF, this.ry=y(P_INF));
                            }
                        } else{
                            if(t<=-1.){
                                this.begin=new Complex(this.rx=x(N_INF), this.ry=N_INF);
                            } else{
                                this.begin=new Complex(this.rx=P_INF, this.ry=y(P_INF));
                            }
                        }
                    }
                }
            }
            
            private double x(double y){
                return -(b*y+c)/a;
            }
            private double y(double x){
                return -(a*x+c)/b;
            }
        }
    
        static class Complex implements Cloneable{
    
            public static final double PI=Math.PI;
            public static final Complex I=new Complex(0, 1);
            public static final Complex ZERO=new Complex(0, 0);
            public static final Complex ONE=new Complex(1, 0);
        
            public double x;
            public double y;
            public double r;
            public double theta;
        
            public Complex(double x, double y){
                this.x=x;
                this.y=y;
                this.r=Math.hypot(x, y);
                this.theta=Math.atan2(y, x);
            }
            public Complex(double r, double theta, boolean radian){
                this.r=r;
                if(radian){
                    this.theta=theta;
                } else{
                    this.theta=Math.toRadians(theta);
                }
                this.x=this.r*Math.cos(this.theta);
                this.y=this.r*Math.sin(this.theta);
            }
            public Complex(double theta, boolean radian){
                this(1., theta, radian);
            }
        
            private double re(){
                return x;
            }
            private double im(){
                return y;
            }
            private double abs(){
                return r;
            }
            private double arg(){
                return theta;
            }
            private Complex conj(){
                return new Complex(x, -y);
            }
            private double sin(){
                return Math.sin(arg());
            }
            private double cos(){
                return Math.cos(arg());
            }
            private double tan(){
                return Math.tan(arg());
            }
            private Complex rot(double phi, boolean radian){
                return new Complex(r, theta+(radian?phi:Math.toRadians(phi)), true);
            }
            private Complex exp(int n){
                return new Complex(Math.pow(r, n), theta*n, true);
            }
            private double dist(Complex c){
                return abs(this.sub(c));
            }
        
            private Complex add(Complex c){
                return new Complex(x+c.x, y+c.y);
            }
            private Complex sub(Complex c){
                return new Complex(x-c.x, y-c.y);
            }
            private Complex mul(Complex c){
                return new Complex(x*c.x-y*c.y, x*c.y+y*c.x);
            }
            private Complex div(Complex c){
                double retx, rety;
                if(c.equals(ZERO)){
                    if(x>0){
                        retx=Double.POSITIVE_INFINITY;
                    } else if(x<0){
                        retx=Double.NEGATIVE_INFINITY;
                    } else{
                        retx=NaN;
                    }
                    if(y>0){
                        rety=Double.POSITIVE_INFINITY;
                    } else if(y<0){
                        rety=Double.NEGATIVE_INFINITY;
                    } else{
                        rety=NaN;
                    }
                    return new Complex(retx, rety);
                }
                return mul(div(this, c.r), new Complex(-c.theta, true));
            }
        
            private Complex add(double r){
                return new Complex(x+r, y);
            }
            private Complex sub(double r){
                return new Complex(x-r, y);
            }
            private Complex mul(double r){
                return new Complex(x*r, y*r);
            }
            private Complex div(double r){
                return new Complex(x/r, y/r);
            }
        
            public static Complex conj(Complex c){
                return c.conj();
            }
            public static double re(Complex c){
                return c.re();
            }
            public static double im(Complex c){
                return c.im();
            }
            public static double abs(Complex c){
                return c.abs();
            }
            public static double arg(Complex c){
                return c.arg();
            }
            public static double sin(Complex c){
                return c.sin();
            }
            public static double cos(Complex c){
                return c.cos();
            }
            public static double tan(Complex c){
                return c.tan();
            }
            public static Complex rot(Complex c, double phi, boolean radian){
                return c.rot(phi, radian);
            }
            public static Complex exp(Complex c, int n){
                return c.exp(n);
            }
            public static double dist(Complex a, Complex b){
                return a.dist(b);
            }
            public static Complex[] nthRoot(int n){
                Complex[] ret=new Complex[n];
                for(int i=0;i<n;i++){
                    ret[i]=new Complex(2.*PI*i/n, true);
                }
                return ret;
            }
        
            public static Complex add(Complex a, Complex... c){
                Complex ret=a.clone();
                for(Complex b:c){
                    ret=ret.add(b);
                }
                return ret;
            }
            public static Complex sub(Complex a, Complex... c){
                Complex ret=a.clone();
                for(Complex b:c){
                    ret=ret.sub(b);
                }
                return ret;
            }
            public static Complex mul(Complex a, Complex... c){
                Complex ret=a.clone();
                for(Complex b:c){
                    ret=ret.mul(b);
                }
                return ret;
            }
            public static Complex div(Complex a, Complex... c){
                Complex ret=a.clone();
                for(Complex b:c){
                    ret=ret.div(b);
                }
                return ret;
            }
        
            public static Complex add(Complex a, double r, Complex... c){
                return add(a.add(r), c);
            }
            public static Complex sub(Complex a, double r, Complex... c){
                return sub(a.sub(r), c);
            }
            public static Complex mul(Complex a, double r, Complex... c){
                return mul(a.mul(r), c);
            }
            public static Complex div(Complex a, double r, Complex... c){
                return div(a.div(r), c);
            }
        
            private Complex(double x, double y, double r, double theta){
                this.x=x;
                this.y=y;
                this.r=r;
                this.theta=theta;
            }
        
            @Override 
            public Complex clone(){
                return new Complex(this.x, this.y, this.r, this.theta);
            }
            @Override
            public boolean equals(Object o){
                if(o instanceof Complex){
                    Complex c=(Complex) o;
                    if(c.x==this.x && c.y==this.y && c.r==this.r && c.theta==this.theta){
                        return true;
                    } else{
                        return false;
                    }
                } else{
                    return false;
                }
            }
            @Override
            public int hashCode(){
                return Objects.hash(x, y, r, theta);
            }
            @Override
            public String toString(){
                return "(x, y) = ("+x+", "+y+"), (r, theta) = ("+r+", "+theta+").";
            }
        }
    }
    
    static class FastScanner {
        private final InputStream in = System.in;
        private final byte[] buffer = new byte[1024];
        private int ptr = 0;
        private int buflen = 0;
        private boolean hasNextByte(){
            if(ptr<buflen) return true;
            else{
                ptr = 0;
                try{
                    buflen = in.read(buffer);
                }
                catch(IOException e){
                    e.printStackTrace();
                }
                if(buflen<=0) return false;
            }
        return true;
        }
        private int readByte() { if (hasNextByte()) return buffer[ptr++]; else return -1;}
        private static boolean isPrintableChar(int c) { return 33 <= c && c <= 126;}
        public boolean hasNext() { while(hasNextByte() && !isPrintableChar(buffer[ptr])) ptr++; return hasNextByte();}
        public String next() {
            if (!hasNext()) throw new NoSuchElementException();
            StringBuilder sb = new StringBuilder();
            int b = readByte();
            while(isPrintableChar(b)) {
                sb.appendCodePoint(b);
                b = readByte();
            }
            return sb.toString();
        }
        public long nextLong() {
            if (!hasNext()) throw new NoSuchElementException();
            long n = 0;
            boolean minus = false;
            int b = readByte();
            if (b == '-') {
                minus = true;
                b = readByte();
            }
            if (b < '0' || '9' < b) throw new NumberFormatException();
            while(true){
                if ('0' <= b && b <= '9') {
                    n *= 10;
                    n += b - '0';
                }
                else if(b == -1 || !isPrintableChar(b)) return minus ? -n : n;
                else throw new NumberFormatException();
                b = readByte();
            }
        }
        public int nextInt() {
            long nl = nextLong();
            if (nl < Integer.MIN_VALUE || nl > Integer.MAX_VALUE) throw new NumberFormatException();
            return (int) nl;
        }
        public double nextDouble() { return Double.parseDouble(next());}
        public void close(){
            try{in.close();}
            catch(IOException e){e.printStackTrace();}
        }
    }
}
