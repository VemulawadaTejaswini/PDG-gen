import java.util.*;

class Main{

    void solve(){
        Scanner sc = new Scanner(System.in);

        while(true){
            int n = sc.nextInt();
            if(n==0) break;
            sc.nextLine();

            //time, IO(0,1), id
            PriorityQueue<int[]> q = new PriorityQueue<int[]>(10, new Comparator<int[]>(){
                    public int compare(int[] a, int[] b){
                        return a[0] - b[0];
                    }
                });

            ArrayList<Integer> idlist = new ArrayList<Integer>();

            for(int i=0; i<n; i++){
                String line = sc.nextLine();
                String s = "1" + line.substring(0,2) + line.substring(3,5)
                    + line.substring(6,8) + line.substring(9, 11);
                int io = 0;
                if(line.charAt(12)=='O') io = 1;
                int id = Integer.parseInt(line.substring(14,17));
                q.add(new int[]{Integer.parseInt(s), io, id});
                if(!idlist.contains(id) && id!=0) idlist.add(id);
            }

            int[] times = new int[idlist.size()];


            int[] start = new int[idlist.size()];
            while(q.size()>0){
                int[] qq = q.poll();
                int time = qq[0], in = qq[1], id = qq[2];
                if(in==0 && id!=0) start[idlist.indexOf(id)] = time;
                if(in==1 && id!=0) start[idlist.indexOf(id)] = 0;

                if(qq[2]!=0 || in!=0) continue;

            
                
                int out = 0;

                while(true){
                    int[] qqq = q.poll();
                    int time2 = qqq[0], in2 = qqq[1], id2 = qqq[2];
                    
                    if(id2==0){
                        out = time2;
                        break;
                    }
                    
                    int idx = idlist.indexOf(id2);
                    if(in2==0){
                        start[idx] = time2;
                    }else{
                        if(start[idx]==0){
                            times[idx] += getTime(time, time2);
                        }else{
                            times[idx] += getTime(Math.max(time, start[idx]), time2);
                            start[idx] = 0;
                        }
                    }
                }
                
                for(int i=0; i<idlist.size(); i++){
                    if(start[i]==0) continue;
                    times[i] += getTime(Math.max(time, start[i]), out);
                }
                
            }

            int max = 0;
            for(int i=0; i<idlist.size(); i++) max = Math.max(max, times[i]);

            System.out.println(max);
        }
    }

    int getTime(int t1, int t2){
        t1 %= 100000000;
        t2 %= 100000000;

        int m1 = t1 / 1000000, m2 = t2 / 1000000;
        int d1 = t1 / 10000 % 100, d2 = t2 / 10000 % 100;
        int h1 = t1 / 100 % 100, h2 = t2 / 100 % 100;
        int p1 = t1 % 100, p2 = t2 % 100;

        int day = 0;
        if(m1==m2) day = d2 - d1;
        else{
            if(m1==4 || m1==6 || m1==9 || m1==11) day = 30-d1;
            else if(m1!=2) day = 31 - d1;
            else day = 28 - d1;
            
            for(int i=m1+1; i<m2; i++){
                if(m1==4 || m1==6 || m1==9 || m1==11) day += 30;
                else if(m1!=2) day += 31;
                else day += 28;
            }
            day += d2-1;
        }

        int minutes = day * 24 * 60;
        if(m1==m2 && d1==d2) minutes = (h2*60+p2) - (h1*60+p1);
        else minutes += (24*60 - (h1*60+p1)) + (h2*60+p2);

        //System.out.println(t1+" "+t2+" "+day+" "+minutes);
        return minutes;
    }

    public static void main(String[] args){
        new Main().solve();
    }
}