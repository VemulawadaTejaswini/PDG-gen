import java.util.Scanner;

public class Main {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        Player p1 = new Player();
        Player p2 = new Player();
        Game game = new Game(p1,p2);
        game.setTime(sc.nextInt());
        while(true){
            if(game.checkZero()){
                break;
            }
            p1.clear();
            p2.clear();
            for(int i=0; i<game.getTime();i++) {
                sc.reset();
                p1.setCardNumber(sc.nextInt());
                p2.setCardNumber(sc.nextInt());
                game.game();
            }
            game.showResult();
            game.setTime(sc.nextInt());
        }
    }
}

class Player{

    private int score;
    private int cardNumber;

    int getScore(){
        return this.score;
    }

    int getCardNumber(){
        return this.cardNumber;
    }

    void setCardNumber(int cardNumber){
        this.cardNumber = cardNumber;
    }

    void addScore(int score){
        this.score += score;
    }

    void clear(){
        this.cardNumber = 0;
        this.score = 0;
    }
}

class Game{

    private int time;
    private boolean zero;

    Player p1;
    Player p2;

    Game(Player p1, Player p2){
        this.p1 = p1;
        this.p2 = p2;
    }
    void setTime(int time){
        this.time = time;
    }
    int getTime(){
        return this.time;
    }

    void game(){
        if(p1.getCardNumber()>p2.getCardNumber()){
            p1.addScore(p1.getCardNumber() + p2.getCardNumber());
        }else if(p2.getCardNumber()>p1.getCardNumber()){
            p2.addScore(p1.getCardNumber() + p2.getCardNumber());
        }else{
            p1.addScore(p1.getCardNumber());
            p2.addScore(p2.getCardNumber());
        }
    }

    void showResult(){
        System.out.println(p1.getScore() + " " + p2.getScore());
    }

    boolean checkZero(){
        if(this.time == 0){
            return true;
        }
        return false;
    }
}