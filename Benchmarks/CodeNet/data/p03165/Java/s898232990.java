import java.util.*;
import java.io.*;
import java.lang.*;

 class Main{
    
    static BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
    static StringBuilder sb = new StringBuilder("");
    static StringTokenizer stk = new StringTokenizer("");

    public static void main(String args[]){
        try{
            String s = bf.readLine();
            String t = bf.readLine();
            solver(s,t);
        }catch(Exception e){
            e.printStackTrace();
        }
    }

    public static void solver(String s, String t){
        StringBuilder[][] lcs = new StringBuilder[s.length()][t.length()];

        for(int i=0;i<s.length();i++){ //for string s
            for(int j=0;j<t.length();j++){//for string t
                lcs[i][j] = new StringBuilder("");
                if(s.charAt(i) == t.charAt(j)){
                    lcs[i][j].append((i-1 >= 0 && j-1 >= 0) ? lcs[i-1][j-1] : "").append(s.charAt(i)+"");
                }else{

                    if(i-1 >=0 && j-1 >= 0){
                        if(lcs[i-1][j].length() > lcs[i][j-1].length()){
                            lcs[i][j].append(lcs[i-1][j]);
                        }else{
                            lcs[i][j].append(lcs[i][j-1]);
                        }
                    }else if(i-1 >= 0 && j-1 < 0){
                        lcs[i][j].append(lcs[i-1][j]);
                    }else if(i-1 < 0 && j-1 >= 0){
                        lcs[i][j].append(lcs[i][j-1]);
                    }

                }
                
            }
        }
        
        System.out.println(lcs[s.length()-1][t.length()-1].toString());
    }

}