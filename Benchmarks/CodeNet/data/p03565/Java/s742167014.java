import java.util.Scanner;

class Main {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        char[] s = sc.next().toCharArray();
        char[] t = sc.next().toCharArray();
        sc.close();
        int pos;
        for(int i=s.length-t.length;i>=0;i--){
            pos = 0;
            while(pos < t.length && (s[i+pos]==t[pos] || s[i+pos] =='?'))pos++;
            if(pos == t.length){
                printKey(i,s,t);
                return;
            }
        }

        System.out.print("UNRESTORABLE");
        System.out.flush();
    }
    public static void printKey(int pos,char[] s,char[] t){
        StringBuilder sb = new StringBuilder();
        
        for(int i=0;i<s.length;i++){
            if(i>=pos && i < pos+t.length){
                sb.append(t[i-pos]);
            }else if(s[i] == '?'){
                sb.append('a');
            }else {
                sb.append(s[i]);
            }
        }
        System.out.print(sb.toString());
    }
}