import java.util.*;

public class Main {
    public static void main(String[] args) throws Exception {
        
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        String[] splitS;
        int[][] sData = new int[N][26];
        int match = 0;
        
        for(int i = 0; i < N; i++){
            String s = sc.next();
            splitS = s.split("", 0);
            
            for(int j = 0; j < splitS.length; j++){
                switch(splitS[j]){
                    case "a":
                        sData[i][0]++;
                        break;
                    case "b":
                        sData[i][1]++;
                        break;
                    case "c":
                        sData[i][2]++;
                        break;
                    case "d":
                        sData[i][3]++;
                        break;
                    case "e":
                        sData[i][4]++;
                        break;
                    case "f":
                        sData[i][5]++;
                        break;
                    case "g":
                        sData[i][6]++;
                        break;
                    case "h":
                        sData[i][7]++;
                        break;
                    case "i":
                        sData[i][8]++;
                        break;
                    case "j":
                        sData[i][9]++;
                        break;
                    case "k":
                        sData[i][10]++;
                        break;
                    case "l":
                        sData[i][11]++;
                        break;
                    case "m":
                        sData[i][12]++;
                        break;
                    case "n":
                        sData[i][13]++;
                        break;
                    case "o":
                        sData[i][14]++;
                        break;
                    case "p":
                        sData[i][15]++;
                        break;
                    case "q":
                        sData[i][16]++;
                        break;
                    case "r":
                        sData[i][17]++;
                        break;
                    case "s":
                        sData[i][18]++;
                        break;
                    case "t":
                        sData[i][19]++;
                        break;
                    case "u":
                        sData[i][20]++;
                        break;
                    case "v":
                        sData[i][21]++;
                        break;
                    case "w":
                        sData[i][22]++;
                        break;
                    case "x":
                        sData[i][23]++;
                        break;
                    case "y":
                        sData[i][24]++;
                        break;
                    default:
                        sData[i][25]++;
                        break;
                }
            }
            
        }
        
        for(int i = 0; i < N - 1; i++){
            for(int j = 1 + i; j < N; j++){
                if(sData[i][0] == sData[j][0] &&
                sData[i][1] == sData[j][1] &&
                sData[i][2] == sData[j][2] &&
                sData[i][3] == sData[j][3] &&
                sData[i][4] == sData[j][4] &&
                sData[i][5] == sData[j][5] &&
                sData[i][6] == sData[j][6] &&
                sData[i][7] == sData[j][7] &&
                sData[i][8] == sData[j][8] &&
                sData[i][9] == sData[j][9] &&
                sData[i][10] == sData[j][10] &&
                sData[i][11] == sData[j][11] &&
                sData[i][12] == sData[j][12] &&
                sData[i][13] == sData[j][13] &&
                sData[i][14] == sData[j][14] &&
                sData[i][15] == sData[j][15] &&
                sData[i][16] == sData[j][16] &&
                sData[i][17] == sData[j][17] &&
                sData[i][18] == sData[j][18] &&
                sData[i][19] == sData[j][19] &&
                sData[i][20] == sData[j][20] &&
                sData[i][21] == sData[j][21] &&
                sData[i][22] == sData[j][22] &&
                sData[i][23] == sData[j][23] &&
                sData[i][24] == sData[j][24] &&
                sData[i][25] == sData[j][25]){
                    match++;
                }
            }
        }
        
        System.out.println(match);
    }
}