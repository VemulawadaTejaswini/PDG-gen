import java.util.Scanner;
import java.util.Arrays;
class Main{
    public static void main(String arg[]){
        Scanner scn=new Scanner(System.in);
        int n = scn.nextInt();
        int m = scn.nextInt();
        int x = scn.nextInt();
        int[] line = new int[n];
        Arrays.fill(line,0);
        for(int i=0;i<m;i++){
            int buf = scn.nextInt();
            line[buf]++;
        }
        int rCost = 0;
        int lCost = 0;
        for(int i=0;i<n;i++){
            if(line[i]==1&&i<x){
                rCost++;
            }else if(line[i]==1){
                lCost++;
            }
        }
        System.out.println(Math.min(rCost,lCost));
    }
}
