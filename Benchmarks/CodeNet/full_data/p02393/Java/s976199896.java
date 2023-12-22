import java.io.*;

public class Main{
    public static void main(String[]args)throws IOException, NumberFormatException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        String[] str = br.readLine().split(" ");
        int[] num = new int[str.length];
        for(int i = 0; i < str.length; i++){
            num[i] = Integer.parseInt(str[i]);
        }
        for(int i = 0; i < str.length; i++){
            int indexMin = i;
            for(int j = i + 1; j < str.length; j++){
                if( num[j] < num[indexMin] ){
                    indexMin = j;
                }
            }
            int swp = num[indexMin];
            num[indexMin] = num[i];
            num[i] = swp;
        }
        for(int i = 0; i < str.length; i++){
            System.out.print(num[i] +" ");
        }
    }
}