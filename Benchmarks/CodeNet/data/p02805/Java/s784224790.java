import java.util.*;
import java.io.*;

class Main{
    public static void main(String[] args){
        double delta=0.00000001;
        FastScanner fsc=new FastScanner();
        int n=fsc.nextInt();
        Complex[] c=new Complex[n];
        for(int i=0;i<n;i++){
            double x=fsc.nextInt();
            double y=fsc.nextInt();
            c[i]=new Complex(x, y);
        }
        fsc.close();
        if(n==2){
            System.out.println(Complex.dist(c[0], c[1])/2.);
            return;
        }
        double dmax=0;
        int a=0, b=0;
        for(int i=0;i<n-1;i++){
            for(int j=i+1;j<n;j++){
                double d=Complex.dist(c[i], c[j]);
                if(d>dmax){
                    dmax=d;
                    a=i;
                    b=j;
                }
            }
        }
        dmax/=2.;
        Complex pM=Complex.pM(c[a], c[b]);
        boolean in=true;
        for(int i=0;i<n;i++){
            if(Complex.dist(pM, c[i])>=dmax+delta){
                in=false;
            }
        }
        if(in){
            System.out.println(dmax);
            return;
        }

        for(int i=0;i<n-2;i++){
            for(int j=i+1;j<n-1;j++){
                for(int k=0;k<n;k++){
                    Complex p=c[i];
                    Complex q=c[j];
                    Complex r=c[k];
                    Complex pO=Complex.pO(p, q, r);
                    double radius=Complex.dist(pO, p);
                    for(int l=0;l<n;l++){
                        if(radius+delta<Complex.dist(pO, c[i])){
                            continue;
                        }
                    }
                    System.out.println(radius);
                    return;
                }
            }
        }
    }

    static class Complex implements Cloneable{
        public static final Complex I=new Complex(0, 1);
        public static final Complex ZERO=new Complex(0, 0);
        public static final Complex ONE=new Complex(1, 0);
        public static final double PI=Math.PI;
    
        public double x;
        public double y;
        public double r;
        public double theta;
    
        public Complex(double x, double y){
            this.x=x;
            this.y=y;
            this.r=Math.sqrt(x*x+y*y);
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
    
        private double abs(){
            return r;
        }
        private double arg(){
            return theta;
        }
        private Complex conjugate(){
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
            return mul(new Complex(phi, radian));
        }
        private Complex pow(int n){
            return new Complex(Math.pow(r, n), theta*n, true);
        }
        private double dist(Complex c){
            return abs(sub(c));
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
            return Complex.div(Complex.mul(this, c.conjugate()), c.abs()*c.abs()); 
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
    
        public static Complex conjugate(Complex c){
            return c.conjugate();
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
        public static Complex pow(Complex c, int n){
            return c.pow(n);
        }
        public static double dist(Complex a, Complex b){
            return a.dist(b);
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

        public static Complex pM(Complex a, Complex b){
            return div(add(a, b), 2.);
        }
        public static Complex internalDivision(Complex a, Complex b, int m, int n){
            return div(add(mul(a, n), mul(b, m)), m+n);
        }
        public static Complex externalDivision(Complex a, Complex b, int m, int n){
            return internalDivision(a, b, -m, n);
        }
    
        public static Complex pG(Complex a, Complex b, Complex c){
            return div(add(a, b, c), 3.); 
        }
        public static Complex pH(Complex a, Complex b, Complex c){
            double tanA=Math.tan(arg(c, a, b));
            double tanB=Math.tan(arg(a, b, c));
            double tanC=Math.tan(arg(b, c, a));
            return div(add(mul(a, tanA), mul(b, tanB), mul(c, tanC)), tanA + tanB + tanC);
        }
        public static Complex pI(Complex a, Complex b, Complex c){
            double la=abs(sub(b, c));
            double lb=abs(sub(c, a));
            double lc=abs(sub(a, b));
            return div(add(mul(a, la), mul(b, lb), mul(c, lc)), la + lb + lc);
        }
        public static Complex pO(Complex a, Complex b, Complex c){
            double sin2A=Math.sin(2.*arg(c, a, b));
            double sin2B=Math.sin(2.*arg(a, b, c));
            double sin2C=Math.sin(2.*arg(b, c, a));
            return div(add(mul(a, sin2A), mul(b, sin2B), mul(c, sin2C)), sin2A + sin2B + sin2C);
        }
    
        public static double arg(Complex a, Complex b, Complex c){
            double arg=arg(div(sub(c, a), sub(b, a)));
            if(arg<0){
                arg*=-1.;
            }
            while(arg>PI){
                arg-=PI;
            }
            return arg;
        }
    
        @Override 
        public Complex clone(){
            return new Complex(this.x, this.y);
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
