import java.util.*;

public class Main{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        String s = sc.next();

        char[] c = s.toCharArray();

        int[] a = new int[c.length+1];

        long ans = 0;

        if (s.length()==1){
            System.out.println(1);
            return;
        }

//        List<Integer> list = new ArrayList<>();

        if (c[0]=='<') {
            a[1] = 1;
            for (int i=1; i<c.length; i++){
                if (c[i]=='<'){
                    a[i+1] = a[i]+1;
                }else {
                    break;
                }
            }
        }

        if (c[c.length-1]=='>'){
            a[a.length-2] = 1;
            for (int i=c.length-2; i>=0; i--){
                if (c[i]=='>'){
                    a[i] = a[i+1]+1;
                }else {
                    break;
                }
            }
        }

        for (int i=0; i<c.length-1; i++) {
            if (c[i] == '>' && c[i + 1] == '<') {
                a[i] = 1;
                a[i + 2] = 1;
            }
        }

        for (int i=0; i<c.length-1; i++){
            if (c[i]=='>' && c[i+1]=='<'){
//                a[i] = 1;
//                a[i+2] = 1;
            }else if (c[i]=='<' && c[i+1]=='<'){
                a[i+1] = a[i]+1;
                a[i+2] = a[i+1]+1;
            }else if (c[i]=='>' && c[i+1]=='>'){
                a[i+1] = a[i+2]+1;
                if (a[i]<a[i+1]+1){
                    a[i] = a[i+1]+1;
                }
            }
        }

        for (int i=0; i<a.length; i++){
            ans += a[i];
        }

        System.out.println(ans);
    }
}