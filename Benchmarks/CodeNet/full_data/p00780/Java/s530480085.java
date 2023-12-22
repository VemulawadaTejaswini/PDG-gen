import java.io.*;
import java.util.*;
class P1998{
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int ans = 0;
        int initialize = 0;
        int count = 0;
        int x = 0;
        int ans_pro = 0;
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
        while(true){
            String buf = br.readLine();
            x = Integer.parseInt(buf);
            if(x == 0){
                break;
            }
            ans = 0;
            count = 0;
            ans_pro = 0;
            for(int j = 0;;j++){
                ans = 0;
                ans += prime_list.get(j);
                ans_pro = ans;
                initialize = 0;
                for(int l = j;;l++){
                    System.out.println(ans_pro+"+"+ prime_list.get(l)+"="+(ans_pro+prime_list.get(l)));
                    ans_pro += prime_list.get(l);
                    if(x < prime_list.get(l)){
                        break;
                    }
                    else if(ans_pro < ans){
                        break;
                    }
                    else if(x < ans_pro){
                        //l = initialize;
                        //initialize++;
                        //ans_pro = ans;
                        //System.out.println("hello");
                        break;
                    }
                    else if(x == ans_pro){
                        count++;
                        System.out.println("count plus");
                        break;
                    }
                    ans_pro = ans;
                }
                if(prime_list.get(j) >= x){
                    System.out.println(count);
                    break;
                }
            }
        }
    }

}