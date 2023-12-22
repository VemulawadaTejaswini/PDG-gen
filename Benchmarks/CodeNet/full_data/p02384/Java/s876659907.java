import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
 
public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String str = br.readLine();
        Dice dice = new Dice(str);
        int n = Integer.parseInt(br.readLine());
        StringBuilder sb = new StringBuilder();
        String str2[];
        int i,j=0;
        while(n-->0){
            str2 = br.readLine().split(" ");
            for(i=0;i<6;i++){
                if(dice.getStr(i).equals(str2[0])) break;
            }
            switch(i){
                case 0:
                    break;
                case 1:
                    dice.moveN();
                    break;
                case 2:
                    dice.moveW();
                    break;
                case 3:
                    dice.moveE();
                    break;
                case 4:
                    dice.moveS();
                    break;
                case 5:
                    dice.moveN();
                    dice.moveN();
                    break;
            }
            for(i=1;i<5;i++){
                if(dice.getStr(i).equals(str2[1])) break;
            }
            switch(i){
                case 1:
                    j = 2;
                    break;
                case 2:
                    j = 4;
                    break;
                case 3:
                    j = 1;
                    break;
                case 4:
                    j = 3;
                    break;
                default:
                    break;
            }    
            sb.append(dice.getStr(j)).append("\n");
        }
        System.out.print(sb);
    }
}
 
class Dice{
    private String str[];//0=???,1=???,2=???,3=???,4=??????,5=???
    private String tmp;
     
    Dice(String str) {
        this.str = new String[6];
        this.str = str.split(" ");
    }
     
    public String getStr(int n){
        return this.str[n];
    }
     
    void moveW(){
        tmp = this.str[0];
        this.str[0] = this.str[2];
        this.str[2] = this.str[5];
        this.str[5] = this.str[3];
        this.str[3] = tmp;
    }
     
    void moveE(){
        tmp = this.str[0];
        this.str[0] = this.str[3];
        this.str[3] = this.str[5];
        this.str[5] = this.str[2];
        this.str[2] = tmp;
    }
     
    void moveS(){
        tmp = this.str[0];
        this.str[0] = this.str[4];
        this.str[4] = this.str[5];
        this.str[5] = this.str[1];
        this.str[1] = tmp;
    }
     
    void moveN(){
        tmp = this.str[0];
        this.str[0] = this.str[1];
        this.str[1] = this.str[5];
        this.str[5] = this.str[4];
        this.str[4] = tmp;
    }
}
