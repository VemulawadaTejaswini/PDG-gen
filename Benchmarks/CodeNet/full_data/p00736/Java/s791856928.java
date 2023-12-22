import java.util.*;

public class Main{

    String line;
    int[][] pqr;
    int idx,cnt;

    void solve(){
        Scanner sc = new Scanner(System.in);

        idx = 0;
        pqr = new int[27][3];
        getPQR(0,new int[3]);

        while(true){
            line = sc.next();
            if(line.equals(".")) break;

            cnt = 0;
            String line2 = line;
            LinkedList<Integer> left = new LinkedList<Integer>();
            for(int i=0; i<27; i++){
                line = line2;
                char[] c = line.toCharArray();
                for(int j=0; j<line.length(); j++){
                    if(c[j]=='P' || c[j]=='Q' || c[j]=='R'){
                        c[j] = (char)(pqr[i][c[j]-'P']+'0');
                    }
                    line = String.valueOf(c);
                }
                for(int j=0; j<line.length(); j++){
                    if(line.charAt(j)=='(') left.add(j);
                    if(line.charAt(j)==')'){
                        int l = left.pollLast();
                        String s = line.substring(l+1,j);
                        String front = line.substring(0,l);
                        String rear = "";
                        if(line.length()>=j+1) rear = line.substring(j+1,line.length());
                        String newS = getAns(s);
                        line = front + newS + rear;
                        j = j-(s.length()-newS.length())-2;
                    }
                }
                if(getAns(line).equals("2")) cnt++;
            }

            System.out.println(cnt);
        }
    }

    String getAns(String s){
        String x = "",y = "";
        boolean and = false,or = false;
        for(int i=0; i<s.length(); i++){
            if(s.charAt(i)=='*'){
                and = true;
                x = s.substring(0,i);
                y = s.substring(i+1,s.length());
            }else if(s.charAt(i)=='+'){
                or = true;
                x = s.substring(0,i);
                y = s.substring(i+1,s.length());
            }
        }

        if(and){
            return getAND(x,y);
        }else if(or){
            return getOR(x,y);
        }else{
            return String.valueOf(getNum(s));
        }
    }

    String getAND(String x,String y){
        int xx = getNum(x);
        int yy = getNum(y);
        return String.valueOf(Math.min(xx,yy));
    }

    String getOR(String x,String y){
        int xx = getNum(x);
        int yy = getNum(y);
        return String.valueOf(Math.max(xx,yy));
    }

    int getNum(String s){
        int ii = 0;
        while(s.charAt(ii)=='-') ii++;

        int n = Integer.parseInt(s.substring(ii,s.length()));
        for(int i=0; i<ii; i++) n = 2-n;

        return n;
    }

    void getPQR(int pos,int[] num){
        if(pos==3){
            for(int i=0; i<3; i++) pqr[idx][i] = num[i];
            idx++;
            return;
        }

        for(int i=0; i<3; i++){
            num[pos] = i;
            getPQR(pos+1,num);
        }
    }

    public static void main(String[] args){
        new Main().solve();
    }
}