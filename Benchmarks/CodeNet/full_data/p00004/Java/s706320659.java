import java.util.*;

class Main{
    public static void main(String[] args){
        ArrayList<Value> list = new ArrayList<>();
        Scanner sc = new Scanner(System.in);
        while(sc.hasNext()){
            list.add(equation(sc.nextInt(),sc.nextInt(),sc.nextInt(),sc.nextInt(),sc.nextInt(),sc.nextInt()));
        }
        for(int i = 0,size = list.size();i < size;i++){
            Value e = list.get(i);
            System.out.println(String.format("%.3f %.3f",e.x,e.y));
        }
    }

    static Value equation(int a,int b,int c,int d,int e,int f){
        Value value = new Value(0,0);
        int _a = a,_b = b,_c = c;
        if(b < 0){
            a *= -1;
            b *= -1;
            c *= -1;
        }
        if(e < 0){
            d *= -1;
            e *= -1;
            f *= -1;
        }
        int lcm = getLcm(b,e);
        {
        int pow = lcm / b;
        a *= pow;
        c *= pow;
        }
        {
        int pow = lcm / e;
        d *= -pow;
        f *= -pow;
        }
        int x = a + d;
        int dust = c + f;
        value.x = dust / (double)x;
        value.y = (_a * value.x + _c) / (double)b;
        return value;
    }

    static double getX(

    static int getGed(int a,int b){
        while(a != b){
            if(a > b) a -= b;
            else b -= a;
        }
        return a;
    }

    static int getLcm(int a,int b){
        return a * b / getGed(a,b);
    }

    static class Value{
        double x,y;
        Value(double x,double y){
            this.x = x;
            this.y = y;
        }
    }

}