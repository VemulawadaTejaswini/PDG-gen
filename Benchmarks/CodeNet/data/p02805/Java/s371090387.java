import java.util.*;
import java.io.*;

class Main{
    public static void main(String[] args) throws Exception{
        double delta=1e-9;
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
            System.out.println(Coordinate.dist(c[0], c[1])/2.);
            return;
        }
        double dmax=0;
        int a=0, b=0;
        for(int i=0;i<n-1;i++){
            for(int j=i+1;j<n;j++){
                double d=Coordinate.dist(c[i], c[j]);
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
            if(i==a||i==b){
                i++;
            }
            if(Coordinate.dist(pM, c[i])>=dmax+delta){
                in=false;
                break;
            }
        }
        if(in){
            System.out.println(dmax);
            return;
        }
        double min=1e100;
        for(int i=0;i<n-2;i++){
            for(int j=i+1;j<n-1;j++){
                K:for(int k=j+1;k<n;k++){
                    Coordinate.Complex p=c[i], q=c[j], r=c[k];
                    Coordinate.Complex pO=Coordinate.pO(p, q, r);
                    double radius=Coordinate.dist(pO, p);
                    double r1=Coordinate.dist(pO, q);
                    double r2=Coordinate.dist(pO, r);
                    // if(Math.abs(radius-r1)>delta || Math.abs(radius-r2)>delta){
                    //     System.out.println();
                    //     System.out.println(radius);
                    //     System.out.println(r1);
                    //     System.out.println(r2);
                    //     throw new Exception();
                    // }
                    if(radius>=min){
                        continue;
                    }
                    for(int l=0;l<n;l++){
                        if(l==i || l==j || l==k){
                            continue;
                        }
                        if(radius+delta<Coordinate.dist(pO, c[l])){
                            continue K;
                        }
                    }
                    min=Math.min(min, radius);
                }
            }
        }
        System.out.println(min);
    }

    static class Coordinate{
        private static double PI=Math.PI;
        private static double DELTA=0.0000001;
        private static double NaN=Double.NaN;
    
        public static Complex pM(Complex a, Complex b){
            return Complex.div(Complex.add(a, b), 2.);
        }
        public static Complex pO(Complex a, Complex b, Complex c){
            double la=dist(b, c); 
            la*=la;
            double lb=dist(c, a); 
            lb*=lb;
            double lc=dist(a, b); 
            lc*=lc;
            double sa=la*(lb+lc-la);
            double sb=lb*(lc+la-lb);
            double sc=lc*(la+lb-lc);
            return Complex.div(Complex.add(Complex.mul(a, sa), Complex.mul(b, sb), Complex.mul(c, sc)), sa+sb+sc);
        }
    
        public static boolean oneLine(Complex a, Complex b, Complex... c){
            for(Complex z:c){
                double arg=arg(a, b, z);
                if(arg<DELTA || PI-arg<DELTA){
                    return false;
                }
            }
            return true;
        }

        public static double dist(Complex a, Complex b){
            return Complex.abs(Complex.sub(a, b));
        }
    
        public static double arg(Complex a, Complex b, Complex c){
            double arg=Complex.arg(Complex.div(Complex.sub(c, b), Complex.sub(a, b)));
            if(arg<0){
                arg*=-1.;
            }
            return arg;
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
                this.x=r*cos();
                this.y=r*sin();
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
