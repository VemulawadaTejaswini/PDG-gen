import java.util.Scanner;


public class Main {
    public static void main(String[] args){
        
        class Dice {
            private int[] surface = new int[6];

            public void setNum(int index, int num){
                this.surface[index] = num;
            }

            public int getNum(int index){
                return this.surface[index];
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
        Dice dice = new Dice();

        for(int i = 0; i < 6; i++){
            dice.setNum(i, scanner.nextInt());
        }

        String command = scanner.next();
        for(String cmd : command.split("")){
            dice.move(cmd);
        }

        System.out.println(dice.getNum(0));

        scanner.close();
    }
}


