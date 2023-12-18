import java.util.*;

public class Main{
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        int m = scan.nextInt();

        int [] pp = new int[m];
        int [] yy = new int[m];

        ArrayList<ArrayList<Integer>> a = new ArrayList<ArrayList<Integer>>();
        for (int i=0;i<n;i++){
            ArrayList<Integer> bb = new ArrayList<Integer>();
            a.add(bb);
        }

        int[] b = new int[n];
        for (int i=0;i<m;i++){
            int p = scan.nextInt();
            int y = scan.nextInt();
            yy[i] = y;
            pp[i] = p;
            int l = p-1;
            ArrayList<Integer> kk = a.get(l);
            if (kk.size() == 0){
                kk.add(y);
            }
            else if (y<kk.get(0)){
                kk.add(0,y);
            }
            else if (y > kk.get(kk.size()-1)){
                kk.add(y);
            }
            else{
                int position = search(kk,y,0,kk.size()-1);
                kk.add(position-1,y);
            }
            b[l] += 1;
        }

        for (int j=0;j<m;j++){
            int p = pp[j];
            int y = yy[j];
            ArrayList<Integer> s = a.get(p-1);
            int po = search(s,y,0,s.size()-1);

            String g = po+"";
            String k = p+"";
            int a1 = 6;
            int a2 = 6;
            a1 -= k.length();
            a2 -= g.length();

            for (int mm = 0;mm<a1;mm++){
                System.out.print("0");
            }
            System.out.print(k);
            for (int mm = 0;mm<a2;mm++){
                System.out.print("0");
            }
            System.out.println(g);                         
        }
    }

    static int search(ArrayList<Integer> a, int b, int start, int end){
        if (start >= end){
            return end+1;
        }

        int mid = (int) (start+end+1)/2;
        int check = (int) a.get(mid);
        if (check == b){
            return mid+1;
        }
        if (check > b){
            end = mid-1;
        }
        else{
            start = mid+1;
        }
        int ret = search(a,b,start,end);
        return ret;
    }
}