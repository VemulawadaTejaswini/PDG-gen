import java.util.*;

class Main{

    void solve(){
        Scanner sc = new Scanner(System.in);

        while(true){
            int n = sc.nextInt();
            if(n==0) break;

            ArrayList<String> list = new ArrayList<String>();
            String[][] name = new String[n][10];
            for(int i=0; i<n; i++){
                String s = sc.next();                
                String[] line = s.split(":");
                list.add(line[0]);
                String[] line2 = line[1].substring(0,line[1].length()-1).split(",");
                for(int j=0; j<line2.length; j++) name[i][j] = line2[j];
            }

            HashSet<String> set1 = new HashSet<String>();
            HashSet<String> set2 = new HashSet<String>();
            Queue<String> q = new LinkedList<String>();
            for(int i=0; i<10; i++){
                if(name[0][i]!=null){
                    q.add(name[0][i]);
                }
            }

            while(q.size()>0){
                String po = q.poll();
                if(list.contains(po) && set2.add(po)){
                    for(int i=0; i<10; i++){
                        int idx = list.indexOf(po);
                        if(name[idx][i]!=null){
                            q.add(name[idx][i]);
                        }
                    }
                }else if(!list.contains(po)){
                    set1.add(po);
                }
            }

            System.out.println(set1.size());
        }
    }

    public static void main(String[] args){
        new Main().solve();
    }
}