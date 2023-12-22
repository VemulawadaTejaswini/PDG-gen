import java.io.*;
import java.util.*;
class Eratos{
    public static int main(String[] args) throws IOException{
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
        int x = 0;
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        for(int i = 0;;i++){
            //Scanner cin;
            //cin = new Scanner(System.in);
            //System.out.println(cin.next());
            String buf = br.readLine();
            x = Integer.parseInt(buf);
            if(x == 0){
                break;
            }
            int ans = 0;
            int initialize = 0;
            int count = 0;
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
        return 0;
    }

}