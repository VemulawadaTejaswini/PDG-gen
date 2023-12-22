import java.util.Scanner;
public class Main{
    public static void main(String[] args){
        Scanner scan=new Scanner(System.in);
        int[] height=new int[300];
        int[] weight=new int[300];
        int i=0;
        while(true){
            height[i]=scan.nextInt();
            weight[i]=scan.nextInt();
            if(height[i]==0&&weight[i]==0) break;
            for(int j=0;j<height[i];j++){
                for(int k=0;k<weight[i];k++){
                    if((j+k)%2==0) System.out.printf("#");
                    else System.out.printf(".");
                }
                System.out.println();
            }
            System.out.println();
        }


    }
}
