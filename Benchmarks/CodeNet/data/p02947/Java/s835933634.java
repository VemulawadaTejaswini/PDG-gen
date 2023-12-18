import java.util.Scanner;
import java.util.ArrayList;
class Main {
    public static void main(String[] args) {
        Scanner stdIn = new Scanner(System.in);
        
        int n = stdIn.nextInt();
        String[] s = new String[n];

        for(int i = 0;i < n;i++){
            s[i] = stdIn.next();
        }

        long count = 0;

        int[][] check = new int[n][n];

        for(int i = 0;i < n;i++){
            for(int j = i+1;j < n;j++) {
                if(check[i][j] == 0) {
                    if(permutation(s[i],s[j])) {
                        count++;
                        for(int k = j;k > i;k--) {
                            if(check[i][k] == 2){
                                count++;
                                check[k][j] = 2;
                            }else if(check[i][k] == 1){
                                check[k][j] = 1;
                            }
                        }                      
                        check[i][j] = 2;
                    }else {
                        check[i][j] = 1;
                        for(int k = j;k > i;k--) {
                            if(check[i][k] == 2){
                                check[k][j] = 1;
                            }
                        }  
                    }
                }               
            }
        }
        System.out.println(count);      
    }

    static boolean permutation(String s,String t){      
        int[] letters = new int[256]; //文字コードの仮定;
        
        char[] s_array = s.toCharArray();  
        for(char c:s_array){
            letters[c]++;
        }
        
        for(int i=0;i<t.length();i++){
            int c = (int)t.charAt(i);
            if(--letters[c] < 0){
                return false;
            }
        }
        return true;
    }

}