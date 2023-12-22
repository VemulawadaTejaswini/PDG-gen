import java.util.Scanner;

public class Main {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        sc.close();
        int zCount =0;
        int devisor =2;

        //ごり押しで素因数分解
        //2の時だけいったん計算
        int devideCount =0;
        while(true){
            if(n % devisor ==0){
                n = n/devisor;
                devideCount++;
            }
            else{
                break;
            }
        }
        for(int j=1; j<=devideCount; j++){
            if(devideCount<j){
                break;
            }
            devideCount = devideCount - j;
            zCount++;
        }
        devisor++;

        //奇数だけ調べるため3移行+2で回す
        while(n>1){
            devideCount=0;
            while(true){
                if(n % devisor ==0){
                    n = n/devisor;
                    devideCount++;
                }
                else{
                    break;
                }
            }
            for(int j=1; j<=devideCount; j++){
                if(devideCount<j){
                    break;
                }
                devideCount = devideCount - j;
                zCount++;
            }
            devisor += 2;
        }
        System.out.println(zCount);
    }
}