import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String s = br.readLine();
        String t = br.readLine();
        br.close();
        int[][] arr = new int[s.length()+1][t.length()+1];
        for(int i=1;i<=s.length();i++){
            for (int j=1; j<=t.length();j++){
                arr[i][j]=Math.max(arr[i][j-1],arr[i-1][j]);
                if (s.charAt(i-1)==t.charAt(j-1)){
                    arr[i][j]=arr[i-1][j-1]+1;
                }
            }
        }
        int l = arr[s.length()][t.length()];
        StringBuilder sb = new StringBuilder();
        int r=s.length();
        int c=t.length();
        while(c>0){
            int temp=r;
            while(r-1>0 && arr[r-1][c]==arr[r][c]){
                r--;
            }
            if(r-1==0){
                if((c==1||arr[r][c-1]==0) && arr[r][c]==1){
                    sb.append(t.charAt(c-1));
                    break;
                }
                r=temp;
            } else {
                if(arr[r][c]>arr[r][c-1]) sb.append(t.charAt(c-1));
            }
            c--;
        }
        System.out.println(sb.reverse().toString());
    }
}