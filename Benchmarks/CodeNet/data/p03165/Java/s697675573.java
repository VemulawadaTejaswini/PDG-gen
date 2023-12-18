import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

class Main {
    public static String res="";
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        char[] arr1 = reader.readLine().toCharArray();
        char[] arr2 = reader.readLine().toCharArray();
        int[][] dp = new int[arr1.length][arr2.length];
        solve(arr1,arr2,0,0,"");
        System.out.println(res);
    }
    public static void solve(char[] arr1,char[] arr2,int i, int j ,String r){
        if(i==arr1.length || j==arr2.length){
            if(r.length()>res.length()) res=r;
        }
        else if(arr1[i]==arr2[j]){
            r=r+arr1[i];
            solve(arr1,arr2,i+1,j+1,r);
        }
        else {
            solve(arr1,arr2,i+1,j,r);
            solve(arr1,arr2,i,j+1,r);
        }
    }
}
