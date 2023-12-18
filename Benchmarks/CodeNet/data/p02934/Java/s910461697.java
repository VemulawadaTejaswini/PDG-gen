import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String args[]){
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        try {
            int N = Integer.parseInt(br.readLine());
            int v;
            int save = 1;
            int box[] = new int[N];
            for (int i=0; i<N ; i++) {
                v = Integer.parseInt(br.readLine());
                box[i] = v;
                save = save*v/gcd(save,v);
            }
            
            int denomi = 0;
            int nume = 1;
            for (int j=0; i<N ; j++) {
            		donomi += save/box[i];
            		nume = nume*box[i];
            }
            
            float result = nume/denomi;
            
        } catch (Exception e) {
            //TODO: handle exception
        }
        
        System.out.println(result);
    }
}