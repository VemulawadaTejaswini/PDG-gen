import java.util.Scanner;

public class Main {
    public static void main(String args[]){
        Scanner scan = new Scanner(System.in);

        int d[]=new int[6];
        for(int i=0;i<6;i++){
            d[i]=scan.nextInt();
        }
        Dice dice =new Dice(d[0],d[1],d[2],d[3],d[4],d[5]);

        int q=scan.nextInt();

        for(int i=0;i<q;i++){
            int TOP=scan.nextInt();
            int FRONT=scan.nextInt();

            dice.settop(TOP);
            dice.setfront(FRONT);
            System.out.println(dice.right);
        }

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
    void settop(int a){
        if(a==right)turnW();
        else if(a==left)turnE();
        else if(a==back)turnS();
        else if(a==front)turnN();
        else if(a==bottom){
            turnN();
            turnN();
        }
    }
    void setfront(int a){
        if(a==right)turnL();
        else if(a==left)turnR();
        else if(a==back){
            turnL();
            turnL();
        }
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
    void turnL(){
        int tmp=front;
        front=right;
        right=back;
        back=left;
        left=tmp;
    }
    void turnR(){
        int tmp=front;
        front=left;
        left=back;
        back=right;
        right=tmp;
    }
}

