import java.util.*;

public class Main {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int m=sc.nextInt();
        int [][] allBit=allBit(n);
        /*for(int i=0;i<allBit.length;i++){
        for(int j=0;j<n;j++)System.out.print(allBit[i][j]);
            System.out.println();
        }*/
        ArrayList<int[]>po=new ArrayList<>();
        for(int i=0;i<m;i++){
            int k=sc.nextInt();
            int[]a=new int[k];
            for(int j=0;j<k;j++){
                a[j]=sc.nextInt();
            }
            po.add(a);
        }
        int[]b=new int[m];
        for(int i=0;i<m;i++){
            b[i]=sc.nextInt();
        }
        long count=0;
        for(int i=0;i<allBit.length;i++){
            boolean bo=true;
            for(int j=0;j<m;j++){
                int c=0;
                for(int l=0;l<po.get(j).length;l++){
                    c+=allBit[i][po.get(j)[l]-1];
                }
                if(c%2!=b[j]){bo=false;break;}
            }
            if(bo)count++;
        }
        System.out.println(count);
    }
    public static int[][] allBit(int n) {
		int[][]a=new int[1<<n][n];
        for(int i=0;i<(1<<n);i++){
            for(int j=0;j<n;j++){
                a[i][j]+=((1&i>>j)==1)?1:0;
            }

        }
		return a;
	}
}
