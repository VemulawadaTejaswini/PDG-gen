import java.io.BufferedReader;
import java.io.InputStreamReader;
class Main{
    public static void main(String[] args) throws Exception {
        int count = 0;
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String str = br.readLine();
        String[] z = str.split(" ");
        int a = Integer.parseInt(z[0]);
        int b = Integer.parseInt(z[1]);
        int c = Integer.parseInt(z[2]);
        
        while(a<=b){
            if(0==c%a){
                count++;
            }
            a++;
        }

        System.out.println(count);
    }
}
