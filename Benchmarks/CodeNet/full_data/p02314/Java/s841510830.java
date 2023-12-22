import java.io.*;

public class Main{
    static int count(int ned, int n){
        int amari = 1;
        int maisu = 0;
        int k = 0;
        
        while(amari != 0){
            k = n / ned;
            amari = n % ned;
            maisu = maisu + k;
        }
        
        return maisu;
    }


    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String[] input = br.readLine().split(" ");
        
        int n = Integer.parseInt(input[0]);
        if(n < 1 || n > 50000){
            System.out.println("Error");
        }
        int m = Integer.parseInt(input[1]);
        if(m < 1 || m > 10000){
            System.out.println("Error");
        }
        
        String[] buf = br.readLine().split(" ");
        int ne[] = new int[m];
        for(int i = 0; i < m; i++){
            ne[i] = Integer.parseInt(buf[i]);
        }
        
        int min[] = new int[m];
        for(int i = 0; i < m; i++){
            int ned = 0;
            ned = ne[i];
            min[i] = count(ned, n);
        }
        
        int mmin = min[0];
        for(int i = 0; i < m; i++){
            if(mmin > min[i]){
                mmin = min[i];
            }
        }
        
        System.out.println(mmin);
    }

}