import java.util.*;

class Main{

    void solve(){
        Scanner sc = new Scanner(System.in);

        while(true){
            int n = sc.nextInt(), k = sc.nextInt();
            if(n==0 && k==0) break;
            int[] card = new int[k];
            for(int i=0; i<k; i++){
                card[i] = sc.nextInt();
            }
            Arrays.sort(card);

            LinkedList<Integer> list = new LinkedList<Integer>();
            boolean boo = false;
            int begin = -1, end = -1;
            for(int i=0; i<k; i++){
                if(card[i]==0){
                    boo = true;
                    continue;
                }
                if(begin==-1){
                    begin = card[i];
                    end = card[i];
                }else if(end==card[i]-1){
                    end = card[i];
                }else{
                    list.add(new Integer(begin));
                    list.add(new Integer(end));
                    begin = card[i];
                    end = card[i];
                }
            }
            if(begin!=-1){
                list.add(new Integer(begin));
                list.add(new Integer(end));
            }

            int maxLen = 0;
            if(!boo){
                for(int i=0; i<list.size(); i++){
                    int n1 = list.poll();
                    int n2 = list.poll();
                    maxLen = Math.max(maxLen, n2-n1+1);
                }
            }else{
                int n1 = list.poll();
                int n2 = list.poll();
                for(int i=0; i<list.size(); i++){
                    int n3 = list.poll();
                    int n4 = list.poll();
                    if(n2==n3-2) maxLen = Math.max(maxLen, n4-n1+1);
                    n1 = n3;
                    n2 = n4;
                }
            }
            System.out.println(maxLen);
        }
    }

    public static void main(String[] args){
        new Main().solve();
    }
}