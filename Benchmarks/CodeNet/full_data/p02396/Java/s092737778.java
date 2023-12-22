import java.io.InputStreamReader;
 
public class Main {
    public static void main(String[] args) throws Exception {
        // Here your code !
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
 
        int i=1;
 
        while(true){
            String x = br.readLine();
            if(Integer.parseInt(x)==0){
                break;
            }
            System.out.println("Case "+i+": "+Integer.parseInt(x));
            i++;
        }
    }
}