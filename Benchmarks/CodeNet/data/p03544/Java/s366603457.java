

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        long a = 2;
        long b = 1;
        long c = 0;
        long result = 1;
        int num = Integer.parseInt(br.readLine().trim());
        for(int i=2; i<=num; i++){
            if(i%3==0){
                a = b+c;
                result = a;
            }else if(i%3==1) {
                b = c+a;
                result = b;
            }else{
                c = a+b;
                result = c;
            }
        }
        System.out.println(result);
    }
}