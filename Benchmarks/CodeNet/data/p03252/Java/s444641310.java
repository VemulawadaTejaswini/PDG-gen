import java.util.*;

class Main{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        String s = sc.next();
        String t = sc.next();
        String ans = helper(s,t);
        System.out.println(ans);
    }
    static String helper(String s, String t){
        ArrayList<Integer>[] S = new ArrayList[26];
        ArrayList<Integer>[] T = new ArrayList[26];
        for(int i=0;i<26;i++){
            S[i]=new ArrayList<>();
            T[i]=new ArrayList<>();
        }
        for(int i=0;i<s.length();i++){
            S[s.charAt(i)-'a'].add(i);
            T[t.charAt(i)-'a'].add(i);
        }
        boolean[] used = new boolean[26];
        HashSet<Integer> check = new HashSet<>();
        for(int i=0;i<26;i++){
            for(int j=0;j<26;j++){
                if(used[j]) continue;
                if(solve(S[i],T[j])){
                    check.add(i);
                    used[j] = true;
                    break;
                }
            }
        }
        if(check.size()==26) return "Yes";
        else return "No";
    }
    static boolean solve(ArrayList<Integer> a, ArrayList<Integer> b){
        if(a.size()!=b.size()) return false;
        for(int i=0;i<a.size();i++){
            if(a.get(i)!=b.get(i)) return false;
        }
        return true;
    }
}
