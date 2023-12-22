import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
 
public class Main {
 
    public static final int BIG_NUM  = 2000000000;
    public static final int MOD  = 1000000007;
 
    public static void main(String[] args) {
 
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
 
        try {
 
            String str[] = br.readLine().split("\\s+");
            int array[] = new int[str.length];
 
            for(int i = 0; i < str.length; i++){
                array[i] = Integer.parseInt(str[i]);
            }
 
            Dice dice = new Dice();
            dice.setNumber(array[0], array[1], array[2], array[3], array[4], array[5]);
 
            int Q = Integer.parseInt(br.readLine());
 
            String tmp_str[] = new String[2];
            int top_num,front_num;
 
            for(int loop = 0; loop < Q; loop++){
 
                tmp_str = br.readLine().split("\\s+");
                top_num = Integer.parseInt(tmp_str[0]);
                front_num = Integer.parseInt(tmp_str[1]);
 
                System.out.println(dice.query(top_num, front_num));
            }
 
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
 
class Dice{
 
    private int number[];
    private int work[];
    private final String order = "NNNNWNNNWNNNENNNENNNWNNN";
 
    Dice(){
        number = new int[6];
        work = new int[6];
    }
 
 
    public void roll(char dst){
        for(int i = 0; i < 6; i++) work[i] = number[i];
        switch(dst){
        case 'E':
            setNumber(work[3],work[1],work[0],work[5],work[4],work[2]);
            break;
        case 'N':
            setNumber(work[1],work[5],work[2],work[3],work[0],work[4]);
            break;
        case 'S':
            setNumber(work[4],work[0],work[2],work[3],work[5],work[1]);
            break;
        case 'W':
            setNumber(work[2],work[1],work[5],work[0],work[4],work[3]);
            break;
        }
    };
 
    public int query(int top_num,int front_num){
 
        int save_data[] = new int[6];
        for(int i = 0; i < number.length; i++){
            save_data[i] = number[i];
        }
 
        int ret = -1;
 
        for(int i = 0; i < order.length(); i++){
            roll(order.charAt(i));
            if(number[0] == top_num && number[1] == front_num){
                ret = number[2];
                break;
            }
        }
 
        for(int i = 0; i < save_data.length; i++){
            number[i] = save_data[i];
        }
 
        return ret;
    }
 
    public int getTop(){
        return number[0];
    }
 
    public void setNumber(int n0,int n1,int n2,int n3,int n4,int n5){
        number[0] = n0;
        number[1] = n1;
        number[2] = n2;
        number[3] = n3;
        number[4] = n4;
        number[5] = n5;
    }
};
