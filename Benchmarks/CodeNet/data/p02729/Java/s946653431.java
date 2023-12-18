import java.util.*;

class Main{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        long totalPair = 0;
        
        int[] ball = new int[n];
        int[] pairs = new int[n];

        for(int i = 0;i < n;i++){
            ball[i] = sc.nextInt()-1;
            pairs[ball[i]]++;
        }

        for(int i = 0;i < pairs.length;i++){
            if(pairs[i] >= 2)
                totalPair += pairs[i]*(pairs[i]-1)/2;
        }

        for(int i = 0;i < pairs.length;i++){
            long minus = 0;
            if(pairs[ball[i]] >= 2)
                minus = pairs[ball[i]]-1;
            System.out.println(totalPair - minus);
        }
    }
}
