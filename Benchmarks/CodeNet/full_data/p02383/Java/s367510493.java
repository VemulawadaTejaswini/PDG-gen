import java.util.*;
class Dice{
    int[] dice = new int[6];
    Dice(int a,int b,int c,int d,int e,int f){
       	dice[0] = a;
        dice[1] = b;
        dice[2] = c;
        dice[3] = d;
        dice[4] = e;
        dice[5] = f;
    }
    public int DiceMove(String f){
        int copy1 = 0;
        int copy2 = 0;
        if(f.equals("S")){//
            
            copy1 = dice[1];
            dice[1] = dice[0];
            copy2 = dice[5];
            dice[5] = copy1;
            copy1 = copy2;
            copy2 = dice[4];
            dice[4] = copy1;
            copy1 = copy2;
            dice[0] = copy1;
        }
        else if(f.equals("N")){//
            
           copy1 = dice[4];
            dice[4] = dice[0];
            copy2 = dice[5];
            dice[5] = copy1;
            copy1 = copy2;
            copy2 = dice[1];
            dice[1] = copy1;
            copy1 = copy2;
            dice[0] = copy1;
            
        }else if(f.equals("W")){//
            
            copy1 = dice[3];
            dice[3] = dice[0];
            copy2 = dice[5];
            dice[5] = copy1;
            copy1 = copy2;
            copy2 = dice[2];
            dice[2] = copy1;
            copy1 = copy2;
            dice[0] = copy1;
            
        }else{ // f. E
            
            copy1 = dice[2];
            dice[2] = dice[0];
            copy2 = dice[5];
            dice[5] = copy1;
            copy1 = copy2;
            copy2 = dice[3];
            dice[3] = copy1;
            copy1 = copy2;
            dice[0] = copy1;
            
        }
        return dice[0];
    }
}
class Main{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int[] D = new int[6];
        int ans = 0;
        
        
        for(int i = 0;i<6;i++){
            D[i] = sc.nextInt();
        }
        
        String line = sc.next();
        String[] array = line.split("");
        
        Dice d = new Dice(D[0],D[1],D[2],D[3],D[4],D[5]);
        
        
        for(String str : array){
            ans = d.DiceMove(str);        
        }
        System.out.println(ans);
            
        
        
       
    }
}
