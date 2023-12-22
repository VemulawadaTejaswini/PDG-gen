import java.util.*;

class Main{

    int n;
    String[] a, b;
    String start, goal;

    void solve(){
        Scanner sc = new Scanner(System.in);

        while(true){
            n = sc.nextInt();
            if(n==0) break;
            a = new String[n];
            b = new String[n];
            for(int i=0; i<n; i++){
                a[i] = sc.next();
                b[i] = sc.next();
            }
            start = sc.next();
            goal = sc.next();

            System.out.println(bfs());
        }
    }

    int bfs(){
        //pos, line
        Queue<String[]> q = new LinkedList<String[]>(); 
        HashSet<String> set = new HashSet<String>();
        q.add(new String[]{"0", start});
        set.add(start);

        while(q.size()>0){
            String[] qq = q.poll();
            int pos = Integer.parseInt(qq[0]);
            String line = qq[1];

            if(line.equals(goal)) return pos;

            for(int j=0; j<n; j++){
                StringBuffer sb = new StringBuffer();
                for(int i=0; i<line.length(); i++){
                    if(i+a[j].length()<=line.length() && a[j].equals(line.substring(i, i+a[j].length()))){
                        sb.append(b[j]);
                        i = i+a[j].length()-1;
                    }else sb.append(line.substring(i,i+1));
                }
                String newS = sb.toString();
                if(line.equals(newS) || !set.add(newS) || newS.length()>=101) continue;
                q.add(new String[]{String.valueOf(pos+1), newS});
            }
        }
        return -1;
    }

    public static void main(String[] args){
        new Main().solve();
    }
}