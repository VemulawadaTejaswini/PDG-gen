import java.util.*;
import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        String[] dic = new String[n];
        Arrays.fill(dic, "");
        int[] count = new int[n];
        
        for(int i=0; i<n; i++){
            String s = br.readLine();
            int flg = 0;
            for(int j=0; j<n; j++){
                if(s.equals(dic[j])){
                    count[j]++;
                    flg = 1;
                    break;
                }
            }
            if(flg == 0){
                dic[i] = s;
            }
        }
        
        int max = 0;
        for(int i=0; i<n; i++){
            if(count[i] > max) max = count[i];
        }
        List<String> ans = new ArrayList<>();
        for(int i=0; i<n; i++){
            if(count[i] == max){
                ans.add(dic[i]);
            }
        }
        
        Collections.sort(ans);
        for(String s : ans){
            System.out.println(s);
        }
    }
}