import java.util.*;
class Main {

    int trialNum;
    
    Main() {
        trialNum = 0;
    }

    int findMin(int[] h, int start, int end) {
        int min = h[start];
        for(int i = start; i <= end; i++) {
            if(min > h[i]) min = h[i];
        }
        return min;
    }

    int[] findZeroPos(int[] h, int start, int end) {
        List<Integer> list = new ArrayList<>();
        for(int i = start; i <=end; i++) {
            if(h[i] == 0) list.add(i);
        }
        int[] zeroPos = new int[list.size()];
        for (int i = 0; i < list.size(); i++) {
            zeroPos[i] = list.get(i);
        }
        return zeroPos;
    }

    void watering(int[] h, int start, int end, int n) {
        for(int i = start; i <= end; i++) {
            h[i] -= n;
        }
        trialNum += n;
    }

    void growFlower(int[] h, int l, int r) {
        if(l >= r) {
            trialNum += h[l];
            return;
        }
        else {
            if(h[l] == 0) l++;
            if(h[r] == 0) r--;
            int min = findMin(h, l, r);
            watering(h, l, r, min);
            int[] zeroPos = findZeroPos(h, l, r);
            growFlower(h, l, zeroPos[0]-1);
            for(int i = 1; i < zeroPos.length; i++) {
                growFlower(h, zeroPos[i-1]+1, zeroPos[i]-1);
            }
            growFlower(h, zeroPos[zeroPos.length-1], r);
        }
    }

    void print(int[] h) {
        for(int i = 0; i < h.length; i++) {
            System.out.print(h[i]+" ");
        }
        System.out.print("\n");
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int[] h = new int[N];
        for(int i = 0; i < N; i++) {
            h[i] = sc.nextInt();
        }
        Main myG = new Main();
        myG.growFlower(h, 0, N-1);
        System.out.println(myG.trialNum);
    }
}