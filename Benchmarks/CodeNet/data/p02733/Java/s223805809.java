import java.util.*;

public class Main {

    static Map<Integer, Integer> ansMap = new HashMap<>();
    static int H,W,K;
    static int[][] sums;
    static int[][] s;
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        H = sc.nextInt();
        W = sc.nextInt();
        K = sc.nextInt();
        sums = new int[W][H+1];
        s = new int[W][H];
        List<List<Integer>> S = new ArrayList<>();
        for(int i=0;i<W;i++){
            sums[i][0]=0;
        }
        for(int r=0;r<H;r++){
            List<Integer> row = new ArrayList<>();
            String sline = sc.next();
            for(int c=0;c<W;c++){
                int val = sline.charAt(c)-'0';
                s[c][r] = val;
                row.add(val);
                sums[c][r+1] = sums[c][r] + val;
            }
            S.add(row);
        }
        int minCut = 1_000_000_000;
        for(int code=0;code<Math.pow(2,H-1);code++){
            //System.out.println(code +":"+getAns(code) + "-" + bitcnt(code));
            minCut = Math.min(minCut, getAns(code)+bitcnt(code));
        }
        System.out.println(minCut);
    }

    private static int bitcnt(int a){
        int sum=0;
        while(a > 0){
            if((a & 0x01) >0){
                sum++;
            }
            a = (a >> 1);
        }
        return sum;
    }

    private static int getAns(int code){
        int[] groups = new int[H];
        groups[0]=0;
        for(int i=0;i<H-1;i++){
            groups[i+1] = groups[i] + ((code >> i) & 0x01);
        }
        int groupCnt = groups[H-1]+1;
        int[] nowSum = new int[groupCnt];
        int[] nxtSum = new int[groupCnt];
        Arrays.fill(nowSum, 0);
        Arrays.fill(nxtSum, 0);
        int split=0;
        for(int w=0;w<W;w++){
            boolean cutFlag = false;
            for(int g=0;g<groupCnt;g++){
                nxtSum[g] = nowSum[g];
            }
            for(int h=0;h<H;h++){
                nxtSum[groups[h]] += s[w][h];
                if(nxtSum[groups[h]] > K){
                    cutFlag = true;
                }
            }
            if(cutFlag){
                split++;
                for(int i=0;i<groupCnt;i++) {
                    nowSum[i] = nxtSum[i]-nowSum[i];
                    if(nowSum[i] > K){
                        return 1_000_000_000;
                    }
                }
            }else{
                for(int i=0;i<groupCnt;i++) {
                    nowSum[i] = nxtSum[i];
                }
            }
        }
        return split;
    }
    private static void printInts(int[] a){
        for(int p:a){
            System.out.print(p);
        }
        System.out.println();
    }
}
