import java.util.*;

class Main {
    
    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        int datasets = in.nextInt();
        for(int k = 0; k < datasets; k++){
            String s1 = in.next();
            String s2 = in.next();
            int len1 = s1.length();
            int len2 = s2.length();
            int[][] arr = new int[len1 + 1][len2 + 1];
            int lcs = 0;
            
            for(int i=1; i<=len1; i++) {
					for(int j=1; j<=len2; j++) {
						if(s1.charAt(i-1) == s2.charAt(j-1)){
						    arr[i][j] = arr[i-1][j-1] + 1;
						}
						else {
							arr[i][j] = Math.max(arr[i][j-1], arr[i-1][j]);
						}
						lcs = arr[i][j];
					}
					
            }
            System.out.println(lcs);
        }
        in.close();
    }
}
