import java.util.*;

class Main{
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        String s = sc.next();
        int length = s.length();
        int cnt = 0; //ATGC文字列の長さ
        int max = 0; //ATGC文字列の長さの最大
        String[] sArray = s.split("");//配列に1文字ずつ入れる
        for(int i = 0; i < length; i++)
        {
           if(sArray[i].equals("A") || sArray[i].equals("T") || sArray[i].equals("G") || sArray[i].equals("C"))
           {
                cnt++;
                max = Math.max(cnt,max);
           }else{
               cnt = 0;
           } 
        }
        System.out.println(max);
    }
}