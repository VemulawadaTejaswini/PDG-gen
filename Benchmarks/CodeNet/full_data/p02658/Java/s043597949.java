import java.util.*;
import java.io.*;
import java.nio.file.Files;
import java.nio.charset.StandardCharsets;
public class Main {
    long asd = (long)1000000000*1000000000;
    public void sol(String s,long j) {

        long ans = 1;
        boolean ret = false;
        String[] ss = s.split(" ");
        long[] arr = new long[ss.length];
        for (int i=0;i<ss.length;i++) {
            arr[i] = Long.parseLong(ss[i]);
            if (arr[i] == 0) {
                System.out.println("0");
                return;
            }
            if (arr[i] > asd) {
                ret = true;
            }
        }
        if (ret) {
            System.out.println("-1");
            return;
        }
        for(long k:arr){
            ans*=k;
            if(ans>asd){
                System.out.println("-1");
                return;
            }
        }
        System.out.println(ans);


    }

    public static void main(String[] args)  throws IOException {
        // Use the Scanner class
        Main aka = new Main();
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        long num = Long.parseLong(br.readLine());
        String s = br.readLine();
        //int tot = Integer.parseInt(br.readLine());

        aka.sol(s,num);
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
