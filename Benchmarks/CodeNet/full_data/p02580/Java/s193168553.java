import java.awt.*;
import java.io.*;
import java.net.StandardSocketOptions;
import java.util.*;

public class Main {
    Scanner sc = new Scanner(System.in);
    public static void main(String[] args){
        new Main();
    }
    public Main(){
        new TestE().doIt();
    }
    class TestE{
        void doIt() {
            int H = sc.nextInt();
            int W = sc.nextInt();
            int M = sc.nextInt();
            int arrayH[] = new int[H+1];
            int arrayW[] = new int[W+1];
            TreeSet<String> ts = new TreeSet<String>();
            for(int i = 0;i < M;i++) {
                int HM = Integer.parseInt(sc.next());
                int WM = Integer.parseInt(sc.next());
                String str = HM+","+WM;
                arrayH[HM]++;
                arrayW[WM]++;
                ts.add(str);
            }
            int maxH = 0;
            int maxW = 0;
            for(int i = 0;i <= H;i++) {
                maxH = Math.max(arrayH[i],maxH);
            }
            for(int i = 0;i <= W;i++) {
                maxW = Math.max(arrayW[i],maxW);
            }
            ArrayList<Integer> aH = new ArrayList<Integer>();
            ArrayList<Integer> aW = new ArrayList<Integer>();
            for(int i = 0;i <= H;i++) {
                if(arrayH[i] == maxH)aH.add(i);
            }
            for(int i = 0;i <= W;i++) {
                if(arrayW[i] == maxW)aW.add(i);
            }
            int cc = 1;
            for(int i = 0;i < aH.size();i++) {
                for(int j = 0;j < aW.size();j++) {
                    int cnt = 0;
                    if(cc == 0)break;
                    String str = aH.get(i)+","+aW.get(j);
                    if(ts.contains(str)) {
                        cnt++;
                    }
                    cc = cnt;
                }
            }
            int ans = maxH+maxW-cc;
            System.out.println(ans);
        }
    }
}