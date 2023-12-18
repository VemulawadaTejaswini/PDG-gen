import java.util.*;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        // 整数の入力
        int n = sc.nextInt();
        char[][] charList=new char[n][];
        int[] result=new int[26];
        int[][] num=new int[26][n];
        for(int i=0;i<result.length;i++){
            result[i]=100000;
            for(int j=0;j<n;j++){
                num[i][j]=0;
            }
        }

        for(int i=0;i<n;i++){
            charList[i]=sc.next().toCharArray();
            for(int j=0;j<charList[i].length;j++){
                num[charList[i][j]-96][i]++;
            }
            for(int j=0;j<26;j++){
                if(result[j]>num[j][i]){
                    result[j]=num[j][i];
                }
            }
        }
        String s="";
        for(int i=0;i<26;i++){
            for(int j=0;j<result[i];j++){
                s=s+(char)(96+i);
            }
        }
        System.out.println(s);
    }
}