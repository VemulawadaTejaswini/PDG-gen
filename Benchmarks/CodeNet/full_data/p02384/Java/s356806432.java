import java.util.*;

class Dice{
    int top,front,right,left,back,bottom;   //1,2,3,4,5,6

    //コンストラクタ
    Dice(int d1,int d2,int d3,int d4,int d5,int d6){
        top = d1;
        front = d2;
        right = d3;
        left = d4;
        back = d5;
        bottom = d6;
    }

    //前面を返すクラス
    int TurnFront(int d1,int d3){
        int result;
        //上面1or6の時
        if(d1 == top || d1 == bottom){
            if(d3 == front) result = 3;
            else if(d3 == right) result = 5;
            else if(d3 == left) result = 2;
            else    result = 4;
        }
        //上面2or5の時
        else if(d1 == front || d1 == back){
            if(d3 == top)   result = 4;
            else if(d3 == right)    result = 1;
            else if(d3 == left) result = 6;
            else    result = 3;
        }
        //上面3or4の時
        else{
            if(d3 == top)   result = 2;
            else if(d3 == front)    result = 6;
            else if(d3 == back) result = 1;
            else    result = 5;
        }
        //上面4or5or6の時
        if(d1 == left || d1 == back || d1 == bottom)    result = 7 - result;

        return result;
    }
}

class Main{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        
        int d1 = sc.nextInt();
        int d2 = sc.nextInt();
        int d3 = sc.nextInt();
        int d4 = sc.nextInt();
        int d5 = sc.nextInt();
        int d6 = sc.nextInt();

        Dice d = new Dice(d1,d2,d3,d4,d5,d6);

        int num = sc.nextInt();

        for(int i = 0;i < num;i++){
            int t = sc.nextInt();
            int f = sc.nextInt();

            int result = d.TurnFront(t,f);
            if(result == 1) System.out.println(d.top);
            if(result == 2) System.out.println(d.front);
            if(result == 3) System.out.println(d.right);
            if(result == 4) System.out.println(d.left);
            if(result == 5) System.out.println(d.back);
            if(result == 6) System.out.println(d.bottom);
        }
    }
}
