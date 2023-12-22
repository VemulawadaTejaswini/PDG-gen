import java.io.*;
import java.util.*;
class Eratos{
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int ans = 0;
        int initialize = 0;
        int count = 0;
        int x = 0;
        ArrayList<Integer> prime_list = new ArrayList<Integer>();
        for(int j = 2;j <= 10000; j++){
            for(int n = 2; n <= j;n++){
                if(j == n){
                    prime_list.add(j);
                }
                else if(j % n == 0){
                    break;
                }
            }
        }
        x = 0;
        for(int i = 0;;i++){
            String buf = br.readLine();
            x = Integer.parseInt(buf);
            if(x == 0){
                break;
            }
            ans = 0;
            initialize = 0;
            count = 0;
            for(int j = 0;j <= 10000;j++){
                ans += prime_list.get(j);
                if(x < prime_list.get(j)){
                    System.out.println(count);
                    break;
                }
                else if(x == ans){
                    count++;
                }
                else if(x <= ans){
                    j = initialize;
                    initialize++;
                    ans = 0;
                }
            }
        }
    }

}