import java.util.*;
import java.io.*;

class Main{
    public static void main(String[] args){
        FastScanner fsc=new FastScanner();
        int n=fsc.nextInt();
        Coordinate.Line[] lines=new Coordinate.Line[n];
        double[] x=new double[n*(n-1)/2];
        double[] y=new double[n*(n-1)/2];
        for(int i=0;i<n;i++){
            int a=fsc.nextInt();
            int b=fsc.nextInt();
            int c=-fsc.nextInt();
            lines[i]=new Coordinate.Line(a, b, c);
        }
        fsc.close();
        for(int i=0;i<n-1;i++){
            for(int j=i+1;j<n;j++){
                Coordinate.Complex c=Coordinate.crossPoint(lines[i], lines[j]);
                x[i*(n-1)-i*(i-1)/2+j-(i+1)]=c.x;
                y[i*(n-1)-i*(i-1)/2+j-(i+1)]=c.y;
                //System.out.println(c.x+", "+c.y);
            }
        }
        Arrays.sort(x);
        Arrays.sort(y);
        double ax, ay;
        int m=(n*(n-1)/2);
        if(m%2==1){
            ax=x[m/2];
            ay=y[m/2];
        } else{
            ax=x[m/2-1];
            ay=y[m/2-1];
        }
        System.out.println(ax+" "+ay);
    }
    static class Coordinate{
        private static double PI=Math.PI;
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
            if(!isTriangle(a, b, c)){
                return null;
            }
            return Complex.div(Complex.add(a, b, c), 3.); 
        }
        public static Complex pH(Complex a, Complex b, Complex c){
            if(!isTriangle(a, b, c)){
                return null;
            }
            Complex pO=pO(a, b, c);
            return Complex.add(Complex.sub(a, pO), Complex.sub(b, pO), Complex.sub(c, pO), pO);
        }
        public static Complex pI(Complex a, Complex b, Complex c){
            if(!isTriangle(a, b, c)){
                return null;
            }
            double la=Complex.dist(b, c);
            double lb=Complex.dist(c, a);
            double lc=Complex.dist(a, b);
            return Complex.div(Complex.add(Complex.mul(a, la), Complex.mul(b, lb), Complex.mul(c, lc)), la + lb + lc);
        }
        public static Complex pO(Complex a, Complex b, Complex c){
            if(!isTriangle(a, b, c)){
                return null;
            }
            double la=Complex.distSq(b, c);
            double lb=Complex.distSq(c, a);
            double lc=Complex.distSq(a, b);
            double sa=la*(lb+lc-la);
            double sb=lb*(lc+la-lb);
            double sc=lc*(la+lb-lc);
            return Complex.div(Complex.add(Complex.mul(a, sa), Complex.mul(b, sb), Complex.mul(c, sc)), sa+sb+sc);
        }
        public static Complex[] pIabc(Complex a, Complex b, Complex c){
            if(!isTriangle(a, b, c)){
                return null;
            }
            Complex[] pIabc=new Complex[3];
            pIabc[0]=pI(Complex.mul(a, -1.), b, c);
            pIabc[1]=pI(a, Complex.mul(b, -1.), c);
            pIabc[2]=pI(a, b, Complex.mul(c, -1.));
            return pIabc;
        }
    
        public static boolean oneLine(Complex a, Complex b, Complex c){
            if(a.equals(b) || b.equals(c) || c.equals(a)){
                return true;
            }
            double arg=arg(a, b, c);
            return arg<=DELTA || arg>=PI-DELTA;
        }
    
        public static boolean isTriangle(Complex a, Complex b, Complex c){
            return !oneLine(a, b, c);
        }
    
        public static double dist(Line l, Complex c){
            return Math.abs(l.a*c.x+l.b*c.y+l.c);
        }
    
        public static Complex crossPoint(Line l1, Line l2){
            double p=l1.a*l2.b-l2.a*l1.b;
            double qx=l1.b*l2.c-l2.b*l1.c;
            double qy=l2.a*l1.c-l1.a*l2.c;
            return new Complex(qx/p, qy/p);
        }
    
        public static double arg(Complex a, Complex b, Complex c){
            double arg=Complex.arg(Complex.div(Complex.sub(c, b), Complex.sub(a, b)));
            if(arg<0){
                arg*=-1.;
            }
            return arg;
        }
    
        static class Line{
            // a*a+b*b=1.
            public double a, b ,c;
            public Line(double a, double b, double c){
                this.a=a;
                this.b=b;
                this.c=c;
            }
        }
    
        static class Complex implements Cloneable{
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
                if(!radian){
                    theta=Math.toRadians(theta);
                }
                this.theta=theta%PI;
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
            private double distSq(Complex c){
                return c.x*c.x+c.y*c.y;
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
            public static double distSq(Complex a, Complex b){
                return a.distSq(b);
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
                if(o==this){
                    return true;
                } else if(o instanceof Complex){
                    Complex c=(Complex) o;
                    // if(c.x==this.x && c.y==this.y && c.r==this.r && c.theta==this.theta){
                    //     return true;
                    // } else{
                    //     return false;
                    // }
                    return dist(c)<DELTA;
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
                return 
                "(x, y) = ("+x+", "+y+"), (r, theta(rad), theta(deg)) = ("+r+", "+theta+", "+Math.toDegrees(theta)+").";
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
