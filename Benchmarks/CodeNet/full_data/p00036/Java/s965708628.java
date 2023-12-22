import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.*;

public class Main {
    public static void main(String[] args) throws Exception {
        // Your code here!
        String[] inputPlane = new String[8];
        /*int[][] plane = new int[8][8]; 
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        for(int i = 0;i < inputPlane.length;i++){
            inputPlane[i] = br.readLine();
            for(int j = 0;j < inputPlane[i].length();j++){
                plane[i][j] = Integer.parseInt(inputPlane[i].substring(j,j+1));
            }
        }*/
        
        //入力を受付、計算しやすいようにintに変換
        List<int[][]> planeList = new ArrayList<int[][]>();
        Scanner scan = new Scanner(System.in);
        int row = 0;
        while(scan.hasNext()){
            String str = scan.next();
            if(str.length() != 0){
                if(row == 8){
                    row = 0;
                    int[][] plane = new int[8][8];
                    for(int i = 0;i < inputPlane.length;i++){
                        for(int j = 0;j < inputPlane[i].length();j++){
                            plane[i][j] = Integer.parseInt(inputPlane[i].substring(j,j+1));
                        }
                    }
                    planeList.add(plane);
                }
                inputPlane[row++] = str;
            }
        }
        if(!scan.hasNext()){
            int[][] plane = new int[8][8];
            for(int i = 0;i < inputPlane.length;i++){
                for(int j = 0;j < inputPlane[i].length();j++){
                    plane[i][j] = Integer.parseInt(inputPlane[i].substring(j,j+1));
                }
            }
            planeList.add(plane);
        }
        //debug
        for(int i = 0;i < planeList.size();i++){
            int[][] debug = planeList.get(i);
            for(int k = 0;k < debug.length;k++){
                for(int j = 0;j < debug[k].length;j++){
                    System.out.print(debug[k][j]);
                }
                System.out.println();
            }
            System.out.println();
        }
            
        for(int i = 0;i < planeList.size();i++){
            int[][] plane = planeList.get(i);
            if(blockJudgeA(plane))continue;
            if(blockJudgeB(plane))continue;
            if(blockJudgeC(plane))continue;
            if(blockJudgeD(plane))continue;
            if(blockJudgeE(plane))continue;
            if(blockJudgeF(plane))continue;
            if(blockJudgeG(plane))continue;
        }
    }
    //以下各判定
    static boolean blockJudgeA(int[][] plane){
        for(int i = 0;i < plane.length;i++){
            for(int j = 0;j < plane[i].length;j++){
                if(i < 7 && j < 7 && plane[i][j] == 1 && plane[i][j+1] == 1 && plane[i+1][j] == 1){
                    System.out.println("A");
                    return true;
                }
            }
        }
        return false;
    }
    static boolean blockJudgeB(int[][] plane){
        for(int i = 0;i < plane.length;i++){
            for(int j = 0;j < plane[i].length;j++){
                if(j < 5 && plane[i][j] == 1 && plane[i+1][j] == 1 && plane[i+2][j] == 1){
                    System.out.println("B");
                    return true;
                }
            }
        }
        return false;
    }
    static boolean blockJudgeC(int[][] plane){
        for(int i = 0;i < plane.length;i++){
            for(int j = 0;j < plane[i].length;j++){
                if(j < 5 && plane[i][j] == 1 && plane[i][j+1] == 1 && plane[i][j+2] == 1){
                    System.out.println("C");
                    return true;
                }
            }
        }
        return false;
    }
    static boolean blockJudgeD(int[][] plane){
        for(int i = 0;i < plane.length;i++){
            for(int j = 0;j < plane[i].length;j++){
                if(i < 6 && j < 7 && plane[i][j] == 1 && plane[i+1][j] == 1 && plane[i+1][j+1] == 1){
                    System.out.println("D");
                    return true;
                }
            }
        }
        return false;
    }
    static boolean blockJudgeE(int[][] plane){
        for(int i = 0;i < plane.length;i++){
            for(int j = 0;j < plane[i].length;j++){
                if(i < 6 && j < 5 && plane[i][j] == 1 && plane[i][j+1] == 1 && plane[i+1][j+2] == 1){
                    System.out.println("E");
                    return true;
                }
            }
        }
        return false;
    }
    
    static boolean blockJudgeF(int[][] plane){
        for(int i = 0;i < plane.length;i++){
            for(int j = 0;j < plane[i].length;j++){
                if(i < 6 && j < 5 && plane[i][j] == 1 && plane[i][j+1] == 1 && plane[i+1][j+2] == 1){
                    System.out.println("F");
                    return true;
                }
            }
        }
        return false;
    }
    static boolean blockJudgeG(int[][] plane){
        for(int i = 0;i < plane.length;i++){
            for(int j = 0;j < plane[i].length;j++){
                if(i < 6 && j < 6 && plane[i][j] == 1 && plane[i][j+1] == 1 && plane[i+1][j+1] == 1){
                    System.out.println("G");
                    return true;
                }
            }
        }
        return false;
    }
}

