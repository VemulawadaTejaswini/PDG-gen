import java.io.InputStreamReader;
import java.io.BufferedReader;
import java.io.IOException;

public class Main{
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int a = Integer.parseInt(br.readLine());

        main:
        for(int i = 0; i < a; i++){
            String x = br.readLine();
            String y = br.readLine();

            if(x.length() > 80 || y.length() > 80){
                System.out.println("overflow");
                continue main;
            }

            StringBuilder s = new StringBuilder();
            StringBuilder t = new StringBuilder();


            for(int j = 0; j < 81 - x.length(); j++){
                s.append("0");
            }

            for(int j = 0; j < 81 - y.length(); j++){
                t.append("0");
            }

            s.append(x);
            t.append(y);

            StringBuilder ans = getAns(s.toString() , t.toString() , 0);
            int index = 0;
            while(ans.toString().charAt(index) == '0'){
                index++;
            }

            if(ans.length() - index > 80){
                System.out.println("overflow");   
            }else{
                System.out.println(ans.toString().substring(index , ans.length()));
            }

        }

    }

    static StringBuilder getAns(String s , String t , int carry){
        if(s.length() == 0 && t.length() == 0){
            StringBuilder alpha = new StringBuilder();
            return alpha;
        }

        int partOfs = Integer.parseInt(s.substring(s.length() - 9 , s.length()));
        int partOft = Integer.parseInt(t.substring(t.length() - 9 , t.length()));

        int ans = partOfs + partOft + carry;
        int c = ans/1000000000;

        String ll = String.valueOf(ans);
        String last;
        if(ll.length() == 10){
            last = ll.substring(1,10);
        }else{
            last = ll;
        }

        return getAns(s.substring(0 , s.length() - 9) , t.substring(0 , t.length() - 9) , c).append(last);

    }

}