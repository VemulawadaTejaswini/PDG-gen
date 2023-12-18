import java.util.Scanner;

public class Main{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int card1 = sc.nextInt();
        int card2 = sc.nextInt();
        int card3 = sc.nextInt();
        int card = sc.nextInt();
        sc.close();

        int i = 0;
        int j = 0;
        int k = 0;
        if(card>card1){
            i=card1;
        }else{
            i=card;
        }
        card=card-card1;
        if(card<0){
            card=0;
        }
        if(card>card2){
            j=card2;
        }else{
            j=card;
        }
        card=card-card2;
        if(card<0){
            card=0;
        }
        if(card>card3){
            k=card3;
        }else{
            k=card;
        }
        int ans=0;
        for(int num1=0;num1<i; num1++){
            ans++;
        }
        for(int num2=0; num2<k; num2++){
            ans --;
        }
        System.out.println(ans);
    }
}