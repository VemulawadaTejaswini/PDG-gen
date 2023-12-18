
import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String[] num = br.readLine().trim().split("");
        int count = 0;
        String result;
        for(int i=0; i<num.length-1; i++){
            if(num[i] == num[i]+1){
                count++;
                if(count == 2) break;
            }else{
                count = 0;
            }
        }
        if(count == 2) System.out.println("YES");
        else System.out.println("No");
    }
}