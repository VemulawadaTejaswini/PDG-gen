
public class AAAA{
    private Double pi = 3.1415926535

    public static void main(String[] args){
        String str = getLine();
        double r = Double.parseDouble(str);
        double s = r * r * pi;
        double l = (r * 2) * pi;
        System.out.printf("%.6f %.6f\n",s,l);
    }

    public static String getLine(){
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        return br.readLine();
    }

}
