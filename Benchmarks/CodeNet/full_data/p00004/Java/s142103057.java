import java.util.*;

class Main{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        ArrayList<String> ans = new ArrayList<>();
        while(sc.hasNext()){
            double a = {sc.nextDouble(),sc.nextDouble(),sc.nextDouble(),sc.nextDouble(),sc.nextDouble(),sc.nextDouble()};
            ans.add(String.format("%.3f %.3f",getX(a),getY(a)));
        }
        for(int i = 0,size = ans.size();i < size;i++){
            System.out.println(ans.get(i));
        }
    }
    static double getX(double[] v){
        double x1 = v[0] * Math.abs(v[4]);
        double c1 = v[2] * Math.abs(v[4]);
        double x2 = v[3] * Math.abs(v[1]);
        double c2 = v[5] * Math.abs(v[1]);
        if((v[1] >= 0) == (v[4] >= 0)){
            x2 *= -1;
            c2 *= -1;
        }
        return (c1 + c2) / (x1 + x2);
    }
    static double getY(double[] v){
        double y1 = v[1] * Math.abs(v[3]);
        double c1 = v[2] * Math.abs(v[3]);
        double y2 = v[4] * Math.abs(v[0]);
        double c2 = v[5] * Math.abs(v[0]);
        if((v[1] >= 0) == (v[4] >= 0)){
            y2 *= -1;
            c2 *= -1;
        }
        return (c1 + c2) / (y1 + y2);
    }
}