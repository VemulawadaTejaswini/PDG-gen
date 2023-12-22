import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws Exception {
        // Here your code !
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        String line;
        String judge;
        int[] score = new int[3];
        
        while (true) {
            line = br.readLine();
            
            String ary[] = line.split(" ");
            score[0] = Integer.parseInt(ary[0]);
            score[1] = Integer.parseInt(ary[1]);
            score[2] = Integer.parseInt(ary[2]);
            
            if(score[0] == -1 && score[1] == -1 && score[2] == -1){
                break;
            }
            
            judge = judgeScore(score[0], score[1], score[2]);
            
            System.out.println(judge);
        }
        
    }
    
    static String judgeScore(int tyukan, int kimatu, int sai){
        int sum = tyukan + kimatu;
        String judge;
        
        if(tyukan == -1 || kimatu == -1){
            judge = "F";
        }else if(sum >= 80){
            judge = "A";
        }else if(sum >= 65){
            judge = "B";
        }else if(sum >= 50){
            judge = "C";
        }else if(sum >= 30){
            judge = "D";
        }else{
            judge = "F";
        }
        
        if(sai >= 50){
            judge = "C";
        }
        
        return judge;
    }
}