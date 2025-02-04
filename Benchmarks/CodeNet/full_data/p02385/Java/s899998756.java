import java.util.*;
import java.io.*;

public class Main {
    public static void main(String[] args) throws Exception {
        Scanner sc=new Scanner(System.in);
        int d[];
        d=new int[6];
        for(int i=0;i<6;i++){
            d[i]=sc.nextInt();
        }
        Dice D1=new Dice(d[0],d[1],d[2],d[3],d[4],d[5]);
        for(int i=0;i<6;i++){
            d[i]=sc.nextInt();
        }
        Dice D2=new Dice(d[0],d[1],d[2],d[3],d[4],d[5]);
        if(D2.d2==D1.d1 || D2.d5==D1.d1 || D2.d6==D1.d1){
            while(D2.d1!=D1.d1) D2.roll('N');
        }
        else if(D2.d3==D1.d1) D2.roll('W');
        else if(D2.d4==D1.d1) D2.roll('E');
        if(D2.d2!=D1.d2){
            while(D2.d2!=D1.d2) D2.slide();
        }
        if(D1.d3==D2.d3) System.out.println("Yes");
        else System.out.println("No");
    }
}

class Dice{
    int d1,d2,d3,d4,d5,d6,db;
    Dice(int a,int b,int c,int d,int e,int f){
        this.d1=a;
        this.d2=b;
        this.d3=c;
        this.d4=d;
        this.d5=e;
        this.d6=f;
    }
    void roll(char c){
        switch (c){
            case 'N':
                db=d1;
                d1=d2;
                d2=d6;
                d6=d5;
                d5=db;
                break;
            case 'S':
                db=d1;
                d1=d5;
                d5=d6;
                d6=d2;
                d2=db;
                break;
            case 'E':
                db=d1;
                d1=d4;
                d4=d6;
                d6=d3;
                d3=db;
                break;
            case 'W':
                db=d1;
                d1=d3;
                d3=d6;
                d6=d4;
                d4=db;
                break;
        }
    }
    void slide(){
        db=d2;
        d2=d3;
        d3=d5;
        d5=d4;
        d4=db;
    }
}
