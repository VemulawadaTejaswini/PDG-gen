import java.util.Scanner;
public class Main {

    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int coin=sc.nextInt();
        int hap=0;
        if(coin>500){
            hap=hap+1000*(coin/500);
        coin=coin%500;}

        if(hap>0)
            hap=hap+5*(coin/5);
        System.out.println(hap);

        //else{ System.out.println("No");}





    }
}



