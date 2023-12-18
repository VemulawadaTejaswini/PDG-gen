import java.util.*;
 
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int H = Integer.parseInt(sc.next());
        int W = Integer.parseInt(sc.next());
        String[][] s = new String[H][W];
        for(int i=0; i<H; i++) {
            String line = sc.next();
            String[] sp = line.split("");
            for(int j=0; j<W; j++) {
                s[i][j] = sp[j];
            }
        }
        String ans = "Yes";
        for(int i=0; i<H; i++) {
            for(int j=0; j<W; j++) {
                if(i == 0) {
                    if(j == 0) {
                        if(s[i+1][j].equals("#") || s[i][j+1].equals("#")) {
                            continue;
                        }else {
                            ans = "No";
                            break;
                        }
                    }else if(j == W-1) {
                        if(s[i][j-1].equals("#") || s[i+1][j].equals("#")) {
                            continue;
                        }else {
                            ans = "No";
                            break;
                        }
                    }else {
                        if(s[i+1][j].equals("#") || s[i-1][j].equals("#") || s[i][j+1].equals("#")) {
                            continue;
                        }else {
                            ans = "No";
                            break;
                        }
                    }
                }
                
                if(i == H-1) {
                    if(j == 0) {
                        if(s[i-1][j].equals("#") || s[i][j+1].equals("#")) {
                            continue;
                        }else {
                            ans = "No";
                            break;
                        }
                    }else if(j == W-1) {
                        if(s[i-1][j].equals("#") || s[i][j-1].equals("#")) {
                            continue;
                        }else {
                            ans = "No";
                            break;
                        }
                    }else {
                        if(s[i][j+1].equals("#") || s[i-1][j].equals("#") || s[i][j-1].equals("#")) {
                            continue;
                        }else {
                            ans = "No";
                            break;
                        }
                    }
                }
                
                if(j == 0) {
                    if(s[i+1][j].equals("#") || s[i-1][j].equals("#") || s[i][j+1].equals("#")) {
                        continue;
                    }else {
                        ans = "No";
                        break;
                    }
                }
                
                if(j == W-1) {
                    if(s[i+1][j].equals("#") || s[i-1][j].equals("#") || s[i][j-1].equals("#")) {
                        continue;
                    }else {
                        ans = "No";
                        break;
                    }
                }
            }
        }
        System.out.println(ans);
    } 
}