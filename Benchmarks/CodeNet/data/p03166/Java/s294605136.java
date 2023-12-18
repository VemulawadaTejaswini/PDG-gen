

import java.util.LinkedList;
import java.util.Scanner;

public class Main {

    static int[][] aa;
    static int maxx(int ind,LinkedList<Integer>[] linkedLists,int flag){
        if(aa[ind][flag]!=-1){
            return aa[ind][flag];
        }
        if(flag==0){
            int maxs=0;
            for(int j=1;j<linkedLists.length;j++){
                maxs=Math.max(maxs,maxx(j,linkedLists,1));
            }
            return aa[ind][flag]=maxs;
        }
        else{
            int maxs=0;
            for(Integer i:linkedLists[ind]){
                maxs=Math.max(maxs,maxx(i,linkedLists,1)+1);
            }
            return aa[ind][flag]=maxs;
        }

    }


    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        int n= scanner.nextInt();
        int m= scanner.nextInt();
        LinkedList<Integer>[] linkedLists=new LinkedList[n+1];
        for(int j=0;j<=n;j++){
            linkedLists[j]=new LinkedList<>();
        }
        for(int j=0;j<m;j++){
            linkedLists[scanner.nextInt()].add(scanner.nextInt());
        }
        aa=new int[n+1][2];
        for(int j=0;j<=n;j++){
            for(int i=0;i<2;i++){
                aa[j][i]=-1;
            }
        }
        System.out.println(maxx(1,linkedLists,0));
    }

}
