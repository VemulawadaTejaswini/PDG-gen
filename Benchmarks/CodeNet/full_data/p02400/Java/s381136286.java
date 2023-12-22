import java.io.*;

class Main{
    static double keta(double x){
        int a = (int)(x * 10000000);
        if((a % 10) >= 5){
            a += 10;
            a -= (a % 10);
        }
        double b = ((double)a) / 10000000;

        return b;
    }

    public static void main(String[] args){
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        try {       
                    String line = reader.readLine();
                    double r = Integer.parseInt(line);
                    double pie = 3.141592653589;

                    double shu = 2 * pie * r; 
                    double men = pie * r * r ;

                   double shu2 = keta(shu); 
                   double men2 = keta(men);

                    System.out.println(shu2 + " "+ men2 );
                            
        } catch (IOException e) {
            //TODO: handle exception
            System.out.println(e);
        }
    }
}