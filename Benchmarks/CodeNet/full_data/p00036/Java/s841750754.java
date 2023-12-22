import java.util.*;
public class Main{
    String A = "1100000011";
    String B = "10000000100000001000000010000000";
    String C = "1111";
    String D = "1000000110000001";
    String E = "11000000011";
    String F = "10000000110000001";
    String G = "110000011";
    String[] blocks = {A, B, C, D, E, F, G};
    String[] dic = {"A", "B", "C", "D", "E", "F", "G"};
    
    void run(){
        Scanner sc = new Scanner(System.in);        
        while(sc.hasNext()){
            String str = new String();
            for(int _ = 0; _ < 8; _++){
                str += sc.next();
            }
            System.out.println(dic[solve(str)]);
        }
    }
    int solve(String str){
        for(int i = 0; i < 8 * 8; i++){
            for(int ii = 0; ii < 7; ii++){
                String s = str.substring(i, i + blocks[ii].length());
                if(s.equals(blocks[ii])){
                    return ii;
                }
            }
        }
        return -1;
    }
    public static void main(String[] args){
        new Main().run();
    }
}