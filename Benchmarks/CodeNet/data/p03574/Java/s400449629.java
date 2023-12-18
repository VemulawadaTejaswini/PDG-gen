import java.util.*;

public class Main{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int H = sc.nextInt();
        int W = sc.nextInt();
        String[] str = new String[H];
        int[][] count = new int[H][W];
        char[][] c = new char[H][W];
        
        for(int i=0; i<H; i++){
            str[i] = sc.next();
            for(int j=0; j<W; j++){
                c[i][j] = str[i].charAt(j);
                //System.out.println(c[i][j]);
            }
        }
        for(int i=0; i<H; i++){
            for(int j=0; j<W; j++){
                if(i==0 && j==0){
                    if(str[i].charAt(j)=='.'){
                        if(str[i].charAt(j+1)=='#'){
                            count[i][j]++;
                        }if(str[i+1].charAt(j)=='#'){
                            count[i][j]++;
                        }if(str[i+1].charAt(j+1)=='#'){
                            count[i][j]++;
                        }
                    }
                }else if(i==0 && j!=0 && j!=W-1){
                    if(str[i].charAt(j)=='.'){
                        if(str[i].charAt(j-1)=='#'){
                            count[i][j]++;
                        }if(str[i].charAt(j+1)=='#'){
                            count[i][j]++;
                        }if(str[i+1].charAt(j-1)=='#'){
                            count[i][j]++;
                        }if(str[i+1].charAt(j)=='#'){
                            count[i][j]++;
                        }if(str[i+1].charAt(j+1)=='#'){
                            count[i][j]++;
                        }
                    }
                }else if(i==0 && j==W-1){
                    if(str[i].charAt(j)=='.'){
                        if(str[i].charAt(j-1)=='#'){
                            count[i][j]++;
                        }if(str[i+1].charAt(j-1)=='#'){
                            count[i][j]++;
                        }if(str[i+1].charAt(j)=='#'){
                            count[i][j]++;
                        }
                    }
                }else if(i!=0 && i!=H-1 && j==0){
                    if(str[i].charAt(j)=='.'){
                        if(str[i-1].charAt(j)=='#'){
                            count[i][j]++;
                        }if(str[i-1].charAt(j+1)=='#'){
                            count[i][j]++;
                        }if(str[i].charAt(j+1)=='#'){
                            count[i][j]++;
                        }if(str[i+1].charAt(j)=='#'){
                            count[i][j]++;
                        }if(str[i+1].charAt(j+1)=='#'){
                            count[i][j]++;
                        }
                    }
                }else if(i!=0 && i!=H-1 && j==W-1){
                    if(str[i].charAt(j)=='.'){
                        if(str[i-1].charAt(j-1)=='#'){
                            count[i][j]++;
                        }if(str[i-1].charAt(j)=='#'){
                            count[i][j]++;
                        }if(str[i].charAt(j-1)=='#'){
                            count[i][j]++;
                        }if(str[i+1].charAt(j-1)=='#'){
                            count[i][j]++;
                        }if(str[i+1].charAt(j)=='#'){
                            count[i][j]++;
                        }
                    }
                }else if(i==H-1 && j==0){
                    if(str[i].charAt(j)=='.'){
                        if(str[i-1].charAt(j)=='#'){
                            count[i][j]++;
                        }if(str[i-1].charAt(j+1)=='#'){
                            count[i][j]++;
                        }if(str[i].charAt(j+1)=='#'){
                            count[i][j]++;
                        }
                    }
                }else if(i==H-1 && j!=0 && j!=W-1){
                    if(str[i].charAt(j)=='.'){
                        if(str[i-1].charAt(j-1)=='#'){
                            count[i][j]++;
                        }if(str[i-1].charAt(j)=='#'){
                            count[i][j]++;
                        }if(str[i-1].charAt(j+1)=='#'){
                            count[i][j]++;
                        }if(str[i].charAt(j-1)=='#'){
                            count[i][j]++;
                        }if(str[i].charAt(j+1)=='#'){
                            count[i][j]++;
                        }
                    }
                }else if(i==H-1 && j==W-1){
                    if(str[i].charAt(j)=='.'){
                        if(str[i-1].charAt(j-1)=='#'){
                            count[i][j]++;
                        }if(str[i-1].charAt(j)=='#'){
                            count[i][j]++;
                        }if(str[i].charAt(j-1)=='#'){
                            count[i][j]++;
                        }
                    }
                }else{
                    if(str[i].charAt(j)=='.'){
                        if(str[i-1].charAt(j-1)=='#'){
                            count[i][j]++;
                        }if(str[i-1].charAt(j)=='#'){
                            count[i][j]++;
                        }if(str[i-1].charAt(j+1)=='#'){
                            count[i][j]++;
                        }if(str[i].charAt(j-1)=='#'){
                            count[i][j]++;
                        }if(str[i].charAt(j+1)=='#'){
                            count[i][j]++;
                        }if(str[i+1].charAt(j-1)=='#'){
                            count[i][j]++;
                        }if(str[i+1].charAt(j)=='#'){
                            count[i][j]++;
                        }if(str[i+1].charAt(j+1)=='#'){
                            count[i][j]++;
                        }
                    }
                }
            }
        }
        for(int i=0; i<H; i++){
            for(int j=0; j<W; j++){
                if(c[i][j]=='#'){
                    System.out.print(c[i][j]);
                }else{
                    System.out.print(count[i][j]);
                }
            }
        System.out.println("");
        }
    }
}