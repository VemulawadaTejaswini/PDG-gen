import java.io.IOException;
import java.io.InputStreamReader;
import java.io.BufferedReader;

import java.util.Arrays;

public class Main{
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        
        int num = Integer.parseInt(br.readLine());

        String[] input = new String[num];
        String[] datas = new String[num * (num-1)];
        int[] data = new int[num * (num-1)];

        for(int i = 0; i < num; i++)    input[i] = br.readLine();

        int index = 0;
        for(int i = 0; i < num; i++){
            for(int j = 0; j < num; j++){
                if(i != j){
                    datas[index] = input[i] + input[j];
                    index++;
                }
            }
        }
        for(int i = 0; i < data.length; i++) data[i] = Integer.valueOf(datas[i]);
        
        Arrays.sort(data);

        System.out.println(data[2]);
    }
}