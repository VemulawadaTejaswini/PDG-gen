import java.util.Arrays;

class Main {
    public static void main(String args[]) {
        java.util.Scanner sc = new java.util.Scanner(System.in);
        int n = Integer.parseInt(sc.next());
        String[] subsequence = new String[2*n];

        for(int i=0; i<n*2; i++){
            subsequence[i] = sc.next();
        }
        for(int i=0; i<n; i++){
            lcs(subsequence[i*2], subsequence[(i*2)+1]);      
        }
        // 0 1 2 3 4 5 
        
    }

    static private void lcs(String str1, String str2){
        int l1 = str1.length();
        int l2 = str2.length();
        int[][] dp= new int[l1+1][l2+1];
        Arrays.fill(dp[0], 0);
        for(int i=0; i<l1; i++) dp[i][0] = 0;

        for(int i=0; i<str1.length(); i++){
            for(int j=0; j<str2.length(); j++){
                if(str1.charAt(i) == str2.charAt(j)){
                    dp[i+1][j+1] = dp[i][j]+1;
                } else {
                    dp[i+1][j+1] = Math.max(dp[i][j+1], dp[i+1][j]);
                }
                
            }
        }
        System.out.println(dp[l1][l2]);
    }
}


