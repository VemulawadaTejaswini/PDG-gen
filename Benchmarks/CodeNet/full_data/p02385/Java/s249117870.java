import java.util.Scanner;

public class Main {
    public static void main(String args[]){
        Scanner scan = new Scanner(System.in);

        int da[]=new int[6];
        int db[]=new int[6];
        for(int i=0;i<6;i++){
            da[i]=scan.nextInt();
        }
        for(int i=0;i<6;i++){
            db[i]=scan.nextInt();
        }
        Dice diceA =new Dice(da[0],da[1],da[2],da[3],da[4],da[5]);
        Dice diceB =new Dice(db[0],db[1],db[2],db[3],db[4],db[5]);

        while(true){
            if(diceA.check(diceB)) break;
            diceB.turnN();
            if(diceA.check(diceB)) break;
            diceB.turnN();
            if(diceA.check(diceB)) break;
            diceB.turnN();
            if(diceA.check(diceB)) break;
            diceB.turnW();
            if(diceA.check(diceB)) break;
            diceB.turnE();  diceB.turnE();
            if(diceA.check(diceB)) break;
            System.out.println("No");
            System.exit(0);
        }
        System.out.println("Yes");
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

    boolean check(Dice e){
        Dice tmp = e;
        if(this.top == tmp.top){
            if(this.bottom == tmp.bottom){
                for(int i = 0; i < 4; i++){
                    if(this.checkSide(tmp)) return true;
                    tmp.turnR();
                }
            }
        }
        return false;
    }

    boolean checkSide(Dice e){
       return (this.front==e.front && this.back==e.back && this.left==e.left && this.right==e.right);
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

