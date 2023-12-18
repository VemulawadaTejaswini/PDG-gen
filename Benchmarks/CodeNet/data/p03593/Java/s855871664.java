import java.util.*;

class Main{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int H = sc.nextInt();
        int W = sc.nextInt();
        int[] cnt = new int[26];
        for(int i=0;i<H;i++){
            String s = sc.next();
            for(char w:s.toCharArray()) cnt[w-'a']++;
        }
        int[] rec= new int[4];
        for(int w:cnt) rec[w%4]++;
        String ans = help(W,H,rec);
        System.out.println(ans);
    }
    static String help(int W, int H, int[] rec){
        boolean flag = false;
        if(W%2==0&&H%2==0){
            flag = rec[0]==26;
        } else if(W%2==1&&H%2==1){
            if(rec[1]>=2) return "No";
            if(rec[1]+rec[3]>=2||rec[1]+rec[3]<1) return "No";
            if(rec[1]==1) flag = rec[2]<=(H+W-2)/2&&rec[2]>=(H+W-2)%4/2;
            else flag = rec[2]<=(H+W-4)/2&&rec[2]>=(Math.max(0,H+W-4))%4/2;
        } else{
            int n = W%2==1?H:W;
            flag = rec[1]==0&&rec[3]==0&&rec[2]<=n/2;
        }
        return flag?"Yes":"No";
    }
}
