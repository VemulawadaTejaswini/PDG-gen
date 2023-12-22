
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;


public class D {

    int mod ;
    //
    String s = "codeforces";

    void solve(char  c) {
        if(c>='a'){
            System.out.println('a');
            return ;
        }else{
            System.out.println('A');
        }
    }
    void draw(int[] arr){
        char[] cs = s.toCharArray();
        StringBuilder sb = new StringBuilder();
        for(int i=0;i<10;i++){
            for(int j=arr[i];j>0;j--){
                sb.append(cs[i]);
            }
        }
        System.out.println(sb.toString());
    }


    public static void main(String[] args)  throws IOException {
        // Use the Scanner class

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        String[]  s = br.readLine().split(" ");
        D test = new D();

        char c = s[0].charAt(0);

        test.solve(c);

        //int tot = Integer.parseInt(br.readLine());


//        int i =1;
//        System.out.println();
//        while(tot>0){
//
//            String s = br.readLine();
//            String[] sr = s.split(" ");
//            List<Long> ls = new ArrayList<>();
//            for(String ss:sr){
//                ls.add(Long.parseLong(ss));
//            }
//            Main tt = new Main();
//            tt.sol(ls);
//            // String Buffer to store answer
//            StringBuffer sb = new StringBuffer();
////            Solution obj = new Solution();
////
////            System.out.println("Case #"+i+": "+obj.sol());
//            tot--;
//            i++;
//        }
    }

}

