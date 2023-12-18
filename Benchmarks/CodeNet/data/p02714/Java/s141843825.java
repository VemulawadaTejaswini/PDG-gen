import java.util.*;
class Main{
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        String s = scanner.next();
        List<Integer> r = new ArrayList<>();
        List<Integer> g = new ArrayList<>();
        List<Integer> b = new ArrayList<>();
        for(int i = 0; i < n; i++){
            if(s.charAt(i) == 'R'){
                r.add(i);
            }else if(s.charAt(i) == 'G'){
                g.add(i);
            }else{
                b.add(i);
            }
        }
        int ans = 0;
        for(int i = 0; i < r.size(); i++){
            for(int j = 0; j < g.size(); j++){
                for(int k = 0; k < b.size(); k++){
                    if((g.get(j) - r.get(i)) != (b.get(k) - g.get(j))){
                        ans++;
                    }
                }
            }
        }
        System.out.println(ans);
    }
}

