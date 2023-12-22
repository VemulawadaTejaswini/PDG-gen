import java.util.*;

class Main{

    void solve(){
        Scanner sc = new Scanner(System.in);

        while(true){
            char[] line = sc.next().toCharArray();
            if(line[0]=='0' && line[1]=='0' && line[2]=='0' && line[2]=='0') break;
            int cnt = 0;
            String newn = String.valueOf(line);
            while(true){
                if(line[0]==line[1] && line[1]==line[2] && line[2]==line[3]){
                    System.out.println("NA");
                    break;
                }
                if(newn.equals("6174")){
                    System.out.println(cnt);
                    break;
                }
                Arrays.sort(line);
                int n1 = 0;
                int n2 = 0;
                int ten = 1000;
                for(int i=0; i<4; i++){
                    n1 += (line[i]-'0') * ten;
                    n2 += (line[line.length-1-i]-'0') * ten;
                    ten /= 10;
                }
                
                newn = String.valueOf(n2 - n1);
                while(newn.length()!=4) newn = "0" + newn;
                line = newn.toCharArray();
                cnt++;
            }
        }
    }

    public static void main(String[] args){
        new Main().solve();
    }
}