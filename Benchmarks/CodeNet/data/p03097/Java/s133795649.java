import java.util.*;

public class Main {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int a = sc.nextInt();
        int b = sc.nextInt();

        if (bitc(a ^ b) % 2 == 0) {
            System.out.println("NO");
            return;
        }
        boolean[] flags = new boolean[1 << n];
        int[] counts = new int[n + 1];
        counts[0] = 1;
        for (int i = 1; i <= n; ++i) {
            long l = counts[i - 1];
            l *= (n - i + 1);
            l /= i;
            counts[i] = (int) l;
        }
        --counts[bitc(a)];
        flags[a] = true;
        ArrayList<Integer> answer = new ArrayList<>();
        answer.add(a);
        boolean yn = fall(a, b, bitc(a), bitc(b), n, flags, counts, answer);
        System.out.println(yn ? "YES" : "NO");
        StringBuilder sb = new StringBuilder();
        if (yn) {
            for (int s : answer) {
                sb.append(s);
                sb.append(" ");
            }
            System.out.println(sb.toString().substring(0, sb.length() - 1));
        }

    }

    static boolean fall(int now,int goal,int nowc,int goalc,int maxc,boolean[] flags,int[] counts,ArrayList<Integer> answer){
        if(nowc == 0)return up(now,goal,nowc,goalc,maxc,flags,counts,answer);
        else{
            int ni;
            for(int i = 0;i < nowc;++i){
                ni = remove(now,i);
                if(!flags[ni]){
                    if(ni != goal) {
                        flags[ni] = true;
                        --counts[nowc - 1];
                        answer.add(ni);
                        return fall(ni, goal, nowc - 1, goalc, maxc, flags, counts, answer);
                    }
                    else if(answer.size() == (1 << maxc) - 1){
                        flags[ni] = true;
                        --counts[nowc - 1];
                        answer.add(ni);
                        return true;
                    }
                }
            }
            return false;
        }
    }

    static boolean up(int now,int goal,int nowc,int goalc,int maxc,boolean[] flags,int[] counts,ArrayList<Integer> answer){
        if(nowc == maxc)return fill(now,goal,nowc,goalc,maxc,flags,counts,answer);
        else{
            int ni;
            for(int i = 0;i < maxc - nowc;++i){
                ni = set(now,i);
                if(!flags[ni]){
                    if(ni != goal) {
                        flags[ni] = true;
                        --counts[nowc + 1];
                        answer.add(ni);
                        return up(ni, goal, nowc + 1, goalc, maxc, flags, counts, answer);
                    }
                    else if(answer.size() == (1 << maxc) - 1){
                        flags[ni] = true;
                        --counts[nowc + 1];
                        answer.add(ni);
                        return true;
                    }
                }
            }
            return false;
        }
    }

    static boolean fill(int now,int goal,int nowc,int goalc,int maxc,boolean[] flags,int[] counts,ArrayList<Integer> answer){
        if(nowc == maxc){
            int ni;
            for(int i = 0;i < nowc;++i){
                ni = remove(now,i);
                if(!flags[ni] && ni != goal){
                    flags[ni] = true;
                    --counts[nowc - 1];
                    answer.add(ni);
                    return fill(ni,goal,nowc - 1,goalc,maxc,flags,counts,answer);
                }
            }
            return false;
        }
        else if(nowc >= goalc){
            if(counts[nowc + 1] > 0){
                int ni;
                for(int i = 0;i < maxc - nowc;++i){
                    ni = set(now,i);
                    if(!flags[ni]){
                        flags[ni] = true;
                        --counts[nowc + 1];
                        answer.add(ni);
                        return fill(ni,goal,nowc + 1,goalc,maxc,flags,counts,answer);
                    }
                }
            }
            if(counts[nowc - 1] > 0){
                int ni;
                for(int i = 0;i < nowc;++i){
                    ni = remove(now,i);
                    if(!flags[ni] && ni != goal){
                        flags[ni] = true;
                        --counts[nowc];
                        answer.add(ni);
                        return fill(ni,goal,nowc - 1,goalc,maxc,flags,counts,answer);
                    }
                }
            }
            return false;
        }
        else if(nowc > 0){
            if(counts[nowc + 1] > 1){
                int ni;
                for(int i = 0;i < maxc - nowc;++i){
                    ni = set(now,i);
                    if(!flags[ni] && goal != ni){
                        flags[ni] = true;
                        --counts[nowc + 1];
                        answer.add(ni);
                        return fill(ni,goal,nowc + 1,goalc,maxc,flags,counts,answer);
                    }
                }
            }
            if(counts[nowc - 1] > 1){
                int ni;
                for(int i = 0;i < nowc;++i){
                    ni = remove(now,i);
                    if(!flags[ni]){
                        flags[ni] = true;
                        --counts[nowc - 1];
                        answer.add(ni);
                        return fill(ni,goal,nowc - 1,goalc,maxc,flags,counts,answer);
                    }
                }
            }
            if(counts[nowc + 1] == 1 && counts[nowc - 1] == 1){
                int ni;
                for(int i = 0;i < nowc;++i){
                    ni = remove(now,i);
                    if(!flags[ni]){
                        flags[ni] = true;
                        --counts[nowc - 1];
                        answer.add(ni);
                        return last(ni,goal,nowc - 1,goalc,maxc,flags,counts,answer);
                    }
                }
            }
        }
        return false;
    }

    static boolean last(int now,int goal,int nowc,int goalc,int maxc,boolean[] flags,int[] counts,ArrayList<Integer> answer){
        for(int t = nowc;t < goalc;++t){
            int ni = -1;
            for(int i = 0;i < t;++i){
                ni = set(now,i);
                if(!flags[ni]){
                    flags[ni] = true;
                    --counts[t + 1];
                    answer.add(ni);
                    break;
                }
                else ni = -1;
            }
            if(ni == -1)return false;
        }
        return true;
    }

    static int set(int l,int p) {
        int s = 1;
        int r = 0;
        for (int i = 0; i < 31; ++i) {
            if ((l & s) == 0) {
                if (r == p) {
                    return l + s;
                }
                ++r;
            }
            s = s << 1;
        }
        return -1;
    }

    static int remove(int l,int p) {
        int s = 1;
        int r = 0;
        for (int i = 0; i < 31; ++i) {
            if ((l & s) == s) {
                if (r == p) {
                    return l - s;
                }
                ++r;
            }
            s = s << 1;
        }
        return -1;
    }

    static int bitc(int l){
        int s = 1;
        int r = 0;
        for(int i = 0;i < 31;++i){
            if((l & s) == s)++r;
            s = s << 1;
        }
        return r;
    }

}


