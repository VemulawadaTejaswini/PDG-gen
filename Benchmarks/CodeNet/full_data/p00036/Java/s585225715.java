import java.util.Scanner;
public class Main {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        String[] st = new String[8];
        int[] x = new int[4];
        int[] y = new int[4];
        int index = 0;
        for(int i = 0 ; i < 8 ; i++){
            st[i] = input.nextLine();
        }
        for(int i = 0 ; i < 8 ; i++){
            for(int j = 0 ; j < 8 ; j++){
                if(st[i].charAt(j) == '1'){
                    x[index] = j;
                    y[index] = i;
                    index++;
                }
            }
        }
        System.out.println(Tetris(x,y));
        input.close();
    }

    public static String Tetris(int[] x,int[] y){
        if(x[1] == x[0]+1 && y[1] == y[0]){
            if(x[2] == x[0] && y[2] == y[0]+1){
                return "A";
            }else if(x[2] == x[1] && y[2] == y[0]+1){
                return "E";
            }else if(x[2] == x[1]+1 && y[2] == y[1]){
                return "C";
            }else if(x[2]+1 == x[0] && y[2] == y[0]+1){
                return "G";
            }
        }else if(x[0] == x[1] && y[0]+1 == y[1]){
            if(x[1] == x[2] && y[1]+1 == y[2]){
                return "B";
            }else{
                return "F";
            }
        }else{
            return "D";
        }
        return "Impossible";
    }
}