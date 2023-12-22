
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Arrays;

public class Main {
    public static void main(String args[]){
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        try{
            String order;
            while((order=br.readLine())!=null){
                double d = Double.parseDouble(order);
                int story=0;
                for(int i=1; i<10000; i++){
                    int y = (i-1)*5;
                    double t = Math.sqrt(y/4.9);
                    double v = 9.8*t;
                    if(v>=d) {story=i;break;}
                }
                System.out.println(story);
            }
            
        }catch(Exception e){e.printStackTrace();}
    }
}