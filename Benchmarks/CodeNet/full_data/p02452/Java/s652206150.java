import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main{
    public static void main(String[] args) {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        try{
            int n = Integer.parseInt(reader.readLine());
            String[] str1 = reader.readLine().split(" ");
            int m = Integer.parseInt(reader.readLine());
            String[] str2 = reader.readLine().split(" ");
            int i = 0;
            int flag = 0;
            int k = 0;
            while(i < m){
                flag = 0;
                int i1 = Integer.parseInt(str2[i]);
                for(int j = k; j  < n; j++){
                    if(Integer.parseInt(str1[j]) == i1){
                        flag = 1;
                        k = j + 1;
                        break;
                    }else if(Integer.parseInt(str1[j]) > i1){
                        flag = 0;
                        break;
                    }
                }
                if(flag == 0){
                    break;
                }
                i++;
            }
            System.out.println(flag);

        }catch(IOException e){
            
        }
    }
}
