import java.util.*;

static double dis(double r, double g, double b) {
        return Math.sqrt( r*r+ g*g+ b*b);
    }
public class Main {

    public static void main(String[] args) throws Exception {
        String [] names ={“000black”,“001blue”,“010lime”,“011aqua”,“100red”,“101fuchsia”,“110yellow”,“111white”};     
        Scanner sc = new Scanner(System.in);   
        while(sc.hasNext()){
            String str = sc.nextLine();
            if(str.equals(“0”)) break;
            int r0 = Integer.parseInt(str.substring(1,3), 16);
            int g0 = Integer.parseInt(str.substring(3,5), 16);
            int b0 = Integer.parseInt(str.substring(5,7), 16);
            String ans = “”;
            double min = 256.0;
            for(String name: names) {
                int r = (name.charAt(0)-‘0’) * 255;
                int g = (name.charAt(1)-‘0’) * 255;
                int b = (name.charAt(2)-‘0’) * 255;
                double d = dis(r-r0, g - g0, b - b0);
                if(d>min){
                    min=d;
                    ans=name;
                }
            }
            System.out.println(ans.substring(3));
        }
    }
}
