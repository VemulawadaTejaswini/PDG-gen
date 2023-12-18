import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int N = Integer.parseInt(sc.next());
        int[] color = {0,0,0,0,0,0,0,0};
        int any = 0;
        for(int i = 0; i < N; i++){
            int rate = Integer.parseInt(sc.next());
            if(1 <= rate && rate <= 399){
                color[0] = 1;
            }else if(400 <= rate && rate <= 799){
                color[1] = 1;
            }else if(800 <= rate && rate <= 1199){
                color[2] = 1;
            }else if(1200 <= rate && rate <= 1599){
                color[3] = 1;
            }else if(1600 <= rate && rate <= 1999){
                color[4] = 1;
            }else if(2000 <= rate && rate <= 2399){
                color[5] = 1;
            }else if(2400 <= rate && rate <= 2799){
                color[6] = 1;
            }else if(2800 <= rate && rate <= 3199){
                color[7] = 1;
            }else{
                any += 1;
            }
        }
        int num_of_1 = 0;
        int num_of_0 = 0;
        for(int i = 0; i < color.length ; i++){
            num_of_1 += color[i];
        }
        num_of_0 = color.length - num_of_1;
        int min = 0;
        if(any == 0){
            min = num_of_1;
        }else{
            if(any >= num_of_0){
                min = num_of_1 + num_of_0;
            }else{
                min = num_of_1 + any;
            }
        }
        System.out.println(num_of_1+" "+min);
    }
}