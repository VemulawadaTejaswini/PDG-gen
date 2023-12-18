import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;


public class Main {
    public static void main(String[] args){
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        try {
            int number = Integer.parseInt(br.readLine());
            String[] height_string = br.readLine().split(" ");
            int[] height = new int[height_string.length];
            int flag =0;
            for (int i= 0;i<height_string.length;i++){
                height[i] = Integer.parseInt(height_string[i]);
            }
            for(int i =0;i<height.length-1;i++){
                for (int j =i+1;j<height.length;j++){
                    int cha = j-i;
                    if(cha==height[i]+height[j]){
                       flag++;
                    }
                }
            }
            System.out.print(flag);
        }catch (IOException e){
            e.printStackTrace();
        }
    }
}
