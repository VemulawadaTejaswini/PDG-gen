import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws Exception {
        // Here your code !
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        
        int n = Integer.parseInt(br.readLine());
        
        int[] data = new int[n+1];
        for(int i = 1; i < n+1; i ++){
            data[i] = Integer.parseInt(br.readLine());
        }
        
        int[] light = new int[n+1];
        light[1] = 1;
        for(int i = 2; i <= n ; i++){
            light[i] = 0;
        }
        
        int count = 0;
        boolean achieve = false;
        //光っているボタンを探す
        while(true){
            boolean breakFlag = false;
            
            //System.out.println("count = "+count);
            for(int i = 1; i <= n; i++){
                //System.out.println("i = "+i);
                if(light[i] == 1){
                    //System.out.println(i + " was pushed next is "+data[i]);
                    light[i]++;
                    light[data[i]] = 1;
                    count++;
                    
                    if(data[i] == 2){
                        //System.out.println("clear");
                        achieve = true;
                        breakFlag = true;
                    }
                    break;
                }
                else if(light[i] > 1 && count > 1){
                    //System.out.println("i = "+i+" failed");
                    breakFlag = true;
                }
            }
            
            //System.out.println(breakFlag);
            if(breakFlag){
                break;
            }
        }
        
        if(achieve){
            System.out.println(count);
        }
        else {
            System.out.println(-1);
        }
        
    }
}
