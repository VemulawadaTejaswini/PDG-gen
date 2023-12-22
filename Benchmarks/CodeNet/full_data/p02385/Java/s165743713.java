import java.util.Scanner;
    
public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String labelStr1 = scanner.nextLine();
        String labelStr2 = scanner.nextLine();
        
        String[] labelArr1 = labelStr1.split(" ");
        String[] labelArr2 = labelStr2.split(" ");
        
        int dice1[] = new int[6];
        int dice2[] = new int[6];
        
        for (int i=0; i<6; i++) {
            dice1[i] = Integer.parseInt(labelArr1[i]);
            dice2[i] = Integer.parseInt(labelArr2[i]);
        }
        
        DiceUtil diceUtil1 = new DiceUtil();
        diceUtil1.setDice(dice1[0],dice1[1],dice1[2],dice1[3],dice1[4],dice1[5]);

        DiceUtil diceUtil2 = new DiceUtil();
        diceUtil2.setDice(dice2[0],dice2[1],dice2[2],dice2[3],dice2[4],dice2[5]);
        
        
        while(true){
            if(diceUtil1.equals(diceUtil2)) break;
            diceUtil2.orderDice('N');
            if(diceUtil1.equals(diceUtil2)) break;
            diceUtil2.orderDice('N');
            if(diceUtil1.equals(diceUtil2)) break;
            diceUtil2.orderDice('N');
            if(diceUtil1.equals(diceUtil2)) break;
            diceUtil2.orderDice('W');
            if(diceUtil1.equals(diceUtil2)) break;
            diceUtil2.orderDice('E');
            diceUtil2.orderDice('E');
            if(diceUtil1.equals(diceUtil2)) break;
            System.out.println("No");
            System.exit(0);
        }
        
        System.out.println("Yes");        

    }
}

class DiceUtil {
    
    int dice[];
    
    DiceUtil() {
        dice = new int[6];
    }
    
    public void setDice(int num1, int num2, int num3, int num4, int num5, int num6){
        dice[0] = num1;
        dice[1] = num2;
        dice[2] = num3;
        dice[3] = num4;
        dice[4] = num5;
        dice[5] = num6;
    }
    
    public void orderDice(char order){
        int tmp = 0;
        switch(order){
            case 'N':
                tmp = dice[0];
                dice[0] = dice[1];
                dice[1] = dice[5];
                dice[5] = dice[4];
                dice[4] = tmp;
                break;
            case 'S':
                tmp = dice[0];
                dice[0] = dice[4];
                dice[4] = dice[5];
                dice[5] = dice[1];
                dice[1] = tmp;
                break;
            case 'E':
                tmp = dice[0];
                dice[0] = dice[3];
                dice[3] = dice[5];
                dice[5] = dice[2];
                dice[2] = tmp;
                break;
            case 'W':
                tmp = dice[0];
                dice[0] = dice[2];
                dice[2] = dice[5];
                dice[5] = dice[3];
                dice[3] = tmp;
                break;
            case 'R':
                tmp = dice[1];
                dice[1] = dice[3];
                dice[3] = dice[4];
                dice[4] = dice[2];
                dice[2] = tmp;
                break;
            case 'L':
                tmp = dice[1];
                dice[1] = dice[2];
                dice[2] = dice[4];
                dice[4] = dice[3];
                dice[3] = tmp;
                break;
        }
    }
    
    boolean equals(DiceUtil diceUtil){
        DiceUtil tmpDiceUtil = diceUtil;
        if(this.dice[0] == tmpDiceUtil.dice[0]){
            if(this.dice[5] == tmpDiceUtil.dice[5]){
                
                for(int i = 0; i < 4; i++){
                    if(this.dice[1] == tmpDiceUtil.dice[1] &&
                        this.dice[2] == tmpDiceUtil.dice[2] &&
                        this.dice[3] == tmpDiceUtil.dice[3] &&
                        this.dice[4] == tmpDiceUtil.dice[4]) return true;
                    tmpDiceUtil.orderDice('R');
                }
            }
        }
        return false;
    }
};

