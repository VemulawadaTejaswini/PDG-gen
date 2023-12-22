import java.util.Scanner;

public class Main {
    public static void main(String args[]){
        Scanner scan = new Scanner(System.in);

        int d[]=new int[6];
        for(int i=0;i<6;i++){
            d[i]=scan.nextInt();
        }
        Dice dice =new Dice(d[0],d[1],d[2],d[3],d[4],d[5]);

        String inst =scan.next();

        for(int i=0;i<inst.length();i++){
            char c=inst.charAt(i);
            switch (c){
                case 'N':
                    dice.turnN();
                    break;
                case 'S':
                    dice.turnS();
                    break;
                case 'W':
                    dice.turnW();
                    break;
                case 'E':
                    dice.turnE();
                    break;
            }
        }

        System.out.println(dice.top);
    }
}

class Dice{
    int top,bottom,left,right,front,back;

    Dice(int a, int b,int c,int d,int e,int f){
        top=a;
        front=b;
        right=c;
        left=d;
        back=e;
        bottom=f;
    }

    void turnN(){
        int tmp=top;
        top=front;
        front=bottom;
        bottom=back;
        back=tmp;
    }
    void turnS(){
        int tmp=top;
        top=back;
        back=bottom;
        bottom=front;
        front=tmp;
    }
    void turnW(){
        int tmp=top;
        top=right;
        right=bottom;
        bottom=left;
        left=tmp;
    }
    void turnE(){
        int tmp=top;
        top=left;
        left=bottom;
        bottom=right;
        right=tmp;
    }
}

