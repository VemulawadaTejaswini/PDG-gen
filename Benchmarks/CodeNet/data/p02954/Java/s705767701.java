import java.util.*;
import java.util.Scanner;

class Main {

    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        final String S = sc.nextLine();
        final int N = S.length();
        char[] seq = S.toCharArray();
        int[] ans = new int[N];

        ArrayList<Integer> RL = new ArrayList<Integer>();
        ArrayList<Integer> LR = new ArrayList<Integer>();

        // RL.add(0);
        int left = -1;

        for(int i=0;i<N-1;i++){
            if(seq[i] == 'R' && seq[i+1] == 'L'){
                ans[i] += (i-left)/2+(i-left)%2;
                ans[i+1] += (i-left)/2;
                left = i; 
                // RL.add(i);
            }else if(seq[i] == 'L' && seq[i+1] == 'R'){
                // LR.add(i);
                ans[left] += (i-left)/2;
                ans[left+1] += (i-left)/2+(i-left)%2;
                left = i;
            }
        }        
        ans[left] += (N-1-left)/2;
        ans[left+1] += (N-1-left)/2+(N-1-left)%2;
        left = N-1;


        // ans[RL.get(0)]+=RL.get(0)/2+RL.get(0)%2;
        // ans[RL.get(0)+1]+=RL.get(0)/2;



        // for(int i=1;i<RL.size();i++){
        //     int left = RL.get(0);
        //     int right = LR.get(0);

        //     ans[right]
        // }
        for(int i=0;i<N;i++){
            System.out.print(ans[i]+" ");
        }
        System.out.println();
    }
}