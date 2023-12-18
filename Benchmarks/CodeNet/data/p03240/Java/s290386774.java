import java.util.*;
import java.math.*;


public class Main {
    public static void main(String[] args) throws Exception {
        // Your code here!
        Scanner sc = new Scanner(System.in);
        int N = Integer.parseInt(sc.next());
        ArrayList<Line> lines = new ArrayList<Line>();
        for(int i=0;i<N;i++){
            lines.add(new Line(
                Integer.parseInt(sc.next()),
                Integer.parseInt(sc.next()),
                Integer.parseInt(sc.next())
            ));
        }
        for(int a=0;a<=100;a++){
            start:for(int b=0;b<=100;b++){
                int tmph = -1;
                for(Line line:lines){
                    if(tmph == -1) tmph = line.calc(a,b);
                    else if(tmph != line.calc(a,b)) continue start;
                }
                System.out.println(a + " " + b + " " + tmph);
                return;
            }
        }
    }
    static class Line{
        int a,b,h;
        Line(int a,int b,int h){
            this.a = a;
            this.b = b;
            this.h = h;
        }
        public int calc(int a, int b){
            return Math.abs(this.a-a) + Math.abs(this.b-b) + this.h;
        }
    }
    
}

