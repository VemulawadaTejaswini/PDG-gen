import java.io.*;

public class Main{
    public static void main(String[]args)throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String[] str = br.readLine().split(" ");
        int[] num = new int[3];
        num[0] = Integer.parseInt(str[0]);
        num[1] = Integer.parseInt(str[1]);
        num[2] = Integer.parseInt(str[2]);
        for(int i = 0; i<3; i++){
            int indexMin = i;
            for(int k = i + 1; k<3; k++){
                if(num[k] < num[indexMin]){
                    indexMin = k;
                }
            }
            int swp = num[i];
            num[i] = num[indexMin];
            num[indexMin] = swp;
        }
        System.out.println(num[0] +" "+ num[1] +" "+ num[2]);

    }
}