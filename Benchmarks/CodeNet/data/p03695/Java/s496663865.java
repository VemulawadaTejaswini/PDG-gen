import java.io.IOException;
import java.util.Scanner;

public class Main{

    private static int color[] = {0,0,0,0,0,0,0,0,0};

    public static void main(String[] args) throws IOException {
        Scanner sc = new Scanner(System.in);
        int count = sc.nextInt();

        for(int i=0;i<count;i++){
            int rate = sc.nextInt();
            if(rate>=1 && rate<=399){
                color[0]=1;
            }
            else if(rate>=400 && rate<=799){
                color[1]=1;
            }
            else if(rate>=800 && rate<=1199){
                color[2]=1;
            }
            else if(rate>=1200 && rate<=1599){
                color[3]=1;
            }
            else if(rate>=1600 && rate<=1999){
                color[4]=1;
            }
            else if(rate>=2000 && rate<=2399){
                color[5]=1;
            }
            else if(rate>=2400 && rate<2799){
                color[6]=1;
            }
            else if(rate>=2400 && rate<3199){
                color[7]=1;
            }else if(rate>=3200){
                color[8]+=1;
            }
        }

        int min = 0;
        for(int j=0;j<8;j++){
            if(color[j]>0){
                min+=1;
            }
        }

        int max = min + color[8];
        if(max>8){
            max=8;
        }

        System.out.println(min + " " + max);
    }
}
