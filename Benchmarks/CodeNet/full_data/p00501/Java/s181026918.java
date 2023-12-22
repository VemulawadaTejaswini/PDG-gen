import java.util.Scanner;
 
public class Main {
    static Scanner sc = new Scanner(System.in);
     
    static boolean search(String tar , String str){//２つの引数の文字列で看板が作れるかどうか判定するクラスメソッド
        boolean f = false;
        for(int j=0;j<str.length();j++){
            if(tar.equals(str))return true;
            if(tar.charAt(0)==str.charAt(j)){
                int cnt=0;
                for(int i=j+1;i<str.length();i++){
                    cnt++;
                    if(str.length()<j+cnt)continue;
                    if(tar.charAt(1)==str.charAt(i)){
                        if((j+tar.length()-1*cnt)>str.length())break;//
                        for(int k=2;k<tar.length();k++){
                            if(j+k*cnt>=str.length()){f=false;break;}//
                            if(tar.charAt(k)==str.charAt(j+k*cnt))f = true;
                            else {
                                f = false;
                                break;
                            }
                        }
                        if(f==true) return f;
                    }
                }
            }
        }       
        return f;
    }
     
    void doIt(){//クラス変数scに対しての操作を決めるメソッド
        int n = sc.nextInt();
        int ans = 0;
        String tar = sc.next();
        for(int i=0;i<n;++i){
            String s = sc.next();
            if(search(tar,s))ans++;
        }
        System.out.println(ans);
    }
 
    public static void main(String[] args) {
        new Main().doIt();
    }
 
}