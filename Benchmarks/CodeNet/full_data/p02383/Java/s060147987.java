import java.util.*;

// サイコロの面の向き
enum Direction {
    UP,
    FRONT,
    RIGHT,
    LEFT,
    BACK,
    DOWN
};

public class Main {
   public static void main(String[] args) throws Exception {
        // サイコロの面の数値を取得する。
        Scanner scan = new Scanner(System.in);
        int[] labels = new int[6];
        for(int i=0; i < 6 ; i++) {
            int input = scan.nextInt();
            if(0 <= input && input <= 100) {
                labels[i]=input;
            }else{
                System.out.println("サイコロの面の数字の値は０以上１００以下でお願いします。");
            }
        }
        
        Dice dice = new Dice(labels);
        // 命令取得
        String orders = scan.next();
        if(0 <= orders.length() && orders.length() <= 100) {
            String[] strArray = orders.split("");
            for(String s : strArray) {
                switch(s){
                    case "E": 
                        dice.ToRight();
                        break;
                    case "N": 
                        dice.ToBack();
                        break;
                    case "S": 
                        dice.ToFront();
                        break;
                    case "W": 
                        dice.ToLeft();
                        break;
                    default:
                        System.out.println("値おかしい");
                        break;
                }
            }
        } else {
            System.out.println("命令文は０以上１００以下でお願いします。");
        }
        dice.ShowAnswer();
    }
}

class Dice{

    // 面
    Surface[] surfaces;
    
    // コンストラクタ
    Dice(int[] inputLabels) {
        // 面を作成
        surfaces = new Surface[6]; 
        surfaces[0] = new Surface(inputLabels[0], Direction.UP);
        surfaces[1] = new Surface(inputLabels[1], Direction.FRONT);
        surfaces[2] = new Surface(inputLabels[2], Direction.RIGHT);
        surfaces[3] = new Surface(inputLabels[3], Direction.LEFT);
        surfaces[4] = new Surface(inputLabels[4], Direction.BACK);
        surfaces[5] = new Surface(inputLabels[5], Direction.DOWN);
    }

    // 右に転がす
    void ToRight() {
        for (Surface surface : surfaces) {
            surface.ToRight();
        }
    }
    // 左に転がす
    void ToLeft() {
        for (Surface surface : surfaces) {
            surface.ToLeft();
        }
    }
    // 前に転がす
    void ToFront() {
        for (Surface surface : surfaces) {
            surface.ToFront();
        }
    }
    // 後ろに転がす
    void ToBack() {
        for (Surface surface : surfaces) {
            surface.ToBack();
        }
    }
    
    void ShowAnswer(){
        for (Surface surface : surfaces) {
            if(surface.GetDirection() == Direction.UP){
                System.out.println(surface.GetLabel());
            }
        }
    }
}

class Surface {
    // ラベル
    private int label;
    // 向き
    private Direction direction;
    
    
    Surface(int label, Direction direction){
        this.label = label;
        this.direction = direction;
    }

    void ToRight() {
        if(this.direction == Direction.UP) {
            this.direction = Direction.RIGHT;
        } else if(this.direction == Direction.RIGHT) {
            this.direction = Direction.DOWN;
        } else if(this.direction == Direction.DOWN) {
            this.direction = Direction.LEFT;
        } else if(this.direction == Direction.LEFT) {
            this.direction = Direction.UP;
        }
    }
    void ToLeft() {
        if(this.direction == Direction.UP) {
            this.direction = Direction.LEFT;
        } else if(this.direction == Direction.RIGHT) {
            this.direction = Direction.UP;
        } else if(this.direction == Direction.DOWN) {
            this.direction = Direction.RIGHT;
        } else if(this.direction == Direction.LEFT) {
            this.direction = Direction.DOWN;
        }
    }
    void ToFront() {
        if(this.direction == Direction.UP) {
            this.direction = Direction.FRONT;
        } else if(this.direction == Direction.FRONT) {
            this.direction = Direction.DOWN;
        } else if(this.direction == Direction.DOWN) {
            this.direction = Direction.BACK;
        } else if(this.direction == Direction.BACK) {
            this.direction = Direction.UP;
        }
    }
    void ToBack() {
        if(this.direction == Direction.UP) {
            this.direction = Direction.BACK;
        } else if(this.direction == Direction.BACK) {
            this.direction = Direction.DOWN;
        } else if(this.direction == Direction.DOWN) {
            this.direction = Direction.FRONT;
        } else if(this.direction == Direction.FRONT) {
            this.direction = Direction.UP;
        }
    }
    int GetLabel(){
        return this.label;
    }
    
    Direction GetDirection(){
        return this.direction;
    }
    
}
