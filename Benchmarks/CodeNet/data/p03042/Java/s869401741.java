import java.util.*;


public class Main {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        String Y = sc.next();
        String[] A = new String[2];
        A[0] = Y.substring(0,2);
        A[1] = Y.substring(2,4);
        
        System.out.println(judgement(A));    
        
    }
    
    public static String judgement(String[] Application){
        int bef = Integer.parseInt(Application[0]);
        int aft = Integer.parseInt(Application[1]);
        int befres = bunki(bef);
        int aftres = bunki(aft);
        String result = "";
        
        if(befres == 0 && aftres == 0){
            result = "NA";
        }else if(befres == 0 && aftres == 1){
            result = "YYMM";
        }else if(befres == 1 && aftres == 0){
            result = "MMYY";
        }else if(befres == 1 && aftres == 1){
            result = "AMBIGUOUS";
        }else if(befres == 2 && aftres == 1){
            result = "YYMM";
        }else if(befres == 1 && aftres == 2){
            result = "MMYY";
        }else if(befres == 2 && aftres == 2){
            result = "NA";
        }else if(befres == 2 && aftres == 0){
            result = "NA";
        }else if(befres == 0 && aftres == 2){
            result = "NA";
        }else{
            result = "MMYY";
        }
        
        return result;
    }
    
    public static int bunki(int num){
        int resnum = 0;
        if(num == 00){
            resnum = 0;
        }else if(0 < num && num <= 12){
            resnum = 1;
        }else if(num > 12){
            resnum = 2;       
        }
        return resnum;
    }
}