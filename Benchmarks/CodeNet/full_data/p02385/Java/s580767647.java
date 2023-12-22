import java.util.Scanner;

public class Main {
    public static void  main (String[] args){

class Dice {
    private int[] surface = new int[6];

    public void setNum(int index, int num){
        this.surface[index] = num;
    }

    public int getNum(int index){
        return this.surface[index];
    }

    public int indexOf(int num){
        for(int i = 0; i < this.surface.length; i++){
            if(this.surface[i] == num){
                return i;
            }
        }
        return -1;
    }

    public void move(String vector){
        int sub = 0;
        if(vector.equals("E")){
            sub = this.surface[0];
            this.surface[0] = this.surface[3];
            this.surface[3] = this.surface[5];
            this.surface[5] = this.surface[2];
            this.surface[2] = sub;

        }else if(vector.equals("W")){
            sub = this.surface[0];
            this.surface[0] = this.surface[2];
            this.surface[2] = this.surface[5];
            this.surface[5] = this.surface[3];
            this.surface[3] = sub;

        }else if(vector.equals("N")){
            sub = this.surface[0];
            this.surface[0] = this.surface[1];
            this.surface[1] = this.surface[5];
            this.surface[5] = this.surface[4];
            this.surface[4] = sub;
        }else if(vector.equals("S")){
            sub = this.surface[0];
            this.surface[0] = this.surface[4];
            this.surface[4] = this.surface[5];
            this.surface[5] = this.surface[1];
            this.surface[1] = sub;
        }
    }
}

        Scanner scanner = new Scanner(System.in);

        Dice dice1 = new Dice();
        Dice dice2 = new Dice();

        for(int i = 0; i < 6; i++){
            dice1.setNum(i, scanner.nextInt());
        }

        for(int i = 0; i < 6; i++){
            dice2.setNum(i, scanner.nextInt());
        }


        int index = dice2.indexOf(dice1.getNum(0));

        switch (index){
            case 0:
                break;
            case 1:
                dice2.move("N");
                break;
            case 2:
                dice2.move("W");
                break;
            case 3:
                dice2.move("E");
                break;
            case 4:
                dice2.move("S");
                break;
            case 5:
                dice2.move("S");
                dice2.move("S");
                break;
        }

        index = dice2.indexOf(dice1.getNum(1));
        switch (index){
            case 0:
                break;
            case 1:
                break;
            case 2:
                dice2.move("N");
                dice2.move("W");
                dice2.move("S");
                break;
            case 3:
                dice2.move("N");
                dice2.move("E");
                dice2.move("S");
                break;
            case 4:
                dice2.move("N");
                dice2.move("E");
                dice2.move("E");
                dice2.move("S");
                break;
            case 5:
                break;
        }

        boolean flag = true;
        for(int i = 0; i < 6; i++){
            if(dice1.getNum(i) != dice2.getNum(i)){
                flag = false;
                break;
            }
        }

        if(flag){
            System.out.println("Yes");
        }else{
            System.out.println("No");
        }
        scanner.close();
    }
}

