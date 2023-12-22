import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.math.RoundingMode;
import java.text.DecimalFormat;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        try {
            DecimalFormat df = new DecimalFormat("0.000");
            df.setRoundingMode(RoundingMode.HALF_UP);
            Double x1,x2,x3,y1,y2,y3;
            String line = br.readLine();
            int n = Integer.parseInt(line);
            for(int i=0;i<n;i++) {
                line = br.readLine();
                StringTokenizer st = new StringTokenizer(line);
                x1 = Double.parseDouble(st.nextToken());
                y1 = Double.parseDouble(st.nextToken());
                x2 = Double.parseDouble(st.nextToken());
                y2 = Double.parseDouble(st.nextToken());
                x3 = Double.parseDouble(st.nextToken());
                y3 = Double.parseDouble(st.nextToken());
                Triangle tri = new Triangle(new Point(x1,y1),new Point(x2,y2),new Point(x3,y3));
                System.out.println(df.format(tri.getP().x) + " " + df.format(tri.getP().y) + " " + df.format(tri.getR()));
            }
        } catch (Exception e) {
            System.err.println();
        }
    }
}

class Point{
    double x;
    double y;
    Point(double x, double y){
        this.x = x;
        this.y = y;
    }
}

class Line{
    Point A;
    Point B;
    double length;
    Line(Point A, Point B){
        this.A = A;
        this.B = B;
        this.length = getLength();
    }
    private double getLength(){
        return Math.sqrt((A.x-B.x)*(A.x-B.x) + (A.y-B.y)*(A.y-B.y));
    }
}

class Triangle{
    Point A;
    Point B;
    Point C;
    double a,b,c;
    Triangle(Point A, Point B, Point C){
        this.A = A;
        this.B = B;
        this.C = C;
        this.a = (new Line(B,C)).length;
        this.b = (new Line(A,C)).length;
        this.c = (new Line(A,B)).length;
    }
    double getCosA(){
        double cosA;
        cosA = (b*b + c*c -a*a)
                /(2*b*c);
        return cosA;
    }
    double getSinA(){
        double sinA,cosA = getCosA();
        sinA = Math.sqrt(1-(cosA*cosA));
        return sinA;
    }
    double getR(){
        double R,sinA = getSinA();
        R = a/(2*sinA);
        return R;
    }
    Point getP(){
        double elementA,elementB,elementC,elementD,elementP,elementQ,detA,px,py;
        elementA = 2*(B.x-A.x);
        elementB = 2*(B.y-A.y);
        elementC = 2*(C.x-B.x);
        elementD = 2*(C.y-B.y);
        elementP = B.x*B.x - A.x*A.x + B.y*B.y - A.y*A.y;
        elementQ = C.x*C.x - B.x*B.x + C.y*C.y - B.y*B.y;
        detA = elementA*elementD - elementB*elementC;
        px=(elementD*elementP-elementB*elementQ)/detA;
        py=(-elementC*elementP+elementA*elementQ)/detA;
        return new Point(px,py);
    }
}