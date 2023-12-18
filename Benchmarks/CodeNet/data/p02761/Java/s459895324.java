import java.util.*;

public class Main {

    private static void nCombination3(int c) {
        int count = c;
        int num = 0;
        for (int i = 0; i < count - 2; i++) {
            for (int j = i + 1; j < count - 1; j++) {
                for (int k = j + 1; k < count; k++) {
                    num++;
                }
            }
        }
    }

    public static void main(String[] args) {
        // write your code here
        Scanner sc=new Scanner(System.in);
        int N=sc.nextInt(),M=sc.nextInt();
        Set[] set = new Set[N];
        for(int i=0;i<N;i++){
            set[i] = new HashSet<String>();
        }

        for(int i=0;i<M;i++){
            int s=sc.nextInt();
            String c=sc.next();
            set[s-1].add(c);
        }

        boolean flag = true;
        String ans = "";
        for(int i=0;i<N;i++){
            String f = "0";
            if(set[i].size()==1){
                for (Iterator<String> it = set[i].iterator(); it.hasNext(); ) {
                    f = it.next();
                }
                ans+=f;
            }else if(set[i].size()==0){
                ans+=f;
            }else{
                flag=false;
                break;
            }
        }
        if(set[0].size()!=1||ans.substring(0,1).equals("0")&&ans.length()>1){
            flag = false;
        }
        if(flag){
            System.out.println(ans);
        }else{
            System.out.println(-1);
        }


    }
}
