import java.util.*;

public class Main {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] a = new int[n];
        int[][] x = new int[n][];
        int[][] y = new int[n][];
        for (int i=0;i<n;i++){
            a[i]=sc.nextInt();
            x[i] = new int[a[i]];
            y[i] = new int[a[i]];
            for (int j=0;j<a[i];j++){
                x[i][j] = sc.nextInt();
                y[i][j] = sc.nextInt();
            }
        }
        int max = 0;
        for (int i=0;i<Math.pow(2,n);i++){
            boolean b = true;
            int count = 0;
            String s = Integer.toBinaryString(i);
            while (s.length()<n){
                s = "0"+s;
            }
            ArrayList<Integer> array = new ArrayList<>();
            for (int j=0;j<n;j++){
                if (s.charAt(j)=='1'){
                    count++;
                    array.add(j);
                }
            }

            for (int j=0;j<n;j++){
                for (int k=0;k<array.size();k++){
                    for (int l=0;l<a[array.get(k)];l++){
                        boolean bb = array.contains(j);
                        if (x[array.get(k)][l]==j&&y[array.get(k)][l]==0&&bb)b=false;
                        if (x[array.get(k)][l]==j&&y[array.get(k)][l]==1&&!bb)b=false;
                    }
                }
            }
            if (b) {
                max = Math.max(max,count);
            }
        }
        System.out.println(max);
    }
}