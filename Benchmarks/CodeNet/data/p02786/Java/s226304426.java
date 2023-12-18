import java.util.*;

class Main{
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        long hp = scan.nextLong();
        scan.close();
        long count = 1;
        int jyosu = 0; //hpは2の何乗か?

        if(hp == 1) System.out.println(count);
        else{
            while(hp != 1){
                hp = hp / 2;
                jyosu++;
            }

            for(int i = 0;i < jyosu;i++) count = count * 2;
            System.out.println(count - 1);
        }