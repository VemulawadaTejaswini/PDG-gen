import java.io.*;

public class Main{
    public static void main(String[] args)throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        String input = br.readLine();
        int space1 = input.indexOf(" ");
        int space2 = input.indexOf(" ", space1 +1);
        int n = Integer.parseInt(input.substring(0,space1));
        int a = Integer.parseInt(input.substring(space1+1, space2));
        int b = Integer.parseInt(input.substring(space2+1));

        int ans = 0;

        for(int i = 1; i<n+1; i++){
            int now = i;
            int sum = 0;
            for(int j = 0; j<String.valueOf(n).length(); j++){
                sum = sum + now%10;
                now = (now-now%10)/10;
            }
            //ここでチェックしてもいいかも
            if(a<=sum && sum<=b){
                ans = ans + i;
            }
        }
        System.out.println(ans);
    }
}
