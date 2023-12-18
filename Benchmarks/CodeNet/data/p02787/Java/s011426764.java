import java.util.*;
import java.io.*;
import java.math.*;
 
public class Main {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);
        int h = sc.nextInt();
        int n = sc.nextInt();
        int dp[] = new int[h+1];
        Arrays.fill(dp, 100000000);
        dp[0] = 0;
        List<Magic> li = new ArrayList<Magic>();
        for(int i = 0; i < n; i++){
            Magic tmp = new Magic();
            int a = sc.nextInt();
            int b = sc.nextInt();
            double c = (double)a/(double)b;
            tmp.setAtk(a);
            tmp.setMp(b);
            //tmp.setCp(c);
            li.add(tmp);
        }
        //li = li.stream().sorted(comparing(Magic::getCp).reversed()).collect(Collectors.toList());
        for (int i = 0; i <= h; ++i) {
            for (Magic m: li) {
                for(int j = 0; j <= m.getAtk(); j++){
                    int ind = Math.min(i+j,h); //体力最大値を超えない
                    dp[ind] = Math.min(dp[ind], dp[ind-j] + m.getMp());
                }
                /*
                if(m.getAtk() > i){
                    continue;
                }else if(m.getAtk() == i){
                    dp[m.getAtk()] = Math.min(dp[m.getAtk()], m.getMp());
                }else{
                    for(int j = 0; j < i-m.getAtk(); j++){
                        int ind = Math.min(m.getAtk()+j,h); //体力最大値を超えない
                        dp[ind] = Math.min(dp[ind], dp[ind-m.getAtk()] + m.getMp());
                    }
                }
                */
            }
            //System.out.println("i:" + i + "dp[i]:" +dp[i]);
        }
        System.out.println(dp[h]);
    }
}

class Magic{
    int atk;
    int mp;
    double cp;
    
    public int getAtk(){
        return this.atk;
    }
    public void setAtk(int a){
        this.atk = a;        
    }
    public int getMp(){
        return this.mp;
    }
    public void setMp(int m){
        this.mp = m;
    }
    public double getCp(){
        return this.cp;
    }
    public void setCp(double c){
        this.cp = c;
    }
}
 