import java.util.Scanner;
   
class Main{
    public static void main(String[] args){
        Scanner stdIn = new Scanner(System.in);
   
        int i;
        int[] height = new int[10];
        int[] h = new int[]{0, 0, 0};
        for(i = 0; i < 10; i++){
            height[i] = stdIn.nextInt();
   
            if(h[0] <= height[i]){
                h[2] = h[1];
                h[1] = h[0];
                h[0] = height[i];
            } else if(h[1] <= height[i]) {
                h[2] = h[1];
                h[1] = height[i];
            } else if(h[2] <= height[i])
                h[2] = height[i];
        }
   
        for(int j = 0; j < 3; j++)
            System.out.println(h[j]);
    }
}